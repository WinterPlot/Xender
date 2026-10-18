package com.google.android.material.carousel;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    final int a;
    float b;
    int c;
    int d;
    float e;
    float f;
    final int g;
    final float h;

    public a(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
        this.a = i;
        this.b = androidx.core.math.a.clamp(f, f2, f3);
        this.c = i2;
        this.e = f4;
        this.d = i3;
        this.f = f5;
        this.g = i4;
        fit(f6, f2, f3, f5);
        this.h = cost(f5);
    }

    private float calculateLargeSize(float f, int i, float f2, int i2, int i3) {
        if (i <= 0) {
            f2 = 0.0f;
        }
        float f3 = i;
        float f4 = i2 / 2.0f;
        return (f - ((f3 + f4) * f2)) / (i3 + f4);
    }

    private float cost(float f) {
        if (isValid()) {
            return Math.abs(f - this.f) * this.a;
        }
        return Float.MAX_VALUE;
    }

    public static a findLowestCostArrangement(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        a aVar = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = length;
                    int i7 = i3;
                    int i8 = i;
                    int i9 = length2;
                    int i10 = i5;
                    a aVar2 = new a(i8, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    if (aVar == null || aVar2.h < aVar.h) {
                        if (aVar2.h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i11 = i8 + 1;
                    i5 = i10 + 1;
                    i3 = i7;
                    i = i11;
                    length = i6;
                    length2 = i9;
                }
                i3++;
                i = i;
                length = length;
            }
        }
        return aVar;
    }

    private void fit(float f, float f2, float f3, float f4) {
        float space = f - getSpace();
        int i = this.c;
        if (i > 0 && space > 0.0f) {
            float f5 = this.b;
            this.b = Math.min(space / i, f3 - f5) + f5;
        } else if (i > 0 && space < 0.0f) {
            float f6 = this.b;
            this.b = Math.max(space / i, f2 - f6) + f6;
        }
        int i2 = this.c;
        float f7 = i2 > 0 ? this.b : 0.0f;
        this.b = f7;
        float fCalculateLargeSize = calculateLargeSize(f, i2, f7, this.d, this.g);
        this.f = fCalculateLargeSize;
        float f8 = (this.b + fCalculateLargeSize) / 2.0f;
        this.e = f8;
        int i3 = this.d;
        if (i3 <= 0 || fCalculateLargeSize == f4) {
            return;
        }
        float f9 = (f4 - fCalculateLargeSize) * this.g;
        float fMin = Math.min(Math.abs(f9), f8 * 0.1f * i3);
        float f10 = this.e;
        if (f9 > 0.0f) {
            this.e = f10 - (fMin / this.d);
            this.f = (fMin / this.g) + this.f;
        } else {
            this.e = (fMin / this.d) + f10;
            this.f -= fMin / this.g;
        }
    }

    private float getSpace() {
        return (this.b * this.c) + (this.e * this.d) + (this.f * this.g);
    }

    private boolean isValid() {
        int i = this.g;
        if (i <= 0 || this.c <= 0 || this.d <= 0) {
            return i <= 0 || this.c <= 0 || this.f > this.b;
        }
        float f = this.f;
        float f2 = this.e;
        return f > f2 && f2 > this.b;
    }

    public int getItemCount() {
        return this.c + this.d + this.g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.a + ", smallCount=" + this.c + ", smallSize=" + this.b + ", mediumCount=" + this.d + ", mediumSize=" + this.e + ", largeCount=" + this.g + ", largeSize=" + this.f + ", cost=" + this.h + "]";
    }
}
