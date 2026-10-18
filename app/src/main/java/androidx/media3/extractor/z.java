package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class z implements j0 {
    private final j0 a;

    public z(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // androidx.media3.extractor.j0
    public long getDurationUs() {
        return this.a.getDurationUs();
    }

    @Override // androidx.media3.extractor.j0
    public j0.a getSeekPoints(long j) {
        return this.a.getSeekPoints(j);
    }

    @Override // androidx.media3.extractor.j0
    public boolean isEstimated() {
        return this.a.isEstimated();
    }

    @Override // androidx.media3.extractor.j0
    public boolean isSeekable() {
        return this.a.isSeekable();
    }
}
