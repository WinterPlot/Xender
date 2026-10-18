package androidx.camera.core.impl;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y1 b;

    public /* synthetic */ x1(y1 y1Var, int i) {
        this.a = i;
        this.b = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        y1 y1Var = this.b;
        switch (i) {
            case 0:
                y1Var.lambda$enableInternalObserver$5();
                break;
            default:
                y1Var.lambda$disableInternalObserver$6();
                break;
        }
    }
}
