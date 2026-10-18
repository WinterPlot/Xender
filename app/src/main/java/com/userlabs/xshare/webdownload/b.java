package com.userlabs.xshare.webdownload;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c.b b;
    public final /* synthetic */ WebDownloadInfo c;

    public /* synthetic */ b(c.b bVar, WebDownloadInfo webDownloadInfo, int i) {
        this.a = i;
        this.b = bVar;
        this.c = webDownloadInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        WebDownloadInfo webDownloadInfo = this.c;
        c.b bVar = this.b;
        switch (i) {
            case 0:
                c.lambda$addUIProgressListener$3(bVar, webDownloadInfo);
                break;
            default:
                bVar.onStateChanged(webDownloadInfo);
                break;
        }
    }
}
