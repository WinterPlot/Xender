package com.google.zxing.aztec.encoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private com.google.zxing.common.b e;

    public int getCodeWords() {
        return this.d;
    }

    public int getLayers() {
        return this.c;
    }

    public com.google.zxing.common.b getMatrix() {
        return this.e;
    }

    public int getSize() {
        return this.b;
    }

    public boolean isCompact() {
        return this.a;
    }

    public void setCodeWords(int i) {
        this.d = i;
    }

    public void setCompact(boolean z) {
        this.a = z;
    }

    public void setLayers(int i) {
        this.c = i;
    }

    public void setMatrix(com.google.zxing.common.b bVar) {
        this.e = bVar;
    }

    public void setSize(int i) {
        this.b = i;
    }
}
