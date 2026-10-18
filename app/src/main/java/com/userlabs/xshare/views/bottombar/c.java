package com.userlabs.xshare.views.bottombar;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FriendsList b;

    public /* synthetic */ c(FriendsList friendsList, int i) {
        this.a = i;
        this.b = friendsList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        FriendsList friendsList = this.b;
        switch (i) {
            case 0:
                friendsList.clickForOfflineAp();
                break;
            case 1:
                friendsList.doApOffline();
                break;
            default:
                friendsList.restore();
                break;
        }
    }
}
