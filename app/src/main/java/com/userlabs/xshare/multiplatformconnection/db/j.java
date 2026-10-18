package com.userlabs.xshare.multiplatformconnection.db;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ String c;

    public /* synthetic */ j(l lVar, String str, int i) {
        this.a = i;
        this.b = lVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        l lVar = this.b;
        switch (i) {
            case 0:
                lVar.lambda$serverRemoveTask$8(str);
                break;
            case 1:
                lVar.lambda$clientRemoveByDid$4(str);
                break;
            default:
                lVar.lambda$clientRemoveTask$2(str);
                break;
        }
    }
}
