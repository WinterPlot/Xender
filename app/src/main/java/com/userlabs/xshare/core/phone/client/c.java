package com.userlabs.xshare.core.phone.client;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ c(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                e.lambda$exitGroup$1(runnable);
                break;
            case 1:
                com.userlabs.xshare.core.phone.server.c.lambda$wifiClientClearTask$3(runnable);
                break;
            default:
                com.userlabs.xshare.core.phone.server.c.lambda$apClientClearTask$4(runnable);
                break;
        }
    }
}
