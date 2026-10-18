package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class e {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final byte[] d;

    public e(CharSequence charSequence, int i, int i2) {
        this.a = charSequence;
        this.c = i;
        this.b = i2;
        byte[] bArr = new byte[i * i2];
        this.d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void corner1(int i) {
        module(this.b - 1, 0, i, 1);
        module(this.b - 1, 1, i, 2);
        module(this.b - 1, 2, i, 3);
        module(0, this.c - 2, i, 4);
        module(0, this.c - 1, i, 5);
        module(1, this.c - 1, i, 6);
        module(2, this.c - 1, i, 7);
        module(3, this.c - 1, i, 8);
    }

    private void corner2(int i) {
        module(this.b - 3, 0, i, 1);
        module(this.b - 2, 0, i, 2);
        module(this.b - 1, 0, i, 3);
        module(0, this.c - 4, i, 4);
        module(0, this.c - 3, i, 5);
        module(0, this.c - 2, i, 6);
        module(0, this.c - 1, i, 7);
        module(1, this.c - 1, i, 8);
    }

    private void corner3(int i) {
        module(this.b - 3, 0, i, 1);
        module(this.b - 2, 0, i, 2);
        module(this.b - 1, 0, i, 3);
        module(0, this.c - 2, i, 4);
        module(0, this.c - 1, i, 5);
        module(1, this.c - 1, i, 6);
        module(2, this.c - 1, i, 7);
        module(3, this.c - 1, i, 8);
    }

    private void corner4(int i) {
        module(this.b - 1, 0, i, 1);
        module(this.b - 1, this.c - 1, i, 2);
        module(0, this.c - 3, i, 3);
        module(0, this.c - 2, i, 4);
        module(0, this.c - 1, i, 5);
        module(1, this.c - 3, i, 6);
        module(1, this.c - 2, i, 7);
        module(1, this.c - 1, i, 8);
    }

    private void module(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        setBit(i2, i, (this.a.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    private boolean noBit(int i, int i2) {
        return this.d[(i2 * this.c) + i] < 0;
    }

    private void setBit(int i, int i2, boolean z) {
        this.d[(i2 * this.c) + i] = z ? (byte) 1 : (byte) 0;
    }

    private void utah(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        module(i4, i5, i3, 1);
        int i6 = i2 - 1;
        module(i4, i6, i3, 2);
        int i7 = i - 1;
        module(i7, i5, i3, 3);
        module(i7, i6, i3, 4);
        module(i7, i2, i3, 5);
        module(i, i5, i3, 6);
        module(i, i6, i3, 7);
        module(i, i2, i3, 8);
    }

    public final boolean getBit(int i, int i2) {
        return this.d[(i2 * this.c) + i] == 1;
    }

    public final byte[] getBits() {
        return this.d;
    }

    public final int getNumcols() {
        return this.c;
    }

    public final int getNumrows() {
        return this.b;
    }

    public final void place() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.b && i3 == 0) {
                corner1(i4);
                i4++;
            }
            if (i5 == this.b - 2 && i3 == 0 && this.c % 4 != 0) {
                corner2(i4);
                i4++;
            }
            if (i5 == this.b - 2 && i3 == 0 && this.c % 8 == 4) {
                corner3(i4);
                i4++;
            }
            if (i5 == this.b + 4 && i3 == 2 && this.c % 8 == 0) {
                corner4(i4);
                i4++;
            }
            while (true) {
                if (i5 < this.b && i3 >= 0 && noBit(i3, i5)) {
                    utah(i5, i3, i4);
                    i4++;
                }
                int i6 = i5 - 2;
                int i7 = i3 + 2;
                if (i6 < 0 || i7 >= this.c) {
                    break;
                }
                i5 = i6;
                i3 = i7;
            }
            int i8 = i5 - 1;
            int i9 = i3 + 5;
            while (true) {
                if (i8 >= 0 && i9 < this.c && noBit(i9, i8)) {
                    utah(i8, i9, i4);
                    i4++;
                }
                int i10 = i8 + 2;
                int i11 = i9 - 2;
                i = this.b;
                if (i10 >= i || i11 < 0) {
                    break;
                }
                i8 = i10;
                i9 = i11;
            }
            i5 = i8 + 5;
            i3 = i9 - 1;
            if (i5 >= i && i3 >= (i2 = this.c)) {
                break;
            }
        }
        if (noBit(i2 - 1, i - 1)) {
            setBit(this.c - 1, this.b - 1, true);
            setBit(this.c - 2, this.b - 2, true);
        }
    }
}
