package androidx.media3.exoplayer.video;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v.a b;
    public final /* synthetic */ androidx.media3.exoplayer.e c;

    public /* synthetic */ u(v.a aVar, androidx.media3.exoplayer.e eVar, int i) {
        this.a = i;
        this.b = aVar;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        androidx.media3.exoplayer.e eVar = this.c;
        v.a aVar = this.b;
        switch (i) {
            case 0:
                aVar.lambda$enabled$0(eVar);
                break;
            default:
                aVar.lambda$disabled$8(eVar);
                break;
        }
    }
}
