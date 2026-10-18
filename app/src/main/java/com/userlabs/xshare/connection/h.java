package com.userlabs.xshare.connection;

import android.app.Activity;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(CreateFragment createFragment, boolean z) {
        this.c = createFragment;
        this.b = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (i2) {
            case 0:
                ((CreateFragment) obj).lambda$showConnectIphoneDialog$20(z, dialogInterface, i);
                break;
            default:
                com.userlabs.xshare.upgrade.f.lambda$showFriendsUpdateDlg$4(z, (Activity) obj, dialogInterface, i);
                break;
        }
    }

    public /* synthetic */ h(boolean z, Activity activity) {
        this.b = z;
        this.c = activity;
    }
}
