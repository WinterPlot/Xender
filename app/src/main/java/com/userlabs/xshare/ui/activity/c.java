package com.userlabs.xshare.ui.activity;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseActivity b;

    public /* synthetic */ c(BaseActivity baseActivity, int i) {
        this.a = i;
        this.b = baseActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.a;
        BaseActivity baseActivity = this.b;
        switch (i) {
            case 0:
                ((AboutActivity) baseActivity).lambda$showDebugDlg$8(dialogInterface);
                break;
            default:
                baseActivity.lambda$showLoadingDialog$0(dialogInterface);
                break;
        }
    }
}
