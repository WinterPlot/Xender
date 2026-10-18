package androidx.media3.session;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ y1(b2 b2Var, int i) {
        this.a = i;
        this.b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b2 b2Var = this.b;
        switch (i) {
            case 0:
                b2Var.lambda$connectToSession$2();
                break;
            default:
                b2Var.lambda$connectToService$3();
                break;
        }
    }
}
