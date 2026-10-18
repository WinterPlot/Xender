package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements com.google.common.base.u {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1 b;

    public /* synthetic */ t(u1 u1Var, int i) {
        this.a = i;
        this.b = u1Var;
    }

    @Override // com.google.common.base.u
    public final Object get() {
        int i = this.a;
        u1 u1Var = this.b;
        switch (i) {
            case 0:
                return ExoPlayer.b.lambda$setRenderersFactory$16(u1Var);
            case 1:
                return ExoPlayer.b.lambda$new$6(u1Var);
            case 2:
                return ExoPlayer.b.lambda$new$2(u1Var);
            default:
                return ExoPlayer.b.lambda$new$8(u1Var);
        }
    }
}
