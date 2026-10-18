package com.userlabs.xshare.ui.activity;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsActivity b;

    public /* synthetic */ w(SettingsActivity settingsActivity, int i) {
        this.a = i;
        this.b = settingsActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        SettingsActivity settingsActivity = this.b;
        switch (i2) {
            case 0:
                settingsActivity.lambda$showClearHistoryDialog$5(dialogInterface, i);
                break;
            case 1:
                settingsActivity.lambda$showPwdDlg$8(dialogInterface, i);
                break;
            default:
                settingsActivity.lambda$showPwdDlg$9(dialogInterface, i);
                break;
        }
    }
}
