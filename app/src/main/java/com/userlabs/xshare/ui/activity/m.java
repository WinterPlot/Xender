package com.userlabs.xshare.ui.activity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ m(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                mainActivity.lambda$postToPlaylist$23();
                break;
            case 1:
                mainActivity.finish();
                break;
            case 2:
                mainActivity.lambda$toConnectPcMain$33();
                break;
            case 3:
                mainActivity.lambda$click2BackOut$27();
                break;
            case 4:
                mainActivity.lambda$showPrivateDirTipsDialog$28();
                break;
            case 5:
                mainActivity.lambda$postToSocial$22();
                break;
            case 6:
                mainActivity.lambda$delayCreate$0();
                break;
            default:
                mainActivity.lambda$postToTransferMain$24();
                break;
        }
    }
}
