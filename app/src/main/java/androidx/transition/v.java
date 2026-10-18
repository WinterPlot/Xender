package androidx.transition;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
class v {
    private long[] a;
    private float[] b = new float[20];
    private int c = 0;

    public v() {
        long[] jArr = new long[20];
        this.a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float kineticEnergyToVelocity(float f) {
        return (float) (Math.sqrt(Math.abs(f) * 2.0f) * ((double) Math.signum(f)));
    }

    public void addDataPoint(long j, float f) {
        int i = (this.c + 1) % 20;
        this.c = i;
        this.a[i] = j;
        this.b[i] = f;
    }

    public float calculateVelocity() {
        int i = this.c;
        if (i == 0 && this.a[i] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j = this.a[i];
        int i2 = 0;
        long j2 = j;
        while (true) {
            long j3 = this.a[i];
            if (j3 == Long.MIN_VALUE) {
                break;
            }
            float f = j - j3;
            float fAbs = Math.abs(j3 - j2);
            if (f > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i == 0) {
                i = 20;
            }
            i--;
            i2++;
            if (i2 >= 20) {
                break;
            }
            j2 = j3;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        int i3 = this.c;
        if (i2 == 2) {
            int i4 = i3 == 0 ? 19 : i3 - 1;
            long[] jArr = this.a;
            float f2 = jArr[i3] - jArr[i4];
            if (f2 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.b;
            return ((fArr[i3] - fArr[i4]) / f2) * 1000.0f;
        }
        int i5 = ((i3 - i2) + 21) % 20;
        int i6 = (i3 + 21) % 20;
        long j4 = this.a[i5];
        float f3 = this.b[i5];
        int i7 = i5 + 1;
        float f4 = 0.0f;
        for (int i8 = i7 % 20; i8 != i6; i8 = (i8 + 1) % 20) {
            long j5 = this.a[i8];
            float f5 = j5 - j4;
            if (f5 != 0.0f) {
                float f6 = this.b[i8];
                float f7 = (f6 - f3) / f5;
                float fAbs2 = (Math.abs(f7) * (f7 - kineticEnergyToVelocity(f4))) + f4;
                if (i8 == i7) {
                    fAbs2 *= 0.5f;
                }
                f4 = fAbs2;
                f3 = f6;
                j4 = j5;
            }
        }
        return kineticEnergyToVelocity(f4) * 1000.0f;
    }

    public void resetTracking() {
        this.c = 0;
        Arrays.fill(this.a, Long.MIN_VALUE);
        Arrays.fill(this.b, 0.0f);
    }
}
