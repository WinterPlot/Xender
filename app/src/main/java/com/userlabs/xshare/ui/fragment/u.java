package com.userlabs.xshare.ui.fragment;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((XShareMainFragment.a) obj).lambda$onReceiveClick$1();
                break;
            case 1:
                ((FriendsResFragment) obj).lambda$showOrDismissSpeedLayout$7();
                break;
            case 2:
                ((ProgressFragment) obj).lambda$showFlagWhenHasRangeTask$6();
                break;
            default:
                ((ProgressReceiverFragment) obj).lambda$onViewCreated$0();
                break;
        }
    }
}
