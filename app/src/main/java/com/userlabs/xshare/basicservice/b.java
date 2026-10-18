package com.userlabs.xshare.basicservice;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private byte[] a;
    private int b;

    public b() {
        this.b = 0;
        this.a = "3.14159265358979".getBytes(Charset.forName("utf-8"));
    }

    private void increaseIndex() {
        this.b = (this.b + 1) % this.a.length;
    }

    public byte[] xor(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ this.a[this.b]);
            increaseIndex();
        }
        return bArr2;
    }

    public b(String str) {
        this.b = 0;
        this.a = str.getBytes(Charset.forName("utf-8"));
    }

    public byte[] xor(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = (byte) (bArr[i3 + i] ^ this.a[this.b]);
            increaseIndex();
        }
        return bArr2;
    }

    public int xor(int i) {
        int i2 = i ^ this.a[this.b];
        increaseIndex();
        return i2;
    }
}
