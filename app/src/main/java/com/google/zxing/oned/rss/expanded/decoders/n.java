package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class n extends p {
    private final String b;
    private final int c;
    private final boolean d;

    public n(int i, String str) {
        super(i);
        this.b = str;
        this.d = false;
        this.c = 0;
    }

    public String getNewString() {
        return this.b;
    }

    public int getRemainingValue() {
        return this.c;
    }

    public boolean isRemaining() {
        return this.d;
    }

    public n(int i, String str, int i2) {
        super(i);
        this.d = true;
        this.c = i2;
        this.b = str;
    }
}
