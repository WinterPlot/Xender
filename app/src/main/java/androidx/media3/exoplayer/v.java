package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements com.google.common.base.u {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.media3.exoplayer.upstream.d b;

    public /* synthetic */ v(androidx.media3.exoplayer.upstream.d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // com.google.common.base.u
    public final Object get() {
        int i = this.a;
        androidx.media3.exoplayer.upstream.d dVar = this.b;
        switch (i) {
            case 0:
                return ExoPlayer.b.lambda$setBandwidthMeter$20(dVar);
            default:
                return ExoPlayer.b.lambda$new$12(dVar);
        }
    }
}
