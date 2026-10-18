package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class l {
    private final n a;
    private final boolean b;

    public l(n nVar, boolean z) {
        this.b = z;
        this.a = nVar;
    }

    public n getDecodedInformation() {
        return this.a;
    }

    public boolean isFinished() {
        return this.b;
    }

    public l() {
        this(null, false);
    }
}
