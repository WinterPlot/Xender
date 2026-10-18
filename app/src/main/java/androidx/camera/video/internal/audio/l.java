package androidx.camera.video.internal.audio;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ l(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                mVar.lambda$stop$1();
                break;
            case 1:
                mVar.lambda$start$0();
                break;
            case 2:
                mVar.collectAudioData();
                break;
            default:
                mVar.lambda$release$2();
                break;
        }
    }
}
