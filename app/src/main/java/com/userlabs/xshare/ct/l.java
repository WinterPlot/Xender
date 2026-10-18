package com.userlabs.xshare.ct;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ XJoinStepEvent c;

    public /* synthetic */ l(c cVar, XJoinStepEvent xJoinStepEvent, int i) {
        this.a = i;
        this.b = cVar;
        this.c = xJoinStepEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n.lambda$postRouteEvent$8(this.b, this.c);
                break;
            default:
                n.lambda$postApModeEvent$7(this.b, this.c);
                break;
        }
    }
}
