package com.userlabs.xshare.ct;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ k(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                n.lambda$exChangeConnect$0(cVar);
                break;
            case 1:
                n.lambda$connect$1(cVar);
                break;
            default:
                n.lambda$connect$3(cVar);
                break;
        }
    }
}
