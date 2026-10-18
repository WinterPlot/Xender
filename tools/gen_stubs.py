#!/usr/bin/env python3
"""Iteratively generates compile-level stubs for classes referenced by the decompiled XShare tree but
missing from it.  It drives javac (no Android SDK needed: android.*/java.* noise is ignored), reads the
"cannot find symbol" family of diagnostics, and (re)writes stub sources into app/src/stubs/java.

usage: gen_stubs.py <project-root>   (the folder that contains app/)
"""
import json, os, re, subprocess, sys, collections

ROOT = os.path.abspath(sys.argv[1])
MAIN = os.path.join(ROOT, 'app/src/main/java')
STUB = os.path.join(ROOT, 'app/src/stubs/java')
REG = os.path.join(ROOT, 'tools/stub_registry.json')
OUT = os.environ.get('GEN_OUT', '/tmp/gen_stub_out')
EXT = ('android.', 'java.', 'javax.', 'org.w3c', 'org.xml', 'org.json', 'dalvik.', 'org.apache.http',
       'junit.', 'sun.', 'libcore.', 'com.android.', 'jdk.', 'org.xmlpull', 'org.ietf', 'org.omg')
PRIMS = {'int', 'long', 'short', 'byte', 'char', 'boolean', 'float', 'double', 'void'}


def load_reg():
    if os.path.exists(REG):
        return json.load(open(REG))
    return {}


def save_reg(r):
    json.dump(r, open(REG, 'w'), indent=1, sort_keys=True)


def src_files():
    fs = []
    for base in (MAIN, STUB):
        for dp, _, names in os.walk(base):
            for n in names:
                if n.endswith('.java'):
                    fs.append(os.path.join(dp, n))
    return fs


def run_javac(fs):
    lst = os.path.join(OUT, 'files.txt')
    os.makedirs(OUT, exist_ok=True)
    open(lst, 'w').write('\n'.join(fs))
    base = ['javac', '-XDshould-stop.ifError=FLOW', '-proc:none', '-nowarn', '-Xmaxerrs', '1000000', '-Xmaxwarns', '0', '-d', os.path.join(OUT, 'cls'), '@' + lst]
    os.makedirs(os.path.join(OUT, 'cls'), exist_ok=True)
    env = dict(os.environ, JAVA_TOOL_OPTIONS='')
    raw = subprocess.run(base[:1] + ['-XDrawDiagnostics'] + base[1:], capture_output=True, text=True, env=env).stderr
    norm = subprocess.run(base, capture_output=True, text=True, env=env).stderr
    return raw, norm


def parse(raw, norm):
    rawd = [l for l in raw.split('\n') if re.match(r'\S+\.java:\d+:\d+: compiler\.err', l)]
    nd = []
    for l in norm.split('\n'):
        m = re.match(r'(\S+\.java):(\d+): error:', l)
        if m:
            nd.append((m.group(1), int(m.group(2))))
    out = []
    if len(rawd) != len(nd):
        print('warn: diag count mismatch', len(rawd), len(nd))
    for r, (path, line) in zip(rawd, nd):
        m = re.match(r'(\S+\.java):(\d+):(\d+): (compiler\.err\.[\w.\-]+)(?:: (.*))?$', r)
        if not m or int(m.group(2)) != line:
            continue
        out.append((path, line, int(m.group(3)), m.group(4), m.group(5) or ''))
    return out


def split_args(s):
    """split top-level comma separated javac raw args (respecting () and <>)"""
    parts, d, cur = [], 0, ''
    for ch in s:
        if ch in '(<':
            d += 1
        elif ch in ')>':
            d -= 1
        if ch == ',' and d == 0:
            parts.append(cur.strip()); cur = ''
        else:
            cur += ch
    parts.append(cur.strip())
    return parts


_fc = {}


def fileinfo(path):
    if path not in _fc:
        p = path
        s = open(p, errors='ignore').read()
        m = re.search(r'^package ([\w.]+);', s, re.M)
        pkg = m.group(1) if m else ''
        ims = re.findall(r'^import\s+(static\s+)?([\w.$]+?)(\.\*)?;', s, re.M)
        _fc[path] = (pkg, ims, s.split('\n'))
    return _fc[path]


