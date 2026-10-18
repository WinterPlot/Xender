package com.google.zxing.qrcode.encoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class a {
    private final byte[] a;
    private final byte[] b;

    public a(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public byte[] getDataBytes() {
        return this.a;
    }

    public byte[] getErrorCorrectionBytes() {
        return this.b;
    }
}
