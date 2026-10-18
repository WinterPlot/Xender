package com.google.zxing.pdf417.decoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class a {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i4;
        this.c = i2;
        this.d = i3;
        this.e = i2 + i3;
    }

    public int getColumnCount() {
        return this.a;
    }

    public int getErrorCorrectionLevel() {
        return this.b;
    }

    public int getRowCount() {
        return this.e;
    }

    public int getRowCountLowerPart() {
        return this.d;
    }

    public int getRowCountUpperPart() {
        return this.c;
    }
}
