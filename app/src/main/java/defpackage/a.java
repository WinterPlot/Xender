package defpackage;

/**
 * Recovered: R8 outlined string/number helper methods that JADX put in the default package
 * ("defpackage.a"). The original class was not part of the decompiled tree; each method body was
 * reconstructed from its call sites (string-building helpers and lerp/sin helpers).
 */
public final class a {
    private a() {
    }

    // prefix + int
    public static String j(int i, String str) {
        return str + i;
    }

    // prefix + int + suffix
    public static String k(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String v(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String m(String str, int i, char c) {
        return str + i + c;
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static StringBuilder w(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder x(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static String t(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    // (a - b) * c + d  (used for lerp and hsv conversion)
    public static float c(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    // Math.sin(x) * k + y
    public static double b(double d, double d2, double d3) {
        return (Math.sin(d) * d2) + d3;
    }

    public static String q(StringBuilder sb, int v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, long v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, float v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, double v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, boolean v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, char v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, Object v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, int v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, long v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, float v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, double v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, boolean v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, char v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, Object v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String u(StringBuilder sb, int v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String u(StringBuilder sb, long v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String u(StringBuilder sb, float v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String u(StringBuilder sb, double v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String u(StringBuilder sb, boolean v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String u(StringBuilder sb, char v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String u(StringBuilder sb, Object v, char c) {
        sb.append(v);
        sb.append(c);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, int v) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String l(int v, String str, StringBuilder sb) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, long v) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String l(long v, String str, StringBuilder sb) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, float v) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String l(float v, String str, StringBuilder sb) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, double v) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String l(double v, String str, StringBuilder sb) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, boolean v) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String l(boolean v, String str, StringBuilder sb) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, char v) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String l(char v, String str, StringBuilder sb) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, Object v) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }

    public static String l(Object v, String str, StringBuilder sb) {
        sb.append(v);
        sb.append(str);
        return sb.toString();
    }
}
