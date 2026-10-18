package kotlin.comparisons;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class e extends d {
    public static final <T extends Comparable<? super T>> T maxOf(T t, T... tArr) {
        t.getClass();
        tArr.getClass();
        for (T t2 : tArr) {
            t = (T) maxOf(t, t2);
        }
        return t;
    }

    public static final <T extends Comparable<? super T>> T minOf(T t, T... tArr) {
        t.getClass();
        tArr.getClass();
        for (T t2 : tArr) {
            t = (T) minOf(t, t2);
        }
        return t;
    }

    private static final byte maxOf(byte b, byte b2) {
        return (byte) Math.max((int) b, (int) b2);
    }

    private static final byte minOf(byte b, byte b2) {
        return (byte) Math.min((int) b, (int) b2);
    }

    private static final short maxOf(short s, short s2) {
        return (short) Math.max((int) s, (int) s2);
    }

    private static final short minOf(short s, short s2) {
        return (short) Math.min((int) s, (int) s2);
    }

    private static final int maxOf(int i, int i2) {
        return Math.max(i, i2);
    }

    private static final int minOf(int i, int i2) {
        return Math.min(i, i2);
    }

    private static final long maxOf(long j, long j2) {
        return Math.max(j, j2);
    }

    private static final long minOf(long j, long j2) {
        return Math.min(j, j2);
    }

    private static final float maxOf(float f, float f2) {
        return Math.max(f, f2);
    }

    private static final float minOf(float f, float f2) {
        return Math.min(f, f2);
    }

    private static final double maxOf(double d, double d2) {
        return Math.max(d, d2);
    }

    private static final double minOf(double d, double d2) {
        return Math.min(d, d2);
    }

    public static final <T extends Comparable<? super T>> T maxOf(T t, T t2, T t3) {
        t.getClass();
        t2.getClass();
        t3.getClass();
        return (T) maxOf(t, maxOf(t2, t3));
    }

    public static final <T extends Comparable<? super T>> T minOf(T t, T t2, T t3) {
        t.getClass();
        t2.getClass();
        t3.getClass();
        return (T) minOf(t, minOf(t2, t3));
    }

    private static final byte maxOf(byte b, byte b2, byte b3) {
        return (byte) Math.max((int) b, Math.max((int) b2, (int) b3));
    }

    private static final byte minOf(byte b, byte b2, byte b3) {
        return (byte) Math.min((int) b, Math.min((int) b2, (int) b3));
    }

    private static final short maxOf(short s, short s2, short s3) {
        return (short) Math.max((int) s, Math.max((int) s2, (int) s3));
    }

    private static final short minOf(short s, short s2, short s3) {
        return (short) Math.min((int) s, Math.min((int) s2, (int) s3));
    }

    private static final int maxOf(int i, int i2, int i3) {
        return Math.max(i, Math.max(i2, i3));
    }

    private static final int minOf(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }

    private static final long maxOf(long j, long j2, long j3) {
        return Math.max(j, Math.max(j2, j3));
    }

    private static final long minOf(long j, long j2, long j3) {
        return Math.min(j, Math.min(j2, j3));
    }

    private static final float maxOf(float f, float f2, float f3) {
        return Math.max(f, Math.max(f2, f3));
    }

    private static final float minOf(float f, float f2, float f3) {
        return Math.min(f, Math.min(f2, f3));
    }

    private static final double maxOf(double d, double d2, double d3) {
        return Math.max(d, Math.max(d2, d3));
    }

    private static final double minOf(double d, double d2, double d3) {
        return Math.min(d, Math.min(d2, d3));
    }

    public static <T extends Comparable<? super T>> T maxOf(T t, T t2) {
        t.getClass();
        t2.getClass();
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    public static final <T extends Comparable<? super T>> T minOf(T t, T t2) {
        t.getClass();
        t2.getClass();
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    public static final byte maxOf(byte b, byte... bArr) {
        bArr.getClass();
        for (byte b2 : bArr) {
            b = (byte) Math.max((int) b, (int) b2);
        }
        return b;
    }

    public static final byte minOf(byte b, byte... bArr) {
        bArr.getClass();
        for (byte b2 : bArr) {
            b = (byte) Math.min((int) b, (int) b2);
        }
        return b;
    }

    public static final short maxOf(short s, short... sArr) {
        sArr.getClass();
        for (short s2 : sArr) {
            s = (short) Math.max((int) s, (int) s2);
        }
        return s;
    }

    public static final short minOf(short s, short... sArr) {
        sArr.getClass();
        for (short s2 : sArr) {
            s = (short) Math.min((int) s, (int) s2);
        }
        return s;
    }

    public static final int maxOf(int i, int... iArr) {
        iArr.getClass();
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static final int minOf(int i, int... iArr) {
        iArr.getClass();
        for (int i2 : iArr) {
            i = Math.min(i, i2);
        }
        return i;
    }

    public static final long maxOf(long j, long... jArr) {
        jArr.getClass();
        for (long j2 : jArr) {
            j = Math.max(j, j2);
        }
        return j;
    }

    public static final long minOf(long j, long... jArr) {
        jArr.getClass();
        for (long j2 : jArr) {
            j = Math.min(j, j2);
        }
        return j;
    }

    public static final float maxOf(float f, float... fArr) {
        fArr.getClass();
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    public static final float minOf(float f, float... fArr) {
        fArr.getClass();
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }

    public static final double maxOf(double d, double... dArr) {
        dArr.getClass();
        for (double d2 : dArr) {
            d = Math.max(d, d2);
        }
        return d;
    }

    public static final double minOf(double d, double... dArr) {
        dArr.getClass();
        for (double d2 : dArr) {
            d = Math.min(d, d2);
        }
        return d;
    }
}
