package com.google.zxing.common;

import java.util.Arrays;
import okhttp3.b0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Cloneable {
    private int a;
    private int b;
    private int c;
    private int[] d;

    public b(int i, int i2) {
        if (i < 1 || i2 < 1) {
            b0.i("Both dimensions must be greater than 0");
            throw null;
        }
        this.a = i;
        this.b = i2;
        int i3 = (i + 31) / 32;
        this.c = i3;
        this.d = new int[i3 * i2];
    }

    private String buildToString(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder((this.a + 1) * this.b);
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                sb.append(get(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public static b parse(String str, String str2, String str3) {
        if (str == null) {
            j0.d();
            return null;
        }
        boolean[] zArr = new boolean[str.length()];
        int i = -1;
        int length = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (length < str.length()) {
            if (str.charAt(length) == '\n' || str.charAt(length) == '\r') {
                if (i2 > i3) {
                    if (i == -1) {
                        i = i2 - i3;
                    } else if (i2 - i3 != i) {
                        b0.i("row lengths do not match");
                        return null;
                    }
                    i4++;
                    i3 = i2;
                }
                length++;
            } else {
                if (str.startsWith(str2, length)) {
                    length += str2.length();
                    zArr[i2] = true;
                } else {
                    if (!str.startsWith(str3, length)) {
                        b0.i("illegal character encountered: ".concat(str.substring(length)));
                        return null;
                    }
                    length += str3.length();
                    zArr[i2] = false;
                }
                i2++;
            }
        }
        if (i2 > i3) {
            if (i == -1) {
                i = i2 - i3;
            } else if (i2 - i3 != i) {
                b0.i("row lengths do not match");
                return null;
            }
            i4++;
        }
        b bVar = new b(i, i4);
        for (int i5 = 0; i5 < i2; i5++) {
            if (zArr[i5]) {
                bVar.set(i5 % i, i5 / i);
            }
        }
        return bVar;
    }

    public void clear() {
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            this.d[i] = 0;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b m1078clone() {
        return new b(this.a, this.b, this.c, (int[]) this.d.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Arrays.equals(this.d, bVar.d);
    }

    public void flip(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.c);
        int[] iArr = this.d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public boolean get(int i, int i2) {
        return ((this.d[(i / 32) + (i2 * this.c)] >>> (i & 31)) & 1) != 0;
    }

    public int[] getBottomRightOnBit() {
        int length = this.d.length - 1;
        while (length >= 0 && this.d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.c;
        int i2 = length / i;
        int i3 = (length % i) * 32;
        int i4 = this.d[length];
        int i5 = 31;
        while ((i4 >>> i5) == 0) {
            i5--;
        }
        return new int[]{i3 + i5, i2};
    }

    public int[] getEnclosingRectangle() {
        int i = this.a;
        int i2 = this.b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.c;
                if (i6 < i7) {
                    int i8 = this.d[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 * 32;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public int getHeight() {
        return this.b;
    }

    public a getRow(int i, a aVar) {
        if (aVar == null || aVar.getSize() < this.a) {
            aVar = new a(this.a);
        } else {
            aVar.clear();
        }
        int i2 = i * this.c;
        for (int i3 = 0; i3 < this.c; i3++) {
            aVar.setBulk(i3 * 32, this.d[i2 + i3]);
        }
        return aVar;
    }

    public int getRowSize() {
        return this.c;
    }

    public int[] getTopLeftOnBit() {
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.d;
            if (i2 >= iArr.length || iArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.c;
        int i4 = i2 / i3;
        int i5 = (i2 % i3) * 32;
        while ((iArr[i2] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{i5 + i, i4};
    }

    public int getWidth() {
        return this.a;
    }

    public int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.d) + ((((androidx.constraintlayout.core.motion.utils.m.H(i, 31, i, 31) + this.b) * 31) + this.c) * 31);
    }

    public void rotate(int i) {
        int i2 = i % 360;
        if (i2 != 0) {
            if (i2 == 90) {
                rotate90();
                return;
            }
            if (i2 == 180) {
                rotate180();
            } else if (i2 != 270) {
                b0.i("degrees must be a multiple of 0, 90, 180, or 270");
            } else {
                rotate90();
                rotate180();
            }
        }
    }

    public void rotate180() {
        a aVar = new a(this.a);
        a aVar2 = new a(this.a);
        int i = (this.b + 1) / 2;
        for (int i2 = 0; i2 < i; i2++) {
            aVar = getRow(i2, aVar);
            int i3 = (this.b - 1) - i2;
            aVar2 = getRow(i3, aVar2);
            aVar.reverse();
            aVar2.reverse();
            setRow(i2, aVar2);
            setRow(i3, aVar);
        }
    }

    public void rotate90() {
        int i = this.b;
        int i2 = this.a;
        int i3 = (i + 31) / 32;
        int[] iArr = new int[i3 * i2];
        for (int i4 = 0; i4 < this.b; i4++) {
            for (int i5 = 0; i5 < this.a; i5++) {
                if (((this.d[(i5 / 32) + (this.c * i4)] >>> (i5 & 31)) & 1) != 0) {
                    int i6 = (i4 / 32) + (((i2 - 1) - i5) * i3);
                    iArr[i6] = iArr[i6] | (1 << (i4 & 31));
                }
            }
        }
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
    }

    public void set(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.c);
        int[] iArr = this.d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void setRegion(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            b0.i("Left and top must be nonnegative");
            return;
        }
        if (i4 < 1 || i3 < 1) {
            b0.i("Height and width must be at least 1");
            return;
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.b || i5 > this.a) {
            b0.i("The region must fit inside the matrix");
            return;
        }
        while (i2 < i6) {
            int i7 = this.c * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.d;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public void setRow(int i, a aVar) {
        int[] bitArray = aVar.getBitArray();
        int[] iArr = this.d;
        int i2 = this.c;
        System.arraycopy(bitArray, 0, iArr, i * i2, i2);
    }

    public String toString() {
        return toString("X ", "  ");
    }

    public void unset(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.c);
        int[] iArr = this.d;
        iArr[i3] = (~(1 << (i & 31))) & iArr[i3];
    }

    public void xor(b bVar) {
        int i = this.a;
        if (i != bVar.a || this.b != bVar.b || this.c != bVar.c) {
            b0.i("input matrix dimensions do not match");
            return;
        }
        a aVar = new a(i);
        for (int i2 = 0; i2 < this.b; i2++) {
            int i3 = this.c * i2;
            int[] bitArray = bVar.getRow(i2, aVar).getBitArray();
            for (int i4 = 0; i4 < this.c; i4++) {
                int[] iArr = this.d;
                int i5 = i3 + i4;
                iArr[i5] = iArr[i5] ^ bitArray[i4];
            }
        }
    }

    public String toString(String str, String str2) {
        return buildToString(str, str2, "\n");
    }

    @Deprecated
    public String toString(String str, String str2, String str3) {
        return buildToString(str, str2, str3);
    }

    public void flip() {
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            int[] iArr = this.d;
            iArr[i] = ~iArr[i];
        }
    }

    public b(int i) {
        this(i, i);
    }

    private b(int i, int i2, int i3, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
    }

    public static b parse(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        b bVar = new b(length2, length);
        for (int i = 0; i < length; i++) {
            boolean[] zArr2 = zArr[i];
            for (int i2 = 0; i2 < length2; i2++) {
                if (zArr2[i2]) {
                    bVar.set(i2, i);
                }
            }
        }
        return bVar;
    }
}
