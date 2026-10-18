package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements j0 {
    private final long a;
    private final long b;

    public m0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // androidx.media3.extractor.j0
    public long getDurationUs() {
        return this.a;
    }

    @Override // androidx.media3.extractor.j0
    public j0.a getSeekPoints(long j) {
        return new j0.a(new k0(j, this.b));
    }

    @Override // androidx.media3.extractor.j0
    public boolean isEstimated() {
        return false;
    }

    @Override // androidx.media3.extractor.j0
    public boolean isSeekable() {
        return true;
    }

    public m0(long j) {
        this(j, 0L);
    }
}
