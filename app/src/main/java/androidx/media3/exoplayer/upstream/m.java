package androidx.media3.exoplayer.upstream;

import androidx.media3.exoplayer.analytics.e0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface m extends b {
    @Override // androidx.media3.exoplayer.upstream.b
    /* synthetic */ a allocate();

    @Override // androidx.media3.exoplayer.upstream.b
    /* synthetic */ int getIndividualAllocationLength();

    @Override // androidx.media3.exoplayer.upstream.b
    int getTotalBytesAllocated();

    @Override // androidx.media3.exoplayer.upstream.b
    /* synthetic */ void release(a aVar);
