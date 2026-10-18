package androidx.camera.core.processing;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0.a b;

    public /* synthetic */ w(a0.a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a0.a aVar = this.b;
        switch (i) {
            case 0:
                aVar.close();
                break;
            case 1:
                aVar.decrementUseCount();
                break;
            default:
                aVar.lambda$close$1();
                break;
        }
    }
}
