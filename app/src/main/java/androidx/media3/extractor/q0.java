package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface q0 extends j0 {
    @Override // androidx.media3.extractor.j0
    /* synthetic */ long getDurationUs();

    @Override // androidx.media3.extractor.j0
    /* synthetic */ j0.a getSeekPoints(long j);

    j0.a getSeekPoints(long j, int i);

    @Override // androidx.media3.extractor.j0
    /* bridge */ /* synthetic */ boolean isEstimated();

    @Override // androidx.media3.extractor.j0
    /* synthetic */ boolean isSeekable();

    boolean isSeekable(int i);
}
