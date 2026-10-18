package com.google.android.material.color.utilities;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    static final double[][] k = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    static final double[][] l = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;
    private final double[] j = {0.0d, 0.0d, 0.0d};

    private b(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        this.h = d8;
        this.i = d9;
    }

    public static b fromInt(int i) {
        return fromIntInViewingConditions(i, g.k);
    }

    public static b fromIntInViewingConditions(int i, g gVar) {
        double dLinearized = c.linearized((16711680 & i) >> 16);
        double dLinearized2 = c.linearized((65280 & i) >> 8);
        double dLinearized3 = c.linearized(i & 255);
        return fromXyzInViewingConditions((0.18051042d * dLinearized3) + (0.35762064d * dLinearized2) + (0.41233895d * dLinearized), (0.0722d * dLinearized3) + (0.7152d * dLinearized2) + (0.2126d * dLinearized), (dLinearized3 * 0.95034478d) + (dLinearized2 * 0.11916382d) + (dLinearized * 0.01932141d), gVar);
    }

    public static b fromJch(double d, double d2, double d3) {
        return fromJchInViewingConditions(d, d2, d3, g.k);
    }

    private static b fromJchInViewingConditions(double d, double d2, double d3, g gVar) {
        double d4 = d / 100.0d;
        double flRoot = gVar.getFlRoot() * (gVar.getAw() + 4.0d) * Math.sqrt(d4) * (4.0d / gVar.getC());
        double flRoot2 = gVar.getFlRoot() * d2;
        double dSqrt = Math.sqrt((gVar.getC() * (d2 / Math.sqrt(d4))) / (gVar.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d3);
        double d5 = (1.7000000000000002d * d) / ((0.007d * d) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new b(d3, d2, d, flRoot, flRoot2, dSqrt, d5, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public static b fromUcs(double d, double d2, double d3) {
        return fromUcsInViewingConditions(d, d2, d3, g.k);
    }

    public static b fromUcsInViewingConditions(double d, double d2, double d3, g gVar) {
        double dExpm1 = (Math.expm1(Math.hypot(d2, d3) * 0.0228d) / 0.0228d) / gVar.getFlRoot();
        double dAtan2 = Math.atan2(d3, d2) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return fromJchInViewingConditions(d / (1.0d - ((d - 100.0d) * 0.007d)), dExpm1, dAtan2, gVar);
    }

    public static b fromXyzInViewingConditions(double d, double d2, double d3, g gVar) {
        double[][] dArr = k;
        double[] dArr2 = dArr[0];
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        double d6 = (dArr4[2] * d3) + (dArr4[1] * d2) + (dArr4[0] * d);
        double d7 = gVar.getRgbD()[0] * d4;
        double d8 = gVar.getRgbD()[1] * d5;
        double d9 = gVar.getRgbD()[2] * d6;
        double dPow = Math.pow((Math.abs(d7) * gVar.getFl()) / 100.0d, 0.42d);
        double dPow2 = Math.pow((Math.abs(d8) * gVar.getFl()) / 100.0d, 0.42d);
        double dPow3 = Math.pow((Math.abs(d9) * gVar.getFl()) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d7) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d8) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d9) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d10 = ((((-12.0d) * dSignum2) + (dSignum * 11.0d)) + dSignum3) / 11.0d;
        double d11 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d12 = dSignum2 * 20.0d;
        double d13 = ((21.0d * dSignum3) + ((dSignum * 20.0d) + d12)) / 20.0d;
        double d14 = (((dSignum * 40.0d) + d12) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d11, d10));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d15 = degrees;
        double radians = Math.toRadians(d15);
        double dPow4 = Math.pow((gVar.getNbb() * d14) / gVar.getAw(), gVar.getZ() * gVar.getC()) * 100.0d;
        double d16 = dPow4 / 100.0d;
        double flRoot = gVar.getFlRoot() * (gVar.getAw() + 4.0d) * Math.sqrt(d16) * (4.0d / gVar.getC());
        double dPow5 = Math.pow((Math.hypot(d10, d11) * (gVar.getNcb() * (gVar.getNc() * (((Math.cos(Math.toRadians(d15 < 20.14d ? d15 + 360.0d : d15) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d)))) / (d13 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, gVar.getN()), 0.73d);
        double dSqrt = Math.sqrt(d16) * dPow5;
        double flRoot2 = gVar.getFlRoot() * dSqrt;
        double dSqrt2 = Math.sqrt((gVar.getC() * dPow5) / (gVar.getAw() + 4.0d)) * 50.0d;
        double d17 = (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new b(d15, dSqrt, dPow4, flRoot, flRoot2, dSqrt2, d17, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public double distance(b bVar) {
        double jstar = getJstar() - bVar.getJstar();
        double astar = getAstar() - bVar.getAstar();
        double bstar = getBstar() - bVar.getBstar();
        return Math.pow(Math.sqrt((bstar * bstar) + (astar * astar) + (jstar * jstar)), 0.63d) * 1.41d;
    }

    public double getAstar() {
        return this.h;
    }

    public double getBstar() {
        return this.i;
    }

    public double getChroma() {
        return this.b;
    }

    public double getHue() {
        return this.a;
    }

    public double getJ() {
        return this.c;
    }

    public double getJstar() {
        return this.g;
    }

    public double getM() {
        return this.e;
    }

    public double getQ() {
        return this.d;
    }

    public double getS() {
        return this.f;
    }

    public int toInt() {
        return viewed(g.k);
    }

    public int viewed(g gVar) {
        double[] dArrXyzInViewingConditions = xyzInViewingConditions(gVar, this.j);
        return c.argbFromXyz(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2]);
    }

    public double[] xyzInViewingConditions(g gVar, double[] dArr) {
        double dPow = Math.pow(((getChroma() == 0.0d || getJ() == 0.0d) ? 0.0d : getChroma() / Math.sqrt(getJ() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, gVar.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double dPow2 = Math.pow(getJ() / 100.0d, (1.0d / gVar.getC()) / gVar.getZ()) * gVar.getAw();
        double ncb = gVar.getNcb() * gVar.getNc() * dCos * 3846.153846153846d;
        double nbb = dPow2 / gVar.getNbb();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double d = (((0.305d + nbb) * 23.0d) * dPow) / (((dPow * 108.0d) * dSin) + (((11.0d * dPow) * dCos2) + (ncb * 23.0d)));
        double d2 = dCos2 * d;
        double d3 = d * dSin;
        double d4 = nbb * 460.0d;
        double d5 = ((288.0d * d3) + ((451.0d * d2) + d4)) / 1403.0d;
        double d6 = ((d4 - (891.0d * d2)) - (261.0d * d3)) / 1403.0d;
        double d7 = ((d4 - (d2 * 220.0d)) - (d3 * 6300.0d)) / 1403.0d;
        double dPow3 = Math.pow(Math.max(0.0d, (Math.abs(d5) * 27.13d) / (400.0d - Math.abs(d5))), 2.380952380952381d) * (100.0d / gVar.getFl()) * Math.signum(d5);
        double dPow4 = Math.pow(Math.max(0.0d, (Math.abs(d6) * 27.13d) / (400.0d - Math.abs(d6))), 2.380952380952381d) * (100.0d / gVar.getFl()) * Math.signum(d6);
        double dPow5 = Math.pow(Math.max(0.0d, (Math.abs(d7) * 27.13d) / (400.0d - Math.abs(d7))), 2.380952380952381d) * (100.0d / gVar.getFl()) * Math.signum(d7);
        double d8 = dPow3 / gVar.getRgbD()[0];
        double d9 = dPow4 / gVar.getRgbD()[1];
        double d10 = dPow5 / gVar.getRgbD()[2];
        double[][] dArr2 = l;
        double[] dArr3 = dArr2[0];
        double d11 = (dArr3[2] * d10) + (dArr3[1] * d9) + (dArr3[0] * d8);
        double[] dArr4 = dArr2[1];
        double d12 = (dArr4[2] * d10) + (dArr4[1] * d9) + (dArr4[0] * d8);
        double[] dArr5 = dArr2[2];
        double d13 = (d10 * dArr5[2]) + (d9 * dArr5[1]) + (d8 * dArr5[0]);
        if (dArr == null) {
            return new double[]{d11, d12, d13};
        }
        dArr[0] = d11;
        dArr[1] = d12;
        dArr[2] = d13;
        return dArr;
    }
}
