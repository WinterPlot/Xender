package com.userlabs.xshare.core.pc.client;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ q(r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        r rVar = this.b;
        switch (i) {
            case 0:
                rVar.lambda$initScanner$0();
                break;
            default:
                rVar.lambda$removeForeverObserve$1();
                break;
        }
    }
}
