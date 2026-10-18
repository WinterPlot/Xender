package com.userlabs.xshare.importdata;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OldPhoneTransferFragment b;

    public /* synthetic */ l(OldPhoneTransferFragment oldPhoneTransferFragment, int i) {
        this.a = i;
        this.b = oldPhoneTransferFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        OldPhoneTransferFragment oldPhoneTransferFragment = this.b;
        switch (i) {
            case 0:
                oldPhoneTransferFragment.lambda$doDisconnect$4();
                break;
            default:
                oldPhoneTransferFragment.lambda$transferCateCount$2();
                break;
        }
    }
}
