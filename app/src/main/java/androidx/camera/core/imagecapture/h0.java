package androidx.camera.core.imagecapture;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;
    public final /* synthetic */ k0.b c;

    public /* synthetic */ h0(k0 k0Var, k0.b bVar, int i) {
        this.a = i;
        this.b = k0Var;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        k0.b bVar = this.c;
        k0 k0Var = this.b;
        switch (i) {
            case 0:
                k0Var.lambda$transform$2(bVar);
                break;
            case 1:
                k0Var.lambda$processInputPacket$6(bVar);
                break;
            default:
                k0Var.lambda$transform$0(bVar);
                break;
        }
    }
}
