package androidx.camera.camera2.pipe;

/**
 * Recovered: R8 outlined string-building helpers (original class was not in the decompiled tree).
 * Bodies reconstructed from call sites; they only build message/toString strings.
 */
public final class w {
    private w() {
    }

    public static String p(Object a, Object b) { return "" + a + b; }
    public static String n(Object a, Object b) { return "" + a + b; }
    public static String q(Object a, Object b, Object c) { return "" + a + b + c; }
    public static String r(Object a, Object b, Object c, Object d) { return "" + a + b + c + d; }
    public static String s(Object a, Object b, Object c, Object d, Object e) { return "" + a + b + c + d + e; }
    public static String m(Object a, Object b, Object c, Object d, Object e) { return "" + a + b + c + d + e; }

    public static StringBuilder w(Object a, Object b, Object c, Object d, Object e) {
        return new StringBuilder().append(a).append(b).append(c).append(d).append(e);
    }

    public static String t(StringBuilder sb, Object a, Object b) { return sb.append(a).append(b).toString(); }

    public static String u(StringBuilder sb, Object a, Object b, Object c, Object d) {
        return sb.append(a).append(b).append(c).append(d).toString();
    }

    public static StringBuilder z(Object a, Object b) { return new StringBuilder().append(a).append(b); }
    public static StringBuilder y(Object a) { return new StringBuilder().append(a); }

    public static StringBuilder A(Object a, Object b, Object c, Object d, Object e) {
        return new StringBuilder().append(a).append(b).append(c).append(d).append(e);
    }

    public static void H(StringBuilder sb, Object a, Object b, Object c, Object d) {
        sb.append(a).append(b).append(c).append(d);
    }

    public static void G(StringBuilder sb, Object a, Object b, Object c) {
        sb.append(a).append(b).append(c);
    }
}
