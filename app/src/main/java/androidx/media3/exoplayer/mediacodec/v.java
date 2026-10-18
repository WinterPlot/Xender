package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class v implements m {
    private final MediaCodec a;

    public v(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void queueSecureInputBuffer(int i, int i2, androidx.media3.decoder.c cVar, long j, int i3) {
        this.a.queueSecureInputBuffer(i, i2, cVar.getFrameworkCryptoInfo(), j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void maybeThrowException() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void start() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void waitUntilQueueingComplete() {
    }
}
