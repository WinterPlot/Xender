package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    private void addVideoFrameProcessingOffsets(long j, int i) {
        this.k += j;
        this.l += i;
    }

    public void addVideoFrameProcessingOffset(long j) {
        addVideoFrameProcessingOffsets(j, 1);
    }

    public synchronized void ensureUpdated() {
    }

    public void merge(e eVar) {
        this.a += eVar.a;
        this.b += eVar.b;
        this.c += eVar.c;
        this.d += eVar.d;
        this.e += eVar.e;
        this.f += eVar.f;
        this.g += eVar.g;
        this.h += eVar.h;
        this.i = Math.max(this.i, eVar.i);
        this.j += eVar.j;
        addVideoFrameProcessingOffsets(eVar.k, eVar.l);
    }

    public String toString() {
        return androidx.media3.common.util.n0.formatInvariant("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Long.valueOf(this.k), Integer.valueOf(this.l));
    }
}
