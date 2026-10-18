package com.userlabs.xshare.arch.viewmodel;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchFileViewModel b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ p0(SearchFileViewModel searchFileViewModel, String str, String str2, int i) {
        this.a = i;
        this.b = searchFileViewModel;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        SearchFileViewModel searchFileViewModel = this.b;
        switch (i) {
            case 0:
                searchFileViewModel.lambda$loadEbookSearchAsync$1(str2, str);
                break;
            case 1:
                searchFileViewModel.lambda$loadAudioSearchAsync$2(str2, str);
                break;
            case 2:
                searchFileViewModel.lambda$loadAllSearchAsync$5(str2, str);
                break;
            default:
                searchFileViewModel.lambda$loadVideoSearchAsync$3(str2, str);
                break;
        }
    }
}
