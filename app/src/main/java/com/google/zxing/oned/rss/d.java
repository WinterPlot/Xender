package com.google.zxing.oned.rss;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class d extends b {
    private final c c;
    private int d;

    public d(int i, int i2, c cVar) {
        super(i, i2);
        this.c = cVar;
    }

    public int getCount() {
        return this.d;
    }

    public c getFinderPattern() {
        return this.c;
    }

    public void incrementCount() {
        this.d++;
    }
}
