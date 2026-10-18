package com.google.zxing;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {
    private final e c;

    public d(e eVar) {
        super(eVar.getWidth(), eVar.getHeight());
        this.c = eVar;
    }

    @Override // com.google.zxing.e
    public e crop(int i, int i2, int i3, int i4) {
        return new d(this.c.crop(i, i2, i3, i4));
    }

    @Override // com.google.zxing.e
    public byte[] getMatrix() {
        byte[] matrix = this.c.getMatrix();
        int height = getHeight() * getWidth();
        byte[] bArr = new byte[height];
        for (int i = 0; i < height; i++) {
            bArr[i] = (byte) (255 - (matrix[i] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.e
    public byte[] getRow(int i, byte[] bArr) {
        byte[] row = this.c.getRow(i, bArr);
        int width = getWidth();
        for (int i2 = 0; i2 < width; i2++) {
            row[i2] = (byte) (255 - (row[i2] & 255));
        }
        return row;
    }

    @Override // com.google.zxing.e
    public e invert() {
        return this.c;
    }

    @Override // com.google.zxing.e
    public boolean isCropSupported() {
        return this.c.isCropSupported();
    }

    @Override // com.google.zxing.e
    public boolean isRotateSupported() {
        return this.c.isRotateSupported();
    }

    @Override // com.google.zxing.e
    public e rotateCounterClockwise() {
        return new d(this.c.rotateCounterClockwise());
    }

    @Override // com.google.zxing.e
    public e rotateCounterClockwise45() {
        return new d(this.c.rotateCounterClockwise45());
    }
}
