package com.userlabs.xshare.ui.fragment;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((XShareMainFragment) obj).lambda$showNotSupportHighSpeedDialogWhenJoinFailed$52(dialogInterface);
                break;
            case 1:
                ((XShareMainFragment) obj).lambda$doSendClickAfterPermissions$19(dialogInterface);
                break;
            default:
                ((XShareMainFragment.a) obj).lambda$onReceiveClick$0(dialogInterface);
                break;
        }
    }
}
