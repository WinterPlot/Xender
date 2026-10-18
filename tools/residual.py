import sys,os,re,collections
sys.argv=[sys.argv[0],os.getcwd()]
sys.path.insert(0,'tools')
import gen_stubs as g
fs=g.src_files()
raw,norm=g.run_javac(fs)
d=g.parse(raw,norm)
out=[]
for path,line,col,code,args in d:
    a=g.split_args(args) if args else []
    if code in('compiler.err.cant.resolve.location','compiler.err.cant.resolve') and a and a[0]=='kindname.class':
        pkg,ims,_=g.fileinfo(path)
        nm=a[1]
        if any(not st and i.split('.')[-1]==nm and i.startswith(g.EXT) for st,i,star in ims): continue
        if any(star and i.startswith(g.EXT) for st,i,star in ims): continue
    if code=='compiler.err.doesnt.exist' and a and (a[0].startswith(g.EXT) or a[0] in('R','Build','View','Parcelable','Resources','PorterDuff','DialogInterface','TypedValue','Log','Bundle','Rect','Color','Context')): continue
    if code in('compiler.err.cant.resolve.location.args','compiler.err.cant.resolve.location') and a and a[0] in('kindname.method','kindname.variable'):
        if 'android' in args or 'java.lang.Object' in args.split('(compiler.misc.location')[-1] : pass
    out.append((path,line,code,args))
print(len(out))
cnt=collections.Counter(c for _,_,c,_ in out); print(cnt.most_common())
import json; json.dump(out,open('/tmp/claude-0/-home-claude/437991d6-493b-5616-8b8b-38666c349d55/scratchpad/resid.json','w'))
