package com.userlabs.xshare.connection;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreateFragment b;

    public /* synthetic */ e(CreateFragment createFragment, int i) {
        this.a = i;
        this.b = createFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        CreateFragment createFragment = this.b;
        switch (i2) {
            case 0:
                createFragment.lambda$showStopJoiningDlg$27(dialogInterface, i);
                break;
            case 1:
                createFragment.lambda$showChangeHighSpeedTipsDialog$17(dialogInterface, i);
                break;
            default:
                createFragment.lambda$showChangeHighSpeedTipsDialog$18(dialogInterface, i);
                break;
        }
    }
}
