package com.google.zxing.datamatrix.decoder;

import com.userlabs.xshare.core.create.XCreateApException;
import com.google.zxing.FormatException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static final d[] h = buildVersions();
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final c f;
    private final int g;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        private final int a;
        private final int b;

        private b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int getCount() {
            return this.a;
        }

        public int getDataCodewords() {
            return this.b;
        }
    }

    private d(int i, int i2, int i3, int i4, int i5, c cVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = cVar;
        int eCCodewords = cVar.getECCodewords();
        int dataCodewords = 0;
        for (b bVar : cVar.getECBlocks()) {
            dataCodewords += (bVar.getDataCodewords() + eCCodewords) * bVar.getCount();
        }
        this.g = dataCodewords;
    }

    private static d[] buildVersions() {
        int i = 1;
        int i2 = 5;
        d dVar = new d(1, 10, 10, 8, 8, new c(i2, new b(i, 3)));
        d dVar2 = new d(2, 12, 12, 10, 10, new c(7, new b(i, i2)));
        d dVar3 = new d(3, 14, 14, 12, 12, new c(10, new b(i, 8)));
        int i3 = 12;
        d dVar4 = new d(4, 16, 16, 14, 14, new c(i3, new b(i, i3)));
        int i4 = 18;
        d dVar5 = new d(5, 18, 18, 16, 16, new c(14, new b(i, i4)));
        d dVar6 = new d(6, 20, 20, 18, 18, new c(i4, new b(i, 22)));
        d dVar7 = new d(7, 22, 22, 20, 20, new c(20, new b(i, 30)));
        int i5 = 36;
        d dVar8 = new d(8, 24, 24, 22, 22, new c(24, new b(i, i5)));
        d dVar9 = new d(9, 26, 26, 24, 24, new c(28, new b(i, 44)));
        d dVar10 = new d(10, 32, 32, 14, 14, new c(i5, new b(i, 62)));
        int i6 = 42;
        d dVar11 = new d(11, 36, 36, 16, 16, new c(i6, new b(i, 86)));
        int i7 = 114;
        int i8 = 48;
        d dVar12 = new d(12, 40, 40, 18, 18, new c(i8, new b(i, i7)));
        int i9 = 144;
        int i10 = 56;
        d dVar13 = new d(13, 44, 44, 20, 20, new c(i10, new b(i, i9)));
        d dVar14 = new d(14, 48, 48, 22, 22, new c(68, new b(i, 174)));
        int i11 = 2;
        d dVar15 = new d(15, 52, 52, 24, 24, new c(i6, new b(i11, XCreateApException.CODE_CLOSE_WIFI)));
        d dVar16 = new d(16, 64, 64, 14, 14, new c(i10, new b(i11, 140)));
        int i12 = 4;
        d dVar17 = new d(17, 72, 72, 16, 16, new c(i5, new b(i12, 92)));
        d dVar18 = new d(18, 80, 80, 18, 18, new c(i8, new b(i12, i7)));
        d dVar19 = new d(19, 88, 88, 20, 20, new c(i10, new b(i12, i9)));
        d dVar20 = new d(20, 96, 96, 22, 22, new c(68, new b(i12, 174)));
        int i13 = 6;
        d dVar21 = new d(21, XCreateApException.CODE_STATE_EX, XCreateApException.CODE_STATE_EX, 24, 24, new c(i10, new b(i13, 136)));
        d dVar22 = new d(22, 120, 120, 18, 18, new c(68, new b(i13, 175)));
        d dVar23 = new d(23, 132, 132, 20, 20, new c(62, new b(8, 163)));
        d dVar24 = new d(24, 144, 144, 22, 22, new c(62, new b(8, 156), new b(i11, 155)));
        int i14 = 1;
        d dVar25 = new d(25, 8, 18, 6, 16, new c(7, new b(i14, 5)));
        d dVar26 = new d(26, 8, 32, 6, 14, new c(11, new b(i14, 10)));
        int i15 = 1;
        d dVar27 = new d(27, 12, 26, 10, 24, new c(14, new b(i15, 16)));
        d dVar28 = new d(28, 12, 36, 10, 16, new c(18, new b(i15, 22)));
        int i16 = 32;
        d dVar29 = new d(29, 16, 36, 14, 16, new c(24, new b(1, i16)));
        int i17 = 1;
        d dVar30 = new d(30, 16, 48, 14, 22, new c(28, new b(i17, 49)));
        d dVar31 = new d(31, 8, 48, 6, 22, new c(15, new b(i17, 18)));
        int i18 = 1;
        d dVar32 = new d(32, 8, 64, 6, 14, new c(18, new b(i18, 24)));
        d dVar33 = new d(33, 8, 80, 6, 18, new c(22, new b(i18, i16)));
        int i19 = 38;
        int i20 = 1;
        return new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19, dVar20, dVar21, dVar22, dVar23, dVar24, dVar25, dVar26, dVar27, dVar28, dVar29, dVar30, dVar31, dVar32, dVar33, new d(34, 8, 96, 6, 22, new c(28, new b(1, i19))), new d(35, 8, 120, 6, 18, new c(i16, new b(1, 49))), new d(36, 8, 144, 6, 22, new c(i5, new b(1, 63))), new d(37, 12, 64, 10, 14, new c(27, new b(1, 43))), new d(38, 12, 88, 10, 20, new c(i5, new b(i20, 64))), new d(39, 16, 64, 14, 14, new c(i5, new b(i20, 62))), new d(40, 20, 36, 18, 16, new c(28, new b(i20, 44))), new d(41, 20, 44, 18, 20, new c(34, new b(i20, i10))), new d(42, 20, 64, 18, 14, new c(42, new b(1, 84))), new d(43, 22, 48, 20, 22, new c(i19, new b(1, 72))), new d(44, 24, 48, 22, 22, new c(41, new b(1, 80))), new d(45, 24, 64, 22, 14, new c(46, new b(1, 108))), new d(46, 26, 40, 24, 18, new c(i19, new b(1, 70))), new d(47, 26, 48, 24, 22, new c(42, new b(1, 90))), new d(48, 26, 64, 24, 14, new c(50, new b(1, 118)))};
    }

    public static d getVersionForDimensions(int i, int i2) throws FormatException {
        if ((i & 1) != 0 || (i2 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        for (d dVar : h) {
            if (dVar.b == i && dVar.c == i2) {
                return dVar;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public int getDataRegionSizeColumns() {
        return this.e;
    }

    public int getDataRegionSizeRows() {
        return this.d;
    }

    public c getECBlocks() {
        return this.f;
    }

    public int getSymbolSizeColumns() {
        return this.c;
    }

    public int getSymbolSizeRows() {
        return this.b;
    }

    public int getTotalCodewords() {
        return this.g;
    }

    public int getVersionNumber() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(this.a);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c {
        private final int a;
        private final b[] b;

        private c(int i, b bVar, b bVar2) {
            this.a = i;
            this.b = new b[]{bVar, bVar2};
        }

        public b[] getECBlocks() {
            return this.b;
        }

        public int getECCodewords() {
            return this.a;
        }

        private c(int i, b bVar) {
            this.a = i;
            this.b = new b[]{bVar};
        }
    }
}
