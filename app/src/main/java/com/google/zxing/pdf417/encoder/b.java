package com.google.zxing.pdf417.encoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class b {
    private final byte[] a;
    private int b = 0;

    public b(int i) {
        this.a = new byte[i];
    }

    private void set(int i, boolean z) {
        this.a[i] = z ? (byte) 1 : (byte) 0;
    }

    public void addBar(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.b;
            this.b = i3 + 1;
            set(i3, z);
        }
    }

    public byte[] getScaledRow(int i) {
        int length = this.a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.a[i2 / i];
        }
        return bArr;
    }

    public void set(int i, byte b) {
        this.a[i] = b;
    }
}