def resolve_simple(path, name, intree):
    pkg, ims, _ = fileinfo(path)
    for st, i, star in ims:
        if not star and not st and i.split('.')[-1] == name:
            return i
    for st, i, star in ims:
        if star and i.startswith(EXT):
            return None  # may be an SDK class via wildcard
    if not pkg:
        return None
    return pkg + '.' + name


def strip_generics(t):
    d, o = 0, ''
    for ch in t:
        if ch == '<':
            d += 1
        elif ch == '>':
            d -= 1
        elif d == 0:
            o += ch
    return o.strip()


def count_args(txt, start):
    """txt[start] == '(' ; returns (arity, end_index) with nesting/string awareness"""
    d, i, n, has = 0, start, 0, False
    instr = None
    while i < len(txt):
        ch = txt[i]
        if instr:
            if ch == '\\':
                i += 1
            elif ch == instr:
                instr = None
        elif ch in '"\'':
            instr = ch; has = True
        elif ch in '([{<' and not (ch == '<' ):
            d += 1
            if d > 1: has = True
        elif ch in ')]}':
            d -= 1
            if d == 0:
                return (n + 1 if has else 0), i
        elif ch == ',' and d == 1:
            n += 1
        elif not ch.isspace() and d >= 1:
            has = True
        i += 1
    return None, i


def refine_ret(meth, path, src, name):
    t = typed_from_assignment(path, src, name)
    if t and meth['ret'] in ('Object', 'void') and t != meth['ret']:
        meth['ret'] = t
        return 1
    return 0


FIELD_VALUES = {'PLATFORM_ANDROID': 'android', 'PLATFORM_IOS': 'ios'}


def scan_usage(reg):
    """Source-level member discovery for stubs: ((Stub) x).m(a,b), Stub.m(a), Stub.CONST"""
    simple = collections.defaultdict(list)
    for fq in reg:
        if reg[fq]['kind'] in ('class', 'interface') and fq.count('.') >= 1:
            simple[fq.split('.')[-1]].append(fq)
    added = 0
    for f in src_files():
        if f.startswith(STUB):
            continue
        pkg, ims, lines = fileinfo(f)
        imported = {i.split('.')[-1]: i for st, i, star in ims if not star}
        for ln, src in enumerate(lines):
            if not src.strip() or src.lstrip().startswith(('import ', '*', '/*', '//')):
                continue
            for nm, fqs in simple.items():
                if nm not in src:
                    continue
                if nm in imported:
                    fq = imported[nm] if imported[nm] in reg else None
                else:
                    fq = pkg + '.' + nm if (pkg + '.' + nm) in reg else None
                if not fq:
                    continue
                st = reg[fq]
                # instance: ((Name) expr).method(
                for m in re.finditer(r'\(\(' + re.escape(nm) + r'\)\s*[\w.$\[\]()]+?\)\.([\w$]+)\(', src):
                    ar, _ = count_args(src, m.end() - 1)
                    if ar is None:
                        continue
                    key = '%s/%d/i' % (m.group(1), ar)
                    if key not in st['methods']:
                        st['methods'][key] = {'ret': ret_from_context(src, m.group(1), lines, ln + 1), 'params': ['Object'] * ar, 'static': False, 'name': m.group(1)}
                        added += 1
                    added += refine_ret(st['methods'][key], f, src, m.group(1))
                # static: Name.method(
                for m in re.finditer(r'(?<![\w.])' + re.escape(nm) + r'\.([\w$]+)\(', src):
                    ar, _ = count_args(src, m.end() - 1)
                    if ar is None:
                        continue
                    key = '%s/%d/s' % (m.group(1), ar)
                    if key not in st['methods'] and ('%s/%d/i' % (m.group(1), ar)) not in st['methods']:
                        st['methods'][key] = {'ret': ret_from_context(src, m.group(1), lines, ln + 1), 'params': ['Object'] * ar, 'static': True, 'name': m.group(1)}
                        added += 1
                    if key in st['methods']:
                        added += refine_ret(st['methods'][key], f, src, m.group(1))
                for m in re.finditer(r'(?<![\w.])' + re.escape(nm) + r'\.([A-Z][A-Z0-9_]+)\b(?!\()', src):
                    if m.group(1) not in st['fields']:
                        st['fields'][m.group(1)] = {'type': 'String', 'static': True, 'value': FIELD_VALUES.get(m.group(1), '')}
                        added += 1
    return added


