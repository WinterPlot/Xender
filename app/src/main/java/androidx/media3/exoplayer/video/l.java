package androidx.media3.exoplayer.video;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoSink.a b;

    public /* synthetic */ l(VideoSink.a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        VideoSink.a aVar = this.b;
        switch (i) {
            case 0:
                aVar.onFrameDropped();
                break;
            case 1:
                aVar.onFirstFrameRendered();
                break;
            default:
                aVar.onFrameAvailableForRendering();
                break;
        }
    }
}
