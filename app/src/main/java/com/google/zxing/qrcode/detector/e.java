package com.google.zxing.qrcode.detector;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    private final d a;
    private final d b;
    private final d c;

    public e(d[] dVarArr) {
        this.a = dVarArr[0];
        this.b = dVarArr[1];
        this.c = dVarArr[2];
    }

    public d getBottomLeft() {
        return this.a;
    }

    public d getTopLeft() {
        return this.b;
    }

    public d getTopRight() {
        return this.c;
    }
}
