package com.userlabs.xshare.arch.viewmodel;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ExternalStorageCheckViewModel) obj).lambda$checkExternalStorageAvailable$0();
                break;
            default:
                HistoryReceivedViewModel.lambda$loadOfferHistoryEntity$13((androidx.lifecycle.h0) obj);
                break;
        }
    }
}
