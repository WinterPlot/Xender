package androidx.media3.exoplayer.video;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e.b b;

    public /* synthetic */ f(e.b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        e.b bVar = this.b;
        switch (i) {
            case 0:
                bVar.lambda$renderFrame$1();
                break;
            default:
                bVar.lambda$dropFrame$2();
                break;
        }
    }
}
