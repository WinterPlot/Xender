package com.userlabs.xshare.ui.imageBrowser;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PcImageBrowserViewModel b;
    public final /* synthetic */ String c;

    public /* synthetic */ d(PcImageBrowserViewModel pcImageBrowserViewModel, String str, int i) {
        this.a = i;
        this.b = pcImageBrowserViewModel;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        PcImageBrowserViewModel pcImageBrowserViewModel = this.b;
        switch (i) {
            case 0:
                pcImageBrowserViewModel.lambda$exeSendMoveToRightCommand$1(str);
                break;
            case 1:
                pcImageBrowserViewModel.lambda$exeSendMoveToUpCommandAndNewHistoryRecord$5(str);
                break;
            default:
                pcImageBrowserViewModel.lambda$exeSendMoveToLeftCommand$3(str);
                break;
        }
    }
}
