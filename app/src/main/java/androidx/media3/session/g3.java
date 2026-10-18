package androidx.media3.session;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ g3(k3 k3Var, int i) {
        this.a = i;
        this.b = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        k3 k3Var = this.b;
        switch (i) {
            case 0:
                k3Var.lambda$onNotificationRefreshRequired$20();
                break;
            case 1:
                k3Var.notifyPeriodicSessionPositionInfoChangesOnHandler();
                break;
            case 2:
                k3Var.schedulePeriodicSessionPositionInfoChanges();
                break;
            default:
                k3Var.lambda$release$2();
                break;
        }
    }
}
