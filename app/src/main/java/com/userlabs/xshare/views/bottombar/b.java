package com.userlabs.xshare.views.bottombar;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FriendsList b;

    public /* synthetic */ b(FriendsList friendsList, int i) {
        this.a = i;
        this.b = friendsList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        FriendsList friendsList = this.b;
        switch (i2) {
            case 0:
                friendsList.lambda$showClientOfflineDialog$3(dialogInterface, i);
                break;
            case 1:
                friendsList.lambda$showApOfflineDialog$6(dialogInterface, i);
                break;
            default:
                friendsList.lambda$showCloseApDialog$4(dialogInterface, i);
                break;
        }
    }
}
