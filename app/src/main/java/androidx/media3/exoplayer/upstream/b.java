package androidx.media3.exoplayer.upstream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        androidx.media3.exoplayer.upstream.a getAllocation();

        a next();
    }

    androidx.media3.exoplayer.upstream.a allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(androidx.media3.exoplayer.upstream.a aVar);

    void release(a aVar);

    void trim();
}
