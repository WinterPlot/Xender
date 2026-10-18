package com.userlabs.xshare.upgrade;

import android.app.Activity;
import android.content.DialogInterface;
import com.userlabs.xshare.ui.fragment.DetailDialogFragment;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, int i, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                ((h) obj3).lambda$showUpgradeNotForciblyDialog$6((Activity) obj2, (k) obj, dialogInterface, i);
                break;
            case 1:
                ((h) obj3).lambda$showUpgradeNotForciblyDialog$9((Activity) obj2, (k) obj, dialogInterface, i);
                break;
            default:
                ((DetailDialogFragment) obj3).lambda$showFinallyDetailDialog$3((String) obj2, (String) obj, dialogInterface, i);
                break;
        }
    }
}
