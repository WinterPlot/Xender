package androidx.core.content.res;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    public a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    private static a findCamByJ(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        a aVar = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int iViewedInSrgb = fromJch(f8, f2, f).viewedInSrgb();
            float fLStarFromInt = b.lStarFromInt(iViewedInSrgb);
            float fAbs = Math.abs(f3 - fLStarFromInt);
            if (fAbs < 0.2f) {
                a aVarFromColor = fromColor(iViewedInSrgb);
                float fDistance = aVarFromColor.distance(fromJch(aVarFromColor.getJ(), aVarFromColor.getChroma(), f));
                if (fDistance <= 1.0f) {
                    aVar = aVarFromColor;
                    f5 = fAbs;
                    f7 = fDistance;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                return aVar;
            }
            if (fLStarFromInt < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return aVar;
    }

    public static a fromColor(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        fromColorInViewingConditions(i, j.k, fArr, fArr2);
        return new a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void fromColorInViewingConditions(int i, j jVar, float[] fArr, float[] fArr2) {
        b.xyzFromInt(i, fArr2);
        float[][] fArr3 = b.a;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0] * f;
        float f3 = fArr2[1];
        float f4 = (fArr4[1] * f3) + f2;
        float f5 = fArr2[2];
        float f6 = (fArr4[2] * f5) + f4;
        float[] fArr5 = fArr3[1];
        float f7 = (fArr5[2] * f5) + (fArr5[1] * f3) + (fArr5[0] * f);
        float[] fArr6 = fArr3[2];
        float f8 = (f5 * fArr6[2]) + (f3 * fArr6[1]) + (f * fArr6[0]);
        float f9 = jVar.getRgbD()[0] * f6;
        float f10 = jVar.getRgbD()[1] * f7;
        float f11 = jVar.getRgbD()[2] * f8;
        float fPow = (float) Math.pow(((double) (Math.abs(f9) * jVar.getFl())) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f10) * jVar.getFl())) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f11) * jVar.getFl())) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f9) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f10) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f11) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f12 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f13 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f14)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f16 * jVar.getNbb()) / jVar.getAw(), jVar.getC() * jVar.getZ())) * 100.0f;
        float aw = (jVar.getAw() + 4.0f) * (4.0f / jVar.getC()) * ((float) Math.sqrt(fPow4 / 100.0f)) * jVar.getFlRoot();
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, jVar.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? fAtan2 + 360.0f : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * jVar.getNc()) * jVar.getNcb()) * ((float) Math.sqrt((f13 * f13) + (f12 * f12)))) / (f15 + 0.305f), 0.9d));
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float flRoot = jVar.getFlRoot() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((fPow5 * jVar.getC()) / (jVar.getAw() + 4.0f))) * 50.0f;
        float f18 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
        double d2 = f17;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = aw;
            fArr[2] = flRoot;
            fArr[3] = fSqrt2;
            fArr[4] = f18;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    private static a fromJch(float f, float f2, float f3) {
        return fromJchInFrame(f, f2, f3, j.k);
    }

    private static a fromJchInFrame(float f, float f2, float f3, j jVar) {
        double d = ((double) f) / 100.0d;
        float aw = (jVar.getAw() + 4.0f) * (4.0f / jVar.getC()) * ((float) Math.sqrt(d)) * jVar.getFlRoot();
        float flRoot = jVar.getFlRoot() * f2;
        float fSqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * jVar.getC()) / (jVar.getAw() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) flRoot) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new a(f3, f2, f, aw, flRoot, fSqrt, f4, ((float) Math.cos(d2)) * fLog, fLog * ((float) Math.sin(d2)));
    }

    public static void getM3HCTfromColor(int i, float[] fArr) {
        fromColorInViewingConditions(i, j.k, null, fArr);
        fArr[2] = b.lStarFromInt(i);
    }

    public static int toColor(float f, float f2, float f3, j jVar) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return b.intFromLStar(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        a aVar = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            a aVarFindCamByJ = findCamByJ(fMin, f5, f3);
            if (!z) {
                if (aVarFindCamByJ == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    aVar = aVarFindCamByJ;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (aVarFindCamByJ != null) {
                    return aVarFindCamByJ.viewed(jVar);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        return aVar == null ? b.intFromLStar(f3) : aVar.viewed(jVar);
    }

    public float distance(a aVar) {
        float jStar = getJStar() - aVar.getJStar();
        float aStar = getAStar() - aVar.getAStar();
        float bStar = getBStar() - aVar.getBStar();
        return (float) (Math.pow(Math.sqrt((bStar * bStar) + (aStar * aStar) + (jStar * jStar)), 0.63d) * 1.41d);
    }

    public float getAStar() {
        return this.h;
    }

    public float getBStar() {
        return this.i;
    }

    public float getChroma() {
        return this.b;
    }

    public float getHue() {
        return this.a;
    }

    public float getJ() {
        return this.c;
    }

    public float getJStar() {
        return this.g;
    }

    public float getM() {
        return this.e;
    }

    public float getQ() {
        return this.d;
    }

    public float getS() {
        return this.f;
    }

    public int viewed(j jVar) {
        float fPow = (float) Math.pow(((double) ((((double) getChroma()) == 0.0d || ((double) getJ()) == 0.0d) ? 0.0f : getChroma() / ((float) Math.sqrt(((double) getJ()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, jVar.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f;
        float aw = jVar.getAw() * ((float) Math.pow(((double) getJ()) / 100.0d, (1.0d / ((double) jVar.getC())) / ((double) jVar.getZ())));
        float nc = fCos * 3846.1538f * jVar.getNc() * jVar.getNcb();
        float nbb = aw / jVar.getNbb();
        float fSin = (float) Math.sin(hue);
        float fCos2 = (float) Math.cos(hue);
        float f = (((0.305f + nbb) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (nc * 23.0f)));
        float f2 = fCos2 * f;
        float f3 = f * fSin;
        float f4 = nbb * 460.0f;
        float f5 = ((288.0f * f3) + ((451.0f * f2) + f4)) / 1403.0f;
        float f6 = ((f4 - (891.0f * f2)) - (261.0f * f3)) / 1403.0f;
        float f7 = ((f4 - (f2 * 220.0f)) - (f3 * 6300.0f)) / 1403.0f;
        float fl = (100.0f / jVar.getFl()) * Math.signum(f5) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f5)) * 27.13d) / (400.0d - ((double) Math.abs(f5)))), 2.380952380952381d));
        float fl2 = (100.0f / jVar.getFl()) * Math.signum(f6) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6)))), 2.380952380952381d));
        float fl3 = (100.0f / jVar.getFl()) * Math.signum(f7) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float f8 = fl / jVar.getRgbD()[0];
        float f9 = fl2 / jVar.getRgbD()[1];
        float f10 = fl3 / jVar.getRgbD()[2];
        float[][] fArr = b.b;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[2] * f10) + (fArr2[1] * f9) + (fArr2[0] * f8);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[2] * f10) + (fArr3[1] * f9) + (fArr3[0] * f8);
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.b.XYZToColor(f11, f12, (f10 * fArr4[2]) + (f9 * fArr4[1]) + (f8 * fArr4[0]));
    }

    public int viewedInSrgb() {
        return viewed(j.k);
    }

    public static int toColor(float f, float f2, float f3) {
        return toColor(f, f2, f3, j.k);
    }
}