def main():
    reg = load_reg()
    rounds = int(os.environ.get('ROUNDS', '8'))
    for rd in range(rounds):
        # write stubs
        scan_usage(reg)
        write_stubs(reg)
        fs = src_files()
        raw, norm = run_javac(fs)
        diags = parse(raw, norm)
        print('round', rd, 'diagnostics', len(diags), 'stubs', len(reg))
        # real (non-stub, non-ext) in-tree class set
        intree = set()
        for f in fs:
            base = STUB if f.startswith(STUB) else MAIN
            intree.add(os.path.relpath(f, base)[:-5].replace('/', '.'))
        changed = 0
        for path, line, col, code, args in diags:
            changed += handle(reg, intree, path, line, col, code, args)
        save_reg(reg)
        print('  changes', changed)
        if not changed:
            break
    write_stubs(reg)


def exists_fq(fq, intree, reg):
    return fq in intree or fq in reg


ANNOTATIONS = {
    'kotlin.Metadata': ['int[] mv() default {}', 'int k() default 1', 'int xi() default 0', 'String[] d1() default {}',
                        'String[] d2() default {}', 'String pn() default ""', 'int[] bv() default {}'],
    'org.jetbrains.annotations.NotNull': ['String value() default ""'],
    'org.jetbrains.annotations.Nullable': ['String value() default ""'],
    'org.checkerframework.dataflow.qual.Pure': [],
    'org.checkerframework.dataflow.qual.SideEffectFree': [],
    'org.checkerframework.checker.nullness.qual.EnsuresNonNull': ['String[] value() default {}'],
}
ENUMS = {'kotlin.reflect.KVisibility': ['PUBLIC', 'PROTECTED', 'INTERNAL', 'PRIVATE'],
         'kotlin.text.RegexOption': ['IGNORE_CASE', 'MULTILINE', 'LITERAL', 'UNIX_LINES', 'COMMENTS', 'DOT_MATCHES_ALL', 'CANON_EQ'],
         'kotlin.time.DurationUnit': ['NANOSECONDS', 'MICROSECONDS', 'MILLISECONDS', 'SECONDS', 'MINUTES', 'HOURS', 'DAYS'],
         'kotlin.LazyThreadSafetyMode': ['SYNCHRONIZED', 'PUBLICATION', 'NONE'],
         'org.apache.commons.io.IOCase': ['SENSITIVE', 'INSENSITIVE', 'SYSTEM'],
         'org.apache.commons.io.file.StandardDeleteOption': ['OVERRIDE_READ_ONLY']}


def add_class(reg, fq, kind='class'):
    if fq in SKIP:
        return 0
    if fq in ANNOTATIONS:
        kind = 'annotation'
    elif fq in ENUMS:
        kind = 'enum'
    if fq not in reg:
        ext = None
        simple = fq.split('.')[-1]
        if fq.startswith('com.userlabs.') and kind == 'class':
            if simple.endswith('Activity') or simple.endswith('Activity2'):
                ext = 'android.app.Activity'
            elif simple.endswith('Service'):
                ext = 'android.app.Service'
            elif simple.endswith('Fragment'):
                ext = 'androidx.fragment.app.Fragment'
            elif simple.endswith('View') :
                ext = 'android.view.View'
        reg[fq] = {'kind': kind, 'tp': 0, 'methods': {}, 'fields': {}, 'extends': ext, 'implements': []}
        return 1
    return 0


