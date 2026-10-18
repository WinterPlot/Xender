package com.userlabs.xshare.webdownload;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ c.b c;

    public /* synthetic */ a(c cVar, c.b bVar, int i) {
        this.a = i;
        this.b = cVar;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        c.b bVar = this.c;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.lambda$dispatchTasksChanged$7(bVar);
                break;
            default:
                cVar.lambda$addUIProgressListener$4(bVar);
                break;
        }
    }
}
