package com.userlabs.xshare.service;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShanchuanService b;

    public /* synthetic */ c(ShanchuanService shanchuanService, int i) {
        this.a = i;
        this.b = shanchuanService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ShanchuanService shanchuanService = this.b;
        switch (i) {
            case 0:
                shanchuanService.lambda$new$1();
                break;
            case 1:
                shanchuanService.lambda$new$2();
                break;
            case 2:
                shanchuanService.lambda$new$3();
                break;
            default:
                shanchuanService.lambda$showToast$4();
                break;
        }
    }
}
