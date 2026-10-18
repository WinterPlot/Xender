package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements com.google.common.base.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ e0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // com.google.common.base.e
    public final Object apply(Object obj) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return l0.lambda$setAudioSessionId$13(i2, (Integer) obj);
            case 1:
                return l0.d.lambda$onAudioSessionIdChanged$2(i2, (Integer) obj);
            case 2:
                return l0.d.lambda$onAudioSessionIdChanged$3(i2, (Integer) obj);
            case 3:
                return e2.lambda$setVolume$3(i2, (e2.c) obj);
            default:
                return e2.lambda$setStreamType$1(i2, (e2.c) obj);
        }
    }
}
