package com.google.zxing;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class k {
    private final float a;
    private final float b;

    public k(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    private static float crossProductZ(k kVar, k kVar2, k kVar3) {
        float f = kVar2.a;
        float f2 = kVar2.b;
        return ((kVar.b - f2) * (kVar3.a - f)) - ((kVar.a - f) * (kVar3.b - f2));
    }

    public static float distance(k kVar, k kVar2) {
        return com.google.zxing.common.detector.a.distance(kVar.a, kVar.b, kVar2.a, kVar2.b);
    }

    public static void orderBestPatterns(k[] kVarArr) {
        k kVar;
        k kVar2;
        k kVar3;
        float fDistance = distance(kVarArr[0], kVarArr[1]);
        float fDistance2 = distance(kVarArr[1], kVarArr[2]);
        float fDistance3 = distance(kVarArr[0], kVarArr[2]);
        if (fDistance2 >= fDistance && fDistance2 >= fDistance3) {
            kVar = kVarArr[0];
            kVar2 = kVarArr[1];
            kVar3 = kVarArr[2];
        } else if (fDistance3 < fDistance2 || fDistance3 < fDistance) {
            kVar = kVarArr[2];
            kVar2 = kVarArr[0];
            kVar3 = kVarArr[1];
        } else {
            kVar = kVarArr[1];
            kVar2 = kVarArr[0];
            kVar3 = kVarArr[2];
        }
        if (crossProductZ(kVar2, kVar, kVar3) < 0.0f) {
            k kVar4 = kVar3;
            kVar3 = kVar2;
            kVar2 = kVar4;
        }
        kVarArr[0] = kVar2;
        kVarArr[1] = kVar;
        kVarArr[2] = kVar3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.a == kVar.a && this.b == kVar.b) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.a;
    }

    public final float getY() {
        return this.b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "(" + this.a + ',' + this.b + ')';
    }
}
