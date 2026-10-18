package com.google.zxing.qrcode.detector;

import com.google.zxing.k;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends k {
    private final float c;

    public a(float f, float f2, float f3) {
        super(f, f2);
        this.c = f3;
    }

    public boolean aboutEquals(float f, float f2, float f3) {
        if (Math.abs(f2 - getY()) > f || Math.abs(f3 - getX()) > f) {
            return false;
        }
        float fAbs = Math.abs(f - this.c);
        return fAbs <= 1.0f || fAbs <= this.c;
    }

    public a combineEstimate(float f, float f2, float f3) {
        return new a((getX() + f2) / 2.0f, (getY() + f) / 2.0f, (this.c + f3) / 2.0f);
    }
}
