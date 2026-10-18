package com.userlabs.xshare.cloudmessage.firebase;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(c cVar, String str, long j, int i) {
        this.a = i;
        this.b = cVar;
        this.c = str;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.d;
        String str = this.c;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.lambda$updateNotifyTime$3(str, j);
                break;
            case 1:
                cVar.lambda$updateClickTime$2(str, j);
                break;
            default:
                cVar.lambda$updateCheckTime$4(str, j);
                break;
        }
    }
}
