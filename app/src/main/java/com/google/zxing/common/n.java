package com.google.zxing.common;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    private n(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f4;
        this.c = f7;
        this.d = f2;
        this.e = f5;
        this.f = f8;
        this.g = f3;
        this.h = f6;
        this.i = f9;
    }

    public static n quadrilateralToQuadrilateral(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return squareToQuadrilateral(f9, f10, f11, f12, f13, f14, f15, f16).times(quadrilateralToSquare(f, f2, f3, f4, f5, f6, f7, f8));
    }

    public static n quadrilateralToSquare(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return squareToQuadrilateral(f, f2, f3, f4, f5, f6, f7, f8).buildAdjoint();
    }

    public static n squareToQuadrilateral(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new n(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new n((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f16 * f4) + (f4 - f2), (f17 * f8) + (f8 - f2), f2, f16, f17, 1.0f);
    }

    public n buildAdjoint() {
        float f = this.e;
        float f2 = this.i;
        float f3 = this.f;
        float f4 = this.h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.g;
        float f7 = this.d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.c;
        float f11 = this.b;
        float f12 = this.a;
        return new n(f5, f8, f9, (f10 * f4) - (f11 * f2), (f2 * f12) - (f10 * f6), (f6 * f11) - (f4 * f12), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f12), (f12 * f) - (f11 * f7));
    }

    public n times(n nVar) {
        float f = this.a;
        float f2 = nVar.a;
        float f3 = this.d;
        float f4 = nVar.b;
        float f5 = this.g;
        float f6 = nVar.c;
        float f7 = (f5 * f6) + (f3 * f4) + (f * f2);
        float f8 = nVar.d;
        float f9 = nVar.e;
        float f10 = nVar.f;
        float f11 = (f5 * f10) + (f3 * f9) + (f * f8);
        float f12 = nVar.g;
        float f13 = nVar.h;
        float f14 = nVar.i;
        float f15 = f5 * f14;
        float f16 = f15 + (f3 * f13) + (f * f12);
        float f17 = this.b;
        float f18 = this.e;
        float f19 = this.h;
        float f20 = (f19 * f6) + (f18 * f4) + (f17 * f2);
        float f21 = (f19 * f10) + (f18 * f9) + (f17 * f8);
        float f22 = f19 * f14;
        float f23 = f22 + (f18 * f13) + (f17 * f12);
        float f24 = this.c;
        float f25 = this.f;
        float f26 = f4 * f25;
        float f27 = this.i;
        return new n(f7, f11, f16, f20, f21, f23, f26 + (f2 * f24) + (f6 * f27), (f10 * f27) + (f9 * f25) + (f8 * f24), (f27 * f14) + (f25 * f13) + (f24 * f12));
    }

    public void transformPoints(float[] fArr) {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        float f5 = this.e;
        float f6 = this.f;
        float f7 = this.g;
        float f8 = this.h;
        float f9 = this.i;
        int length = fArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            int i2 = i + 1;
            float f11 = fArr[i2];
            float f12 = (f6 * f11) + (f3 * f10) + f9;
            fArr[i] = (((f4 * f11) + (f * f10)) + f7) / f12;
            fArr[i2] = (((f11 * f5) + (f10 * f2)) + f8) / f12;
        }
    }

    public void transformPoints(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f = fArr[i];
            float f2 = fArr2[i];
            float f3 = (this.f * f2) + (this.c * f) + this.i;
            fArr[i] = (((this.d * f2) + (this.a * f)) + this.g) / f3;
            fArr2[i] = (((this.e * f2) + (this.b * f)) + this.h) / f3;
        }
    }
}