def kind_from_context(path, line, col):
    _, _, lines = fileinfo(path)
    text = ' '.join(lines[max(0, line - 3):line])
    # restrict to text up to the error column on the last line
    prefix = '\n'.join(lines[max(0, line - 3):line - 1] + [lines[line - 1][:col - 1]])
    m = list(re.finditer(r'\b(extends|implements)\b', prefix))
    if m and re.search(r'\b(class|interface|enum)\b', prefix[:m[-1].start()][-300:]) and '{' not in prefix[m[-1].end():]:
        if m[-1].group(1) == 'implements':
            return 'interface'
        head = prefix[:m[-1].start()]
        if re.search(r'\binterface\s+\w+(<[^{]*>)?\s*$', head):
            return 'interface'
        return 'class'
    return None


def handle(reg, intree, path, line, col, code, args):
    a = split_args(args) if args else []
    ch = 0
    if code in ('compiler.err.cant.resolve.location', 'compiler.err.cant.resolve') and a and a[0] == 'kindname.class':
        name = a[1]
        loc = args.split('(compiler.misc.location', 1)[1] if '(compiler.misc.location' in args else ''
        fq = None
        if loc and 'kindname.class' in loc.split(',')[0] + loc.split(',')[1][:0]:
            # qualified reference Outer.name where Outer is a generated stub -> nested stub
            lq = split_args(loc.split(':', 1)[1].rstrip(')'))
            outer = strip_generics(lq[1]) if len(lq) > 1 else ''
            _, _, lines = fileinfo(path)
            if outer in reg and col >= 2 and lines[line - 1][col - 2:col - 1] == '.':
                fq = outer + '.' + name
                return add_class(reg, fq, 'class') if fq not in reg else 0
        if 'kindname.package' in loc.split(',')[0] if loc else False:
            pkgn = split_args(loc.split(':', 1)[1])[1]
            fq = pkgn + '.' + name
        else:
            fq = resolve_simple(path, name, intree)
        if not fq or fq.startswith(EXT) or exists_fq(fq, intree, reg):
            return 0
        if len(name) == 1 and name.isupper():
            return 0
        k = kind_from_context(path, line, col) or 'class'
        ch += add_class(reg, fq, k)
        if ch and k == 'interface':
            pass
        return ch
    if code == 'compiler.err.doesnt.exist' and a and re.fullmatch(r'\w+', a[0] or ''):
        nm = a[0]
        fq = resolve_simple(path, nm, intree)
        if fq and not fq.startswith(EXT) and not exists_fq(fq, intree, reg) and not (len(nm) == 1 and nm.isupper()) and nm not in ('R', 'super', 'this', 'defpackage'):
            _, _, lines = fileinfo(path)
            if re.search(r'(?<![\w.])' + re.escape(nm) + r'\.', lines[line - 1]):
                return add_class(reg, fq, 'class')
        return 0
    if code == 'compiler.err.doesnt.exist':
        pk = a[0] if a else ''
        _, _, lines = fileinfo(path)
        m = re.match(r'\s*import\s+(?:static\s+)?([\w.$]+?)(?:\.\*)?;', lines[line - 1])
        if m and not pk.startswith(EXT):
            full = m.group(1)
            if full.rsplit('.', 1)[0] == pk and not lines[line - 1].strip().endswith('*;'):
                if not exists_fq(full, intree, reg):
                    return add_class(reg, full, 'class')
        return 0
    if code == 'compiler.err.wrong.number.type.args':
        _, _, lines = fileinfo(path)
        src = lines[line - 1]
        if src[col - 1:col] == '<':
            mm = re.search(r'(\w+)\s*$', src[:col - 1])
            if not mm:
                return 0
            m = type('M', (), {'group': lambda self, k, _n=mm.group(1): _n, 'end': lambda self: 1})()
        else:
            m = re.match(r'(\w+)\s*<', src[col - 1:]) or re.match(r'[\w.]*?(\w+)\s*<', src[col - 1:])
        if not m:
            return 0
        rest = src[col - 1 + m.end():] if src[col - 1:col] != '<' else src[col:]
        d, n, i = 1, 1, 0
        while i < len(rest) and d > 0:
            if rest[i] == '<': d += 1
            elif rest[i] == '>': d -= 1
            elif rest[i] == ',' and d == 1: n += 1
            i += 1
        fq = resolve_simple(path, m.group(1), intree)
        if fq in reg and reg[fq]['tp'] != n:
            reg[fq]['tp'] = n
            return 1
        return 0
    if code == 'compiler.err.type.doesnt.take.params':
        fq = a[0]
        if fq in reg:
            reg[fq]['tp'] += 1
            return 1
        return 0
    if code in ('compiler.err.cant.resolve.location.args', 'compiler.err.cant.resolve.args', 'compiler.err.cant.resolve.location') and a and a[0] in ('kindname.method', 'kindname.variable'):
        if '(compiler.misc.location' not in args:
            return 0
        loc = args.split('(compiler.misc.location', 1)[1]
        la = split_args(loc.split(':', 1)[1].rstrip(')'))
        # location: kindname.class, pkg.X, null   OR location.1: kindname.variable, v, type
        if loc.startswith('.1'):
            target = strip_generics(la[2]) if len(la) > 2 else ''
        else:
            target = strip_generics(la[1]) if len(la) > 1 else ''
        if target not in reg:
            return 0
        s = reg[target]
        if s['kind'] in ('annotation', 'enum'):
            return 0
        name = a[1]
        _, _, lines = fileinfo(path)
        src = lines[line - 1]
        if a[0] == 'kindname.method':
            argtypes = [x for x in split_args(a[3]) if x] if len(a) > 3 and a[3] else []
            simple = target.split('.')[-1]
            static = bool(re.search(r'\b' + re.escape(simple) + r'\.' + re.escape(name) + r'\s*\(', src))
            key = '%s/%d/%s' % (name, len(argtypes), 's' if static else 'i')
            if key in s['methods']:
                return 0
            ret = ret_from_context(src, name, lines, line)
            s['methods'][key] = {'ret': ret, 'params': ['Object'] * len(argtypes), 'static': static, 'name': name}
            return 1
        else:
            if name in s['fields']:
                return 0
            simple = target.split('.')[-1]
            static = bool(re.search(r'\b' + re.escape(simple) + r'\.' + re.escape(name) + r'\b', src))
            s['fields'][name] = {'type': 'String' if name.isupper() else 'Object', 'static': static}
            return 1
    if code == 'compiler.err.intf.expected.here':
        pass
    if code == 'compiler.err.no.intf.expected.here':
        pass
    if code == 'compiler.err.method.does.not.override.superclass':
        return handle_override(reg, intree, path, line, col)
    return 0


