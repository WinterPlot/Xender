package com.userlabs.xshare.zxing.camera;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                e.lambda$exeCloseDriver$4(eVar);
                break;
            default:
                e.lambda$exeStopPreview$5(eVar);
                break;
        }
    }
}
