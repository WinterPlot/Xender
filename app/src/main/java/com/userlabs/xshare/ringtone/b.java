package com.userlabs.xshare.ringtone;

import android.app.Activity;
import android.content.DialogInterface;
import com.userlabs.xshare.upgrade.h;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ b(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Activity activity = this.b;
        switch (i2) {
            case 0:
                c.gotoWriteSettings(activity);
                break;
            default:
                h.lambda$showUpgradeForciblyDialog$4(activity, dialogInterface, i);
                break;
        }
    }
}
