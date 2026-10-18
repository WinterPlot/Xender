package com.userlabs.xshare.importdata;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ExFirstFragment b;

    public /* synthetic */ c(ExFirstFragment exFirstFragment, int i) {
        this.a = i;
        this.b = exFirstFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ExFirstFragment exFirstFragment = this.b;
        switch (i) {
            case 0:
                exFirstFragment.lambda$onViewCreated$0();
                break;
            default:
                exFirstFragment.lambda$onViewCreated$3();
                break;
        }
    }
}