def typed_from_assignment(path, src, name):
    """'Gson gson = X.name(' or '(Type) X.name(' -> fully qualified Type, else None"""
    pkg, ims, _ = fileinfo(path)
    m = re.search(r'\(([A-Za-z_][\w.]*)\)\s*(?:\(\([\w.]+\)\s*\w+\)|[\w.]+)\.' + re.escape(name) + r'\(', src)
    t = m.group(1) if m else None
    if not t:
        m = re.match(r'\s*(?:final\s+)?([A-Za-z_][\w.]*)(?:<[^=]*>)?\s+\w+\s*=\s*(?:[\w.]+\.)?' + re.escape(name) + r'\(', src)
        t = m.group(1) if m else None
    if not t or t in ('return', 'var', 'new', 'else'):
        return None
    if t in PRIMS or t in ('String', 'Object'):
        return t
    if t == 'Integer' or t == 'Long' or t == 'Boolean' or t.startswith('java.'):
        return t
    for st, i, star in ims:
        if not star and not st and i.split('.')[-1] == t:
            return i
    if '.' in t:
        return t
    return None


def ret_from_context(src, name, lines, line):
    m = re.search(r'\breturn\s+(\(\w+\)\s*)?[^;]*\b' + re.escape(name) + r'\(', src)
    if m:
        # find enclosing method return type
        for k in range(line - 1, max(0, line - 60), -1):
            mm = re.match(r'\s*(?:public|private|protected)?\s*(?:static\s+|final\s+|synchronized\s+|abstract\s+)*(?:<[^>]*>\s*)?([\w.<>\[\]?, ]+?)\s+\w+\s*\([^;]*\)\s*(?:throws [\w., ]+)?\s*\{\s*$', lines[k])
            if mm and not mm.group(1).strip() in ('new', 'else', 'return', 'throw'):
                t = mm.group(1).strip()
                if t in PRIMS or t in ('String', 'Object'):
                    return t
                return 'Object'
        return 'Object'
    if re.match(r'\s*(?:\(\([\w.<>]+\)\s*\w+\)|\w+)\.' + re.escape(name) + r'\(.*\);\s*$', src) or re.match(r'\s*[\w.]*' + re.escape(name) + r'\(.*\);\s*$', src):
        return 'void'
    return 'Object'


