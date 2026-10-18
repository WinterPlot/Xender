package com.google.zxing.qrcode.decoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class e {
    private static final int[][] c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    private final ErrorCorrectionLevel a;
    private final byte b;

    private e(int i) {
        this.a = ErrorCorrectionLevel.forBits((i >> 3) & 3);
        this.b = (byte) (i & 7);
    }

    public static e decodeFormatInformation(int i, int i2) {
        e eVarDoDecodeFormatInformation = doDecodeFormatInformation(i, i2);
        return eVarDoDecodeFormatInformation != null ? eVarDoDecodeFormatInformation : doDecodeFormatInformation(i ^ 21522, i2 ^ 21522);
    }

    private static e doDecodeFormatInformation(int i, int i2) {
        int iNumBitsDiffering;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : c) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new e(iArr[1]);
            }
            int iNumBitsDiffering2 = numBitsDiffering(i, i5);
            if (iNumBitsDiffering2 < i3) {
                i4 = iArr[1];
                i3 = iNumBitsDiffering2;
            }
            if (i != i2 && (iNumBitsDiffering = numBitsDiffering(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = iNumBitsDiffering;
            }
        }
        if (i3 <= 3) {
            return new e(i4);
        }
        return null;
    }

    public static int numBitsDiffering(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    public byte getDataMask() {
        return this.b;
    }

    public ErrorCorrectionLevel getErrorCorrectionLevel() {
        return this.a;
    }

    public int hashCode() {
        return this.b | (this.a.ordinal() << 3);
    }
}
