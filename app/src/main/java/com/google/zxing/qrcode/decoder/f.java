package com.google.zxing.qrcode.decoder;

import com.google.zxing.k;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    private final boolean a;

    public f(boolean z) {
        this.a = z;
    }

    public void applyMirroredCorrection(k[] kVarArr) {
        if (!this.a || kVarArr == null || kVarArr.length < 3) {
            return;
        }
        k kVar = kVarArr[0];
        kVarArr[0] = kVarArr[2];
        kVarArr[2] = kVar;
    }

    public boolean isMirrored() {
        return this.a;
    }
}
