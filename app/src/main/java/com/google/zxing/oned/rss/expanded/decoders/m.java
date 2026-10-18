package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class m extends p {
    private final char b;

    public m(int i, char c) {
        super(i);
        this.b = c;
    }

    public char getValue() {
        return this.b;
    }

    public boolean isFNC1() {
        return this.b == '$';
    }
}
