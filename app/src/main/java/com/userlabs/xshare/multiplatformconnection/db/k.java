package com.userlabs.xshare.multiplatformconnection.db;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ k(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        l lVar = this.b;
        switch (i) {
            case 0:
                lVar.lambda$clientClearExpired$5();
                break;
            default:
                lVar.lambda$serverClearExpired$10();
                break;
        }
    }
}
