package com.userlabs.xshare.views.bottombar;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FriendsList b;

    public /* synthetic */ a(FriendsList friendsList, int i) {
        this.a = i;
        this.b = friendsList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        FriendsList friendsList = this.b;
        switch (i) {
            case 0:
                friendsList.lambda$addListPart$2(view);
                break;
            case 1:
                friendsList.lambda$addWaitingPart$0(view);
                break;
            default:
                friendsList.lambda$addWaitingPart$1(view);
                break;
        }
    }
}
