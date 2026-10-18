package com.userlabs.xshare.core.log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ e(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                gVar.lambda$clearCachedFiles$8();
                break;
            default:
                gVar.lambda$getWriteTask$0();
                break;
        }
    }
}
