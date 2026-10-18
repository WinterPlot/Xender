package com.userlabs.xshare.obb;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ObbManager b;
    public final /* synthetic */ String c;

    public /* synthetic */ o(ObbManager obbManager, String str, int i) {
        this.a = i;
        this.b = obbManager;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        ObbManager obbManager = this.b;
        switch (i) {
            case 0:
                obbManager.lambda$checkObbImportAfterInstalled$2(str);
                break;
            default:
                obbManager.lambda$exeStartImport$1(str);
                break;
        }
    }
}
