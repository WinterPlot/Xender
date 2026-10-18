package com.userlabs.xshare.dialog;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ l(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        n nVar = this.b;
        switch (i) {
            case 0:
                nVar.lambda$onCreate$1();
                break;
            case 1:
                nVar.lambda$onCreate$5();
                break;
            case 2:
                nVar.lambda$onCreate$3();
                break;
            case 3:
                nVar.lambda$onCreate$7();
                break;
            default:
                nVar.lambda$onCreate$9();
                break;
        }
    }
}