def handle_override(reg, intree, path, line, col):
    _, _, lines = fileinfo(path)
    # method declaration follows the annotation line
    raw_txt = '\n'.join(lines[line - 1:line + 4])
    chain = re.match(r'\s*@Override\s*//\s*(.*)', lines[line - 1])
    txt = ' '.join(re.sub(r'//.*$|/\*.*?\*/', '', l).strip() for l in lines[line - 1:line + 4])
    m = re.search(r'@Override[^\n]*?\s+(?:(?:public|protected|private|static|final|synchronized|abstract)\s+)*(<[^>]*>\s*)?([\w.<>\[\]?, ]+?)\s+(\w+)\s*\(([^)]*)\)', txt)
    if not m:
        return 0
    ret, name, params = m.group(2).strip(), m.group(3), m.group(4).strip()
    plist = []
    if params:
        for p in split_args(params):
            p = re.sub(r'\bfinal\s+', '', p)
            ty = p.rsplit(' ', 1)[0].strip()
            plist.append(ty)
    # enclosing class's supertypes
    pkg, ims, _ = fileinfo(path)
    head = '\n'.join(lines[:line])
    cm = None
    for cm in re.finditer(r'\b(?:class|interface)\s+(\w+)(?:<[^{]*?>)?(?:\s+extends\s+([^{]+?))?(?:\s+implements\s+([^{]+?))?\s*\{', head):
        pass
    if not cm:
        return 0
    sups = []
    for grp in (cm.group(2), cm.group(3)):
        if grp:
            sups += [strip_generics(x) for x in split_args(grp)]
    changed = 0
    for sname in sups:
        fq = None
        for st, i, star in ims:
            if not star and i.split('.')[-1] == sname.split('.')[-1] and not st:
                fq = i
        if fq is None:
            fq = pkg + '.' + sname
        if fq in reg:
            def fqty(t):
                t = t.strip()
                if '<' in t or '?' in t:
                    t = strip_generics(t)
                arr = ''
                while t.endswith('[]'):
                    arr += '[]'; t = t[:-2]
                if t in PRIMS or t in ('String', 'Object', 'Throwable', 'Exception', 'Integer', 'Long', 'Boolean', 'Class', 'Runnable', 'CharSequence', 'Float', 'Double', 'Number'):
                    return t + arr
                if '.' in t:
                    return t + arr
                for st, i, star in ims:
                    if not star and i.split('.')[-1] == t:
                        return i + arr
                if len(t) == 1 and t.isupper():
                    return 'Object' + arr
                for st, i, star in ims:
                    if star and i.startswith(EXT):
                        continue
                    if star:
                        return i + '.' + t + arr
                return pkg + '.' + t + arr
            key = '%s/%s/i' % (name, ','.join(fqty(p) for p in plist))
            ms = reg[fq]['methods']
            if key in ms or ('%s/%d/i' % (name, len(plist))) in ms:
                continue
            ms[key] = {'ret': fqty(ret) if ret not in PRIMS else ret, 'params': [fqty(p) for p in plist], 'static': False, 'name': name, 'exact': True}
            changed += 1
    return changed


def default_ret(t):
    if t == 'void':
        return ''
    if t == 'boolean':
        return 'return false;'
    if t in PRIMS:
        return 'return 0;' if t != 'char' else "return '\\0';"
    return 'return null;'


SKIP = {'androidx.camera.camera2.pipe.w'}  # hand-written in app/src/main/java


