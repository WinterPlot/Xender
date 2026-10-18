package com.google.zxing.common;

import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private final byte[] a;
    private int b;
    private int c;

    public c(byte[] bArr) {
        this.a = bArr;
    }

    public int available() {
        return ((this.a.length - this.b) * 8) - this.c;
    }

    public int getBitOffset() {
        return this.c;
    }

    public int getByteOffset() {
        return this.b;
    }

    public int readBits(int i) {
        if (i < 1 || i > 32 || i > available()) {
            b0.i(String.valueOf(i));
            return 0;
        }
        int i2 = this.c;
        int i3 = 0;
        if (i2 > 0) {
            int i4 = 8 - i2;
            int iMin = Math.min(i, i4);
            int i5 = i4 - iMin;
            byte[] bArr = this.a;
            int i6 = this.b;
            int i7 = (((255 >> (8 - iMin)) << i5) & bArr[i6]) >> i5;
            i -= iMin;
            int i8 = this.c + iMin;
            this.c = i8;
            if (i8 == 8) {
                this.c = 0;
                this.b = i6 + 1;
            }
            i3 = i7;
        }
        if (i > 0) {
            while (i >= 8) {
                int i9 = i3 << 8;
                byte[] bArr2 = this.a;
                int i10 = this.b;
                i3 = (bArr2[i10] & 255) | i9;
                this.b = i10 + 1;
                i -= 8;
            }
            if (i > 0) {
                int i11 = 8 - i;
                int i12 = ((((255 >> i11) << i11) & this.a[this.b]) >> i11) | (i3 << i);
                this.c += i;
                return i12;
            }
        }
        return i3;
    }
}
