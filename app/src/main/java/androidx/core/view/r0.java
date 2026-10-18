package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class r0 {
    private final float[] a = new float[20];
    private final long[] b = new long[20];
    private float c = 0.0f;
    private int d = 0;
    private int e = 0;

    private void clear() {
        this.d = 0;
        this.c = 0.0f;
    }

    private float getCurrentVelocity() {
        long[] jArr;
        long j;
        int i;
        int i2 = this.d;
        if (i2 < 2) {
            return 0.0f;
        }
        int i3 = this.e;
        int i4 = ((i3 + 20) - (i2 - 1)) % 20;
        long j2 = this.b[i3];
        while (true) {
            jArr = this.b;
            j = jArr[i4];
            long j3 = j2 - j;
            i = this.d;
            if (j3 <= 100) {
                break;
            }
            this.d = i - 1;
            i4 = (i4 + 1) % 20;
        }
        if (i < 2) {
            return 0.0f;
        }
        if (i == 2) {
            int i5 = (i4 + 1) % 20;
            long j4 = jArr[i5];
            if (j == j4) {
                return 0.0f;
            }
            return this.a[i5] / (j4 - j);
        }
        float f = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < this.d - 1; i7++) {
            int i8 = i7 + i4;
            long[] jArr2 = this.b;
            long j5 = jArr2[i8 % 20];
            int i9 = (i8 + 1) % 20;
            if (jArr2[i9] != j5) {
                i6++;
                float fKineticEnergyToVelocity = kineticEnergyToVelocity(f);
                float f2 = this.a[i9] / (this.b[i9] - j5);
                float fAbs = (Math.abs(f2) * (f2 - fKineticEnergyToVelocity)) + f;
                if (i6 == 1) {
                    fAbs *= 0.5f;
                }
                f = fAbs;
            }
        }
        return kineticEnergyToVelocity(f);
    }

    private static float kineticEnergyToVelocity(float f) {
        return (f < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    public void addMovement(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.d != 0 && eventTime - this.b[this.e] > 40) {
            clear();
        }
        int i = (this.e + 1) % 20;
        this.e = i;
        int i2 = this.d;
        if (i2 != 20) {
            this.d = i2 + 1;
        }
        this.a[i] = motionEvent.getAxisValue(26);
        this.b[this.e] = eventTime;
    }

    public void computeCurrentVelocity(int i, float f) {
        float currentVelocity = getCurrentVelocity() * i;
        this.c = currentVelocity;
        if (currentVelocity < (-Math.abs(f))) {
            this.c = -Math.abs(f);
        } else if (this.c > Math.abs(f)) {
            this.c = Math.abs(f);
        }
    }

    public float getAxisVelocity(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.c;
    }

    public void computeCurrentVelocity(int i) {
        computeCurrentVelocity(i, Float.MAX_VALUE);
    }
}
