package com.userlabs.xshare.audioplayer.exo.ui;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ XMPlayerFragment b;

    public /* synthetic */ d(XMPlayerFragment xMPlayerFragment, int i) {
        this.a = i;
        this.b = xMPlayerFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        XMPlayerFragment xMPlayerFragment = this.b;
        switch (i) {
            case 0:
                xMPlayerFragment.lambda$initChildViewTopMargin$3();
                break;
            case 1:
                xMPlayerFragment.lambda$initChildViewTopMargin$4();
                break;
            default:
                xMPlayerFragment.lambda$setupCoverView$15();
                break;
        }
    }
}
