package androidx.media3.session;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ v0(t1 t1Var, int i) {
        this.a = i;
        this.b = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        t1 t1Var = this.b;
        switch (i) {
            case 0:
                t1Var.lambda$setFutureResult$112();
                break;
            default:
                t1Var.lambda$release$4();
                break;
        }
    }
}
