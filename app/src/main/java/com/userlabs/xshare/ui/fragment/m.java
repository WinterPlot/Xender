package com.userlabs.xshare.ui.fragment;

import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                XShareMainFragment.lambda$showRangeTransferDialogForNewProtocol$49((String) obj, dialogInterface, i);
                break;
            case 1:
                XShareMainFragment.lambda$showRangeTransferDialogForNewProtocol$50((String) obj, dialogInterface, i);
                break;
            default:
                XShareMainFragment.lambda$showRangeTransferDialog$48((List) obj, dialogInterface, i);
                break;
        }
    }
}
