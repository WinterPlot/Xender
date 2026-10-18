package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private final b[] a;
    private int b;
    private final int c;
    private final int d;

    public a(int i, int i2) {
        b[] bVarArr = new b[i];
        this.a = bVarArr;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.a[i3] = new b(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    public b getCurrentRow() {
        return this.a[this.b];
    }

    public byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    public byte[][] getScaledMatrix(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.c * i2, this.d * i);
        int i3 = this.c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.a[i4 / i2].getScaledRow(i);
        }
        return bArr;
    }

    public void set(int i, int i2, byte b) {
        this.a[i2].set(i, b);
    }

    public void startRow() {
        this.b++;
    }
}
