package com.google.android.material.color.utilities;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    public static final g k = defaultWithBackgroundLstar(50.0d);
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double[] g;
    private final double h;
    private final double i;
    private final double j;

    private g(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.f = d;
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
        this.g = dArr;
        this.h = d7;
        this.i = d8;
        this.j = d9;
    }

    public static g defaultWithBackgroundLstar(double d) {
        return make(c.whitePointD65(), (c.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d, 2.0d, false);
    }

    public static g make(double[] dArr, double d, double d2, double d3, boolean z) {
        double dMax = Math.max(0.1d, d2);
        double[][] dArr2 = b.k;
        double d4 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d5 = dArr3[0] * d4;
        double d6 = dArr[1];
        double d7 = (dArr3[1] * d6) + d5;
        double d8 = dArr[2];
        double d9 = (dArr3[2] * d8) + d7;
        double[] dArr4 = dArr2[1];
        double d10 = (dArr4[2] * d8) + (dArr4[1] * d6) + (dArr4[0] * d4);
        double[] dArr5 = dArr2[2];
        double d11 = (d8 * dArr5[2]) + (d6 * dArr5[1]) + (d4 * dArr5[0]);
        double d12 = (d3 / 10.0d) + 0.8d;
        double dLerp = d12 >= 0.9d ? f.lerp(0.59d, 0.69d, (d12 - 0.9d) * 10.0d) : f.lerp(0.525d, 0.59d, (d12 - 0.8d) * 10.0d);
        double dClampDouble = f.clampDouble(0.0d, 1.0d, z ? 1.0d : (1.0d - (Math.exp(((-d) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d12);
        double[] dArr6 = {(((100.0d / d9) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d10) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d11) * dClampDouble) + 1.0d) - dClampDouble};
        double d13 = 5.0d * d;
        double d14 = 1.0d / (d13 + 1.0d);
        double d15 = d14 * d14 * d14 * d14;
        double d16 = 1.0d - d15;
        double dCbrt = (Math.cbrt(d13) * 0.1d * d16 * d16) + (d15 * d);
        double dYFromLstar = c.yFromLstar(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dYFromLstar) + 1.48d;
        double dPow = 0.725d / Math.pow(dYFromLstar, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d9) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d10) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d11) / 100.0d, 0.42d)};
        double d17 = dArr7[0];
        double d18 = (d17 * 400.0d) / (d17 + 27.13d);
        double d19 = dArr7[1];
        double d20 = (d19 * 400.0d) / (d19 + 27.13d);
        double d21 = dArr7[2];
        double[] dArr8 = {d18, d20, (400.0d * d21) / (d21 + 27.13d)};
        return new g(dYFromLstar, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * dPow, dPow, dPow, dLerp, d12, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public double getAw() {
        return this.a;
    }

    public double getC() {
        return this.d;
    }

    public double getFl() {
        return this.h;
    }

    public double getFlRoot() {
        return this.i;
    }

    public double getN() {
        return this.f;
    }

    public double getNbb() {
        return this.b;
    }

    public double getNc() {
        return this.e;
    }

    public double getNcb() {
        return this.c;
    }

    public double[] getRgbD() {
        return this.g;
    }

    public double getZ() {
        return this.j;
    }
}
