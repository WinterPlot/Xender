package androidx.media3.exoplayer.scheduler;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a.d b;

    public /* synthetic */ b(a.d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a.d dVar = this.b;
        switch (i) {
            case 0:
                dVar.lambda$postCheckRequirements$0();
                break;
            default:
                dVar.lambda$postRecheckNotMetNetworkRequirements$1();
                break;
        }
    }
}
