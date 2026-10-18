package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k.d b;
    public final /* synthetic */ k c;

    public /* synthetic */ b(k kVar, k.d dVar, int i) {
        this.a = i;
        this.c = kVar;
        this.b = dVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.a;
        k kVar = this.c;
        switch (i) {
            case 0:
                ((c) kVar).lambda$setOnFrameRenderedListener$1(this.b, mediaCodec, j, j2);
                break;
            default:
                ((u) kVar).lambda$setOnFrameRenderedListener$0(this.b, mediaCodec, j, j2);
                break;
        }
    }
}
