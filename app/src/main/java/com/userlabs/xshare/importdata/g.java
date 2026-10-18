package com.userlabs.xshare.importdata;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NewPhoneReduplicateFragment b;

    public /* synthetic */ g(NewPhoneReduplicateFragment newPhoneReduplicateFragment, int i) {
        this.a = i;
        this.b = newPhoneReduplicateFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        NewPhoneReduplicateFragment newPhoneReduplicateFragment = this.b;
        switch (i2) {
            case 0:
                newPhoneReduplicateFragment.lambda$showWaitingDialog$3(dialogInterface, i);
                break;
            default:
                newPhoneReduplicateFragment.lambda$showApOfflineDialog$7(dialogInterface, i);
                break;
        }
    }
}
