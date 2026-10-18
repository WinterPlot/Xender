package com.userlabs.xshare.importdata;

import android.content.DialogInterface;
import com.userlabs.xshare.ui.fragment.pc.PcConnectMainFragment;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i) {
        this.a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                dialogInterface.dismiss();
                break;
            case 1:
                com.userlabs.xshare.core.preferences.a.setShowSdTipsFlag(true);
                break;
            case 2:
                dialogInterface.dismiss();
                break;
            case 3:
                dialogInterface.dismiss();
                break;
            case 4:
                PcConnectMainFragment.lambda$onOfflineConnect$3(dialogInterface, i);
                break;
            case 5:
                com.userlabs.xshare.upgrade.f.lambda$showSendToDialog$1(dialogInterface, i);
                break;
            case 6:
                com.userlabs.xshare.upgrade.h.lambda$showUpgradeNotForciblyDialog$7(dialogInterface, i);
                break;
            case 7:
                com.userlabs.xshare.upgrade.h.lambda$showUpgradeNotForciblyDialog$8(dialogInterface, i);
                break;
            default:
                com.userlabs.xshare.upgrade.h.lambda$showUpgradeNotForciblyDialog$10(dialogInterface, i);
                break;
        }
    }
}