def write_stubs(reg):
    for k in SKIP:
        reg.pop(k, None)
    if os.path.isdir(STUB):
        for dp, _, names in os.walk(STUB):
            for n in names:
                if n.endswith('.java'):
                    os.remove(os.path.join(dp, n))
    for fq, s in reg.items():
        pkg, name = fq.rsplit('.', 1) if '.' in fq else ('', fq)
        if pkg in reg:
            continue  # nested: rendered inside its outer class
        tp = ''
        if s['tp']:
            tp = '<' + ', '.join('T%d' % i for i in range(s['tp'])) + '>'
        kind = s['kind']
        lines = ['// RECOVERED STUB -- generated by tools/gen_stubs.py; the original class was not present in the',
                 '// decompiled tree. Replace with the real implementation when it is recovered.']
        if pkg:
            lines.append('package %s;\n' % pkg)
        ext = ''
        if s.get('extends'):
            ext = ' extends ' + s['extends']
        impl = ''
        if s.get('implements'):
            impl = (' implements ' if kind == 'class' else ' extends ') + ', '.join(s['implements'])
        if kind == 'interface' and ext:
            ext = ''
        if kind == 'annotation':
            lines.append('public @interface %s {' % name)
            for el in ANNOTATIONS[fq]:
                lines.append('    %s;' % el)
            lines.append('}')
            _w(fq, lines)
            continue
        if kind == 'enum':
            lines.append('public enum %s {' % name)
            lines.append('    ' + ', '.join(ENUMS[fq]) + ';')
            lines.append('}')
            _w(fq, lines)
            continue
        lines.append('public %s %s%s%s%s {' % ('interface' if kind == 'interface' else 'class', name, tp, ext, impl))
        if kind == 'class':
            if s.get('extends') == 'android.view.View':
                lines.append('    public %s(android.content.Context c) { super(c); }' % name)
                lines.append('    public %s(android.content.Context c, android.util.AttributeSet a) { super(c, a); }' % name)
                lines.append('    public %s(android.content.Context c, android.util.AttributeSet a, int d) { super(c, a, d); }' % name)
            else:
                lines.append('    public %s(Object... args) {}' % name)
                lines.append('    public %s() {}' % name)
            if s.get('extends') == 'android.app.Service':
                lines.append('    @Override public android.os.IBinder onBind(android.content.Intent intent) { return null; }')
        for fn, f in sorted(s['fields'].items()):
            if kind == 'interface':
                lines.append('    %s %s = %s;' % (f['type'], fn, '""' if f['type'] == 'String' else 'null'))
            else:
                lines.append('    public %s%s %s%s;' % ('static ' if f['static'] else '', f['type'], fn, (' = "%s"' % f.get('value', '')) if f['type'] == 'String' else ''))
        for key, m in sorted(s['methods'].items()):
            ps = ', '.join('%s p%d' % (t, i) for i, t in enumerate(m['params']))
            ret = m['ret']
            if kind == 'interface':
                lines.append('    %s %s(%s);' % (ret, m['name'], ps))
            else:
                lines.append('    public %s%s %s(%s) { %s }' % ('static ' if m['static'] else '', ret, m['name'], ps, default_ret(ret)))
        for nfq, ns in sorted(reg.items()):
            if nfq.startswith(fq + '.') and nfq.count('.') == fq.count('.') + 1:
                lines.append('    public static class %s {' % nfq.rsplit('.', 1)[1])
                lines.append('        public %s(Object... args) {}' % nfq.rsplit('.', 1)[1])
                lines.append('        public %s() {}' % nfq.rsplit('.', 1)[1])
                for key, m in sorted(ns['methods'].items()):
                    ps = ', '.join('%s p%d' % (t, i) for i, t in enumerate(m['params']))
                    lines.append('        public %s%s %s(%s) { %s }' % ('static ' if m['static'] else '', m['ret'], m['name'], ps, default_ret(m['ret'])))
                lines.append('    }')
        lines.append('}')
        _w(fq, lines)


def _w(fq, lines):
    p = os.path.join(STUB, fq.replace('.', '/') + '.java')
    os.makedirs(os.path.dirname(p), exist_ok=True)
    open(p, 'w').write('\n'.join(lines) + '\n')


if __name__ == '__main__':
    main()
