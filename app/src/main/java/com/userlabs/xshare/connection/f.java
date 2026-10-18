package com.userlabs.xshare.connection;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreateFragment b;

    public /* synthetic */ f(CreateFragment createFragment, int i) {
        this.a = i;
        this.b = createFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.a;
        CreateFragment createFragment = this.b;
        switch (i) {
            case 0:
                createFragment.lambda$showStopJoiningDlg$28(dialogInterface);
                break;
            case 1:
                createFragment.lambda$showChangeHighSpeedTipsDialog$19(dialogInterface);
                break;
            case 2:
                createFragment.lambda$showConnectIphoneDialog$21(dialogInterface);
                break;
            default:
                createFragment.lambda$showHighSpeedHelperDialog$26(dialogInterface);
                break;
        }
    }
}
