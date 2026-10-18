package com.google.zxing.pdf417.encoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public c(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public int getMaxCols() {
        return this.b;
    }

    public int getMaxRows() {
        return this.d;
    }

    public int getMinCols() {
        return this.a;
    }

    public int getMinRows() {
        return this.c;
    }
}
