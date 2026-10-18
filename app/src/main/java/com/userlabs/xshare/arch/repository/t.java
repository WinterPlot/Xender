package com.userlabs.xshare.arch.repository;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;
    public final /* synthetic */ y c;

    public /* synthetic */ t(x xVar, y yVar, int i) {
        this.a = i;
        this.b = xVar;
        this.c = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        y yVar = this.c;
        x xVar = this.b;
        switch (i) {
            case 0:
                xVar.lambda$updateUpStateFromUploadingToNormal$8(yVar);
                break;
            default:
                xVar.lambda$updateAllDeleteColumnToDeleted$3(yVar);
                break;
        }
    }
}
