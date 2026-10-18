package kotlin.internal;

import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    private static final int differenceModulo(int i, int i2, int i3) {
        return mod(mod(i, i3) - mod(i2, i3), i3);
    }

    public static final long getProgressionLastElement(long j, long j2, long j3) {
        if (j3 > 0) {
            return j >= j2 ? j2 : j2 - differenceModulo(j2, j, j3);
        }
        if (j3 < 0) {
            return j <= j2 ? j2 : j2 + differenceModulo(j, j2, -j3);
        }
        b0.i("Step is zero.");
        return 0L;
    }

    private static final long mod(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    private static final int mod(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    private static final long differenceModulo(long j, long j2, long j3) {
        return mod(mod(j, j3) - mod(j2, j3), j3);
    }

    public static final int getProgressionLastElement(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - differenceModulo(i2, i, i3);
            }
        } else {
            if (i3 >= 0) {
                b0.i("Step is zero.");
                return 0;
            }
            if (i > i2) {
                return i2 + differenceModulo(i, i2, -i3);
            }
        }
        return i2;
    }
}
