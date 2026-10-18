package com.userlabs.xshare.ui.fragment.pc;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PcConnectMainFragment b;

    public /* synthetic */ f(PcConnectMainFragment pcConnectMainFragment, int i) {
        this.a = i;
        this.b = pcConnectMainFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        PcConnectMainFragment pcConnectMainFragment = this.b;
        switch (i2) {
            case 0:
                pcConnectMainFragment.lambda$onOfflineConnect$4(dialogInterface, i);
                break;
            default:
                pcConnectMainFragment.lambda$showDisconnectDlg$2(dialogInterface, i);
                break;
        }
    }
}
