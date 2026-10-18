package com.userlabs.xshare.ui.fragment;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ XShareMainFragment b;

    public /* synthetic */ r(XShareMainFragment xshareMainFragment, int i) {
        this.a = i;
        this.b = xshareMainFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        XShareMainFragment xshareMainFragment = this.b;
        switch (i) {
            case 0:
                xshareMainFragment.lambda$showNotSupportHighSpeedDialogWhenJoinFailed$53(view);
                break;
            case 1:
                xshareMainFragment.lambda$setSelectActionListener$44(view);
                break;
            case 2:
                xshareMainFragment.lambda$setSelectActionListener$45(view);
                break;
            case 3:
                xshareMainFragment.lambda$setSelectActionListener$46(view);
                break;
            case 4:
                xshareMainFragment.lambda$showAddItems$36(view);
                break;
            case 5:
                xshareMainFragment.lambda$showAddItems$37(view);
                break;
            case 6:
                xshareMainFragment.lambda$showAddItems$38(view);
                break;
            case 7:
                xshareMainFragment.lambda$showAddItems$39(view);
                break;
            case 8:
                xshareMainFragment.lambda$showAddItems$40(view);
                break;
            case 9:
                xshareMainFragment.lambda$addTransferDragLayout$54(view);
                break;
            case 10:
                xshareMainFragment.lambda$setupToolbar$26(view);
                break;
            default:
                xshareMainFragment.lambda$setupAddItem$28(view);
                break;
        }
    }
}
