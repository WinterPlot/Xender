package androidx.camera.video.internal.muxer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Media3MuxerImpl b;

    public /* synthetic */ b(Media3MuxerImpl media3MuxerImpl, int i) {
        this.a = i;
        this.b = media3MuxerImpl;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        Media3MuxerImpl media3MuxerImpl = this.b;
        switch (i) {
            case 0:
                return Media3MuxerImpl.stop$lambda$1(media3MuxerImpl);
            default:
                return Media3MuxerImpl.start$lambda$1(media3MuxerImpl);
        }
    }
}
