package com.google.zxing.qrcode.detector;

import com.google.zxing.k;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends k {
    private final float c;
    private final int d;

    private d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.c = f3;
        this.d = i;
    }

    public boolean aboutEquals(float f, float f2, float f3) {
        if (Math.abs(f2 - getY()) > f || Math.abs(f3 - getX()) > f) {
            return false;
        }
        float fAbs = Math.abs(f - this.c);
        return fAbs <= 1.0f || fAbs <= this.c;
    }

    public d combineEstimate(float f, float f2, float f3) {
        int i = this.d;
        int i2 = i + 1;
        float x = (getX() * i) + f2;
        float f4 = i2;
        return new d(x / f4, ((getY() * this.d) + f) / f4, ((this.d * this.c) + f3) / f4, i2);
    }

    public int getCount() {
        return this.d;
    }

    public float getEstimatedModuleSize() {
        return this.c;
    }

    public d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }
}
