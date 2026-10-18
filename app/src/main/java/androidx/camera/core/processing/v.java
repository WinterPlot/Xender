package androidx.camera.core.processing;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ v(a0 a0Var, int i) {
        this.a = i;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a0 a0Var = this.b;
        switch (i) {
            case 0:
                a0Var.lambda$createSurfaceRequest$1();
                break;
            default:
                a0Var.lambda$createSurfaceRequest$0();
                break;
        }
    }
}
