package com.google.common.base;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements com.google.common.base.n<Character> {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends x {
        final /* synthetic */ String b;
        final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, b bVar2, String str) {
            super(bVar2);
            this.b = str;
            this.c = bVar;
        }

        @Override // com.google.common.base.b.w, com.google.common.base.b
        public String toString() {
            return this.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a0 extends b {
        private final String a;
        private final char[] b;
        private final char[] c;

        public a0(String str, char[] cArr, char[] cArr2) {
            this.a = str;
            this.b = cArr;
            this.c = cArr2;
            com.google.common.base.m.checkArgument(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                com.google.common.base.m.checkArgument(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    com.google.common.base.m.checkArgument(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            int iBinarySearch = Arrays.binarySearch(this.b, c);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i = (~iBinarySearch) - 1;
            return i >= 0 && c <= this.c[i];
        }

        @Override // com.google.common.base.b
        public String toString() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0587b extends b {
        final b a;
        final b b;

        public C0587b(b bVar, b bVar2) {
            this.a = (b) com.google.common.base.m.checkNotNull(bVar);
            this.b = (b) com.google.common.base.m.checkNotNull(bVar2);
        }

        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return this.a.matches(c) && this.b.matches(c);
        }

        @Override // com.google.common.base.b
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.a.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.b.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return this.a + ".and(" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b0 extends a0 {
        static final b d = new b0();

        private b0() {
            super("CharMatcher.singleWidth()", new char[]{0, 1470, 1488, 1523, 1536, 1872, 3584, 7680, 8448, 64336, 65136, 65377}, new char[]{1273, 1470, 1514, 1524, 1791, 1919, 3711, 8367, 8506, 65023, 65279, 65500});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c0 extends v {
        static final int b = Integer.numberOfLeadingZeros(31);
        static final b c = new c0();

        public c0() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.b
        public boolean matches(char c2) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c2) >>> b) == c2;
        }

        @Override // com.google.common.base.b
        public void setBits(BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class d extends b {
        private final char[] a;

        public d(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.a = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return Arrays.binarySearch(this.a, c) >= 0;
        }

        @Override // com.google.common.base.b
        public void setBits(BitSet bitSet) {
            for (char c : this.a) {
                bitSet.set(c);
            }
        }

        @Override // com.google.common.base.b
        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.a) {
                sb.append(b.showCharacter(c));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class e extends v {
        static final b b = new e();

        public e() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return c <= 127;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class g extends b {
        static final b a = new g();

        private g() {
        }

        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            if (c != ' ' && c != 133 && c != 5760) {
                if (c != 8199) {
                    if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                        switch (c) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (c >= 8192 && c <= 8202) {
                                    return true;
                                }
                                break;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class h extends a0 {
        static final b d = new h();

        private h() {
            super("CharMatcher.digit()", zeroes(), nines());
        }

        private static char[] nines() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i) + '\t');
            }
            return cArr;
        }

        private static char[] zeroes() {
            return new char[]{'0', 1632, 1776, 1984, 2406, 2534, 2662, 2790, 2918, 3046, 3174, 3302, 3430, 3558, 3664, 3792, 3872, 4160, 4240, 6112, 6160, 6470, 6608, 6784, 6800, 6992, 7088, 7232, 7248, 42528, 43216, 43264, 43472, 43504, 43600, 44016, 65296};
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class j extends b {
        private final com.google.common.base.n<? super Character> a;

        public j(com.google.common.base.n<? super Character> nVar) {
            this.a = (com.google.common.base.n) com.google.common.base.m.checkNotNull(nVar);
        }

        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return this.a.apply(Character.valueOf(c));
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.forPredicate(" + this.a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class k extends i {
        private final char a;
        private final char b;

        public k(char c, char c2) {
            com.google.common.base.m.checkArgument(c2 >= c);
            this.a = c;
            this.b = c2;
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return this.a <= c && c <= this.b;
        }

        @Override // com.google.common.base.b
        public void setBits(BitSet bitSet) {
            bitSet.set(this.a, this.b + 1);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.inRange('" + b.showCharacter(this.a) + "', '" + b.showCharacter(this.b) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class l extends a0 {
        static final b d = new l();

        private l() {
            super("CharMatcher.invisible()", new char[]{0, 127, 173, 1536, 1564, 1757, 1807, 2192, 2274, 5760, 6158, 8192, 8232, 8287, 8294, 12288, 55296, 65279, 65529}, new char[]{' ', 160, 173, 1541, 1564, 1757, 1807, 2193, 2274, 5760, 6158, 8207, 8239, 8292, 8303, 12288, 63743, 65279, 65531});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class m extends i {
        private final char a;

        public m(char c) {
            this.a = c;
        }

        @Override // com.google.common.base.b
        public b and(b bVar) {
            return bVar.matches(this.a) ? this : b.none();
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return c == this.a;
        }

        @Override // com.google.common.base.b.i, com.google.common.base.b
        public b negate() {
            return b.isNot(this.a);
        }

        @Override // com.google.common.base.b
        public b or(b bVar) {
            return bVar.matches(this.a) ? bVar : super.or(bVar);
        }

        @Override // com.google.common.base.b
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.a, c);
        }

        @Override // com.google.common.base.b
        public void setBits(BitSet bitSet) {
            bitSet.set(this.a);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.is('" + b.showCharacter(this.a) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class n extends i {
        private final char a;
        private final char b;

        public n(char c, char c2) {
            this.a = c;
            this.b = c2;
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return c == this.a || c == this.b;
        }

        @Override // com.google.common.base.b
        public void setBits(BitSet bitSet) {
            bitSet.set(this.a);
            bitSet.set(this.b);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.anyOf(\"" + b.showCharacter(this.a) + b.showCharacter(this.b) + "\")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class o extends i {
        private final char a;

        public o(char c) {
            this.a = c;
        }

        @Override // com.google.common.base.b
        public b and(b bVar) {
            return bVar.matches(this.a) ? super.and(bVar) : bVar;
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return c != this.a;
        }

        @Override // com.google.common.base.b.i, com.google.common.base.b
        public b negate() {
            return b.is(this.a);
        }

        @Override // com.google.common.base.b
        public b or(b bVar) {
            return bVar.matches(this.a) ? b.any() : this;
        }

        @Override // com.google.common.base.b
        public void setBits(BitSet bitSet) {
            bitSet.set(0, this.a);
            bitSet.set(this.a + 1, 65536);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.isNot('" + b.showCharacter(this.a) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class p extends b {
        static final b a = new p();

        private p() {
        }

        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return Character.isDigit(c);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class q extends v {
        static final b b = new q();

        private q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            if (c > 31) {
                return c >= 127 && c <= 159;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class r extends b {
        static final b a = new r();

        private r() {
        }

        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return Character.isLetter(c);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class s extends b {
        static final b a = new s();

        private s() {
        }

        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return Character.isLetterOrDigit(c);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class t extends b {
        static final b a = new t();

        private t() {
        }

        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return Character.isLowerCase(c);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class u extends b {
        static final b a = new u();

        private u() {
        }

        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return Character.isUpperCase(c);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class v extends i {
        private final String a;

        public v(String str) {
            this.a = (String) com.google.common.base.m.checkNotNull(str);
        }

        @Override // com.google.common.base.b
        public final String toString() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class w extends b {
        final b a;

        public w(b bVar) {
            this.a = (b) com.google.common.base.m.checkNotNull(bVar);
        }

        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.a.countIn(charSequence);
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return !this.a.matches(c);
        }

        @Override // com.google.common.base.b
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.a.matchesNoneOf(charSequence);
        }

        @Override // com.google.common.base.b
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.a.matchesAllOf(charSequence);
        }

        @Override // com.google.common.base.b
        public b negate() {
            return this.a;
        }

        @Override // com.google.common.base.b
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.a.setBits(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return this.a + ".negate()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class z extends b {
        final b a;
        final b b;

        public z(b bVar, b bVar2) {
            this.a = (b) com.google.common.base.m.checkNotNull(bVar);
            this.b = (b) com.google.common.base.m.checkNotNull(bVar2);
        }

        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return this.a.matches(c) || this.b.matches(c);
        }

        @Override // com.google.common.base.b
        public void setBits(BitSet bitSet) {
            this.a.setBits(bitSet);
            this.b.setBits(bitSet);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return this.a + ".or(" + this.b + ")";
        }
    }

    public static b any() {
        return c.b;
    }

    public static b anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return none();
        }
        if (length != 1) {
            return length != 2 ? new d(charSequence) : isEither(charSequence.charAt(0), charSequence.charAt(1));
        }
        return is(charSequence.charAt(0));
    }

    public static b ascii() {
        return e.b;
    }

    public static b breakingWhitespace() {
        return g.a;
    }

    @Deprecated
    public static b digit() {
        return h.d;
    }

    private String finishCollapseFrom(CharSequence charSequence, int i2, int i3, char c2, StringBuilder sb, boolean z2) {
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if (!matches(cCharAt)) {
                sb.append(cCharAt);
                z2 = false;
            } else if (!z2) {
                sb.append(c2);
                z2 = true;
            }
            i2++;
        }
        return sb.toString();
    }

    public static b forPredicate(com.google.common.base.n<? super Character> nVar) {
        return nVar instanceof b ? (b) nVar : new j(nVar);
    }

    public static b inRange(char c2, char c3) {
        return new k(c2, c3);
    }

    @Deprecated
    public static b invisible() {
        return l.d;
    }

    public static b is(char c2) {
        return new m(c2);
    }

    private static n isEither(char c2, char c3) {
        return new n(c2, c3);
    }

    public static b isNot(char c2) {
        return new o(c2);
    }

    private static boolean isSmall(int i2, int i3) {
        return i2 <= 1023 && i3 > i2 * 64;
    }

    @Deprecated
    public static b javaDigit() {
        return p.a;
    }

    public static b javaIsoControl() {
        return q.b;
    }

    @Deprecated
    public static b javaLetter() {
        return r.a;
    }

    @Deprecated
    public static b javaLetterOrDigit() {
        return s.a;
    }

    @Deprecated
    public static b javaLowerCase() {
        return t.a;
    }

    @Deprecated
    public static b javaUpperCase() {
        return u.a;
    }

    public static b none() {
        return y.b;
    }

    public static b noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    private static b precomputedPositive(int i2, BitSet bitSet, String str) {
        if (i2 == 0) {
            return none();
        }
        if (i2 == 1) {
            return is((char) bitSet.nextSetBit(0));
        }
        if (i2 != 2) {
            return isSmall(i2, bitSet.length()) ? com.google.common.base.o.from(bitSet, str) : new f(bitSet, str, null);
        }
        char cNextSetBit = (char) bitSet.nextSetBit(0);
        return isEither(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String showCharacter(char c2) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static b singleWidth() {
        return b0.d;
    }

    public static b whitespace() {
        return c0.c;
    }

    public b and(b bVar) {
        return new C0587b(this, bVar);
    }

    @Override // com.google.common.base.n
    @Deprecated
    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public String collapseFrom(CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (matches(cCharAt)) {
                if (cCharAt != c2 || (i2 != length - 1 && matches(charSequence.charAt(i2 + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i2);
                    sb.append(c2);
                    return finishCollapseFrom(charSequence, i2 + 1, length, c2, sb, true);
                }
                i2++;
            }
            i2++;
            c2 = c2;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (matches(charSequence.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public int indexIn(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        com.google.common.base.m.checkPositionIndex(i2, length);
        while (i2 < length) {
            if (matches(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c2);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public b negate() {
        return new w(this);
    }

    public b or(b bVar) {
        return new z(this, bVar);
    }

    public b precomputed() {
        return com.google.common.base.l.precomputeCharMatcher(this);
    }

    public b precomputedInternal() {
        BitSet bitSet = new BitSet();
        setBits(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return precomputedPositive(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i2 = 65536 - iCardinality;
        String string = toString();
        return new a(this, precomputedPositive(i2, bitSet, string.endsWith(".negate()") ? string.substring(0, string.length() - 9) : string.concat(".negate()")), string);
    }

    public String removeFrom(CharSequence charSequence) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i2 = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    i2++;
                } else {
                    charArray[iIndexIn - i2] = charArray[iIndexIn];
                    iIndexIn++;
                }
            }
            return new String(charArray, 0, iIndexIn - i2);
        }
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i2 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb = new StringBuilder(androidx.constraintlayout.core.motion.utils.m.n(length2, 3, 2, 16));
        do {
            sb.append((CharSequence) string, i2, iIndexIn);
            sb.append(charSequence2);
            i2 = iIndexIn + 1;
            iIndexIn = indexIn(string, i2);
        } while (iIndexIn != -1);
        sb.append((CharSequence) string, i2, length2);
        return sb.toString();
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public void setBits(BitSet bitSet) {
        for (int i2 = 65535; i2 >= 0; i2--) {
            if (matches((char) i2)) {
                bitSet.set(i2);
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < length && matches(charSequence.charAt(i3))) {
            i3++;
        }
        int i4 = i2;
        while (i4 > i3 && matches(charSequence.charAt(i4))) {
            i4--;
        }
        if (i3 == 0 && i4 == i2) {
            return collapseFrom(charSequence, c2);
        }
        int i5 = i4 + 1;
        return finishCollapseFrom(charSequence, i3, i5, c2, new StringBuilder(i5 - i3), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && matches(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = length - 1;
        while (i3 > i2 && matches(charSequence.charAt(i3))) {
            i3--;
        }
        return charSequence.subSequence(i2, i3 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!matches(charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class y extends v {
        static final b b = new y();

        private y() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.b
        public b and(b bVar) {
            com.google.common.base.m.checkNotNull(bVar);
            return this;
        }

        @Override // com.google.common.base.b
        public String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public int countIn(CharSequence charSequence) {
            com.google.common.base.m.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.google.common.base.b
        public int indexIn(CharSequence charSequence, int i) {
            com.google.common.base.m.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.b
        public int lastIndexIn(CharSequence charSequence) {
            com.google.common.base.m.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return false;
        }

        @Override // com.google.common.base.b
        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.b
        public boolean matchesNoneOf(CharSequence charSequence) {
            com.google.common.base.m.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.b.i, com.google.common.base.b
        public b negate() {
            return b.any();
        }

        @Override // com.google.common.base.b
        public b or(b bVar) {
            return (b) com.google.common.base.m.checkNotNull(bVar);
        }

        @Override // com.google.common.base.b
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            com.google.common.base.m.checkNotNull(charSequence2);
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public int indexIn(CharSequence charSequence) {
            com.google.common.base.m.checkNotNull(charSequence);
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c extends v {
        static final b b = new c();

        private c() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.b
        public b and(b bVar) {
            return (b) com.google.common.base.m.checkNotNull(bVar);
        }

        @Override // com.google.common.base.b
        public String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.length() == 0 ? "" : String.valueOf(c);
        }

        @Override // com.google.common.base.b
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.b
        public int indexIn(CharSequence charSequence, int i) {
            int length = charSequence.length();
            com.google.common.base.m.checkPositionIndex(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        @Override // com.google.common.base.b
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return true;
        }

        @Override // com.google.common.base.b
        public boolean matchesAllOf(CharSequence charSequence) {
            com.google.common.base.m.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.b
        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.b.i, com.google.common.base.b
        public b negate() {
            return b.none();
        }

        @Override // com.google.common.base.b
        public b or(b bVar) {
            com.google.common.base.m.checkNotNull(bVar);
            return this;
        }

        @Override // com.google.common.base.b
        public String removeFrom(CharSequence charSequence) {
            com.google.common.base.m.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.b
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence2.length() * charSequence.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }

        @Override // com.google.common.base.b
        public String trimFrom(CharSequence charSequence) {
            com.google.common.base.m.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.b
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.b
        public String replaceFrom(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c);
            return new String(cArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class i extends b {
        @Override // com.google.common.base.b, com.google.common.base.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.b
        public b negate() {
            return new x(this);
        }

        @Override // com.google.common.base.b
        public final b precomputed() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class x extends w {
        public x(b bVar) {
            super(bVar);
        }

        @Override // com.google.common.base.b
        public final b precomputed() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class f extends v {
        private final BitSet b;

        private f(BitSet bitSet, String str) {
            super(str);
            this.b = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }

        @Override // com.google.common.base.b
        public boolean matches(char c) {
            return this.b.get(c);
        }

        @Override // com.google.common.base.b
        public void setBits(BitSet bitSet) {
            bitSet.or(this.b);
        }

        public /* synthetic */ f(BitSet bitSet, String str, a aVar) {
            this(bitSet, str);
        }
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public String replaceFrom(CharSequence charSequence, char c2) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = c2;
        while (true) {
            iIndexIn++;
            if (iIndexIn < charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    charArray[iIndexIn] = c2;
                }
            } else {
                return new String(charArray);
            }
        }
    }
}
