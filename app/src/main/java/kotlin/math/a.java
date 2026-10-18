package kotlin.math;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class a {
    public static final a a = new a();
    public static final double b = Math.log(2.0d);
    public static final double c;
    public static final double d;
    public static final double e;
    public static final double f;
    public static final double g;

    static {
        double dUlp = Math.ulp(1.0d);
        c = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        d = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        e = dSqrt2;
        f = 1.0d / dSqrt;
        g = 1.0d / dSqrt2;
    }

    private a() {
    }
}
