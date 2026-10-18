package androidx.camera.video.internal.muxer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaMuxerImpl b;

    public /* synthetic */ c(MediaMuxerImpl mediaMuxerImpl, int i) {
        this.a = i;
        this.b = mediaMuxerImpl;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        MediaMuxerImpl mediaMuxerImpl = this.b;
        switch (i) {
            case 0:
                return MediaMuxerImpl.start$lambda$1(mediaMuxerImpl);
            default:
                return MediaMuxerImpl.stop$lambda$1(mediaMuxerImpl);
        }
    }
}
