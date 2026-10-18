package com.google.zxing.pdf417.decoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class d {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e = -1;

    public d(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public int getBucket() {
        return this.c;
    }

    public int getEndX() {
        return this.b;
    }

    public int getRowNumber() {
        return this.e;
    }

    public int getStartX() {
        return this.a;
    }

    public int getValue() {
        return this.d;
    }

    public int getWidth() {
        return this.b - this.a;
    }

    public boolean hasValidRowNumber() {
        return isValidRowNumber(this.e);
    }

    public boolean isValidRowNumber(int i) {
        return i != -1 && this.c == (i % 3) * 3;
    }

    public void setRowNumber(int i) {
        this.e = i;
    }

    public void setRowNumberAsRowIndicatorColumn() {
        this.e = (this.c / 3) + ((this.d / 30) * 3);
    }

    public String toString() {
        return this.e + "|" + this.d;
    }
}
