package androidx.media3.session;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ d0 c;

    public /* synthetic */ c0(f0 f0Var, d0 d0Var, int i) {
        this.a = i;
        this.b = f0Var;
        this.c = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        d0 d0Var = this.c;
        f0 f0Var = this.b;
        switch (i) {
            case 0:
                f0Var.setController(d0Var);
                break;
            default:
                f0Var.lambda$setController$0(d0Var);
                break;
        }
    }
}
