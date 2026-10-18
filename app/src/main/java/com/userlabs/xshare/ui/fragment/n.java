package com.userlabs.xshare.ui.fragment;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ XShareMainFragment b;

    public /* synthetic */ n(XShareMainFragment xshareMainFragment, int i) {
        this.a = i;
        this.b = xshareMainFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        XShareMainFragment xshareMainFragment = this.b;
        switch (i) {
            case 0:
                xshareMainFragment.lambda$setupViewPager$41();
                break;
            case 1:
                xshareMainFragment.lambda$handleTobeSendListManagerEvent$51();
                break;
            case 2:
                xshareMainFragment.lambda$setupAddItem$31();
                break;
            case 3:
                xshareMainFragment.lambda$onViewCreated$0();
                break;
            default:
                xshareMainFragment.lambda$doSendClickAfterPermissions$20();
                break;
        }
    }
}
