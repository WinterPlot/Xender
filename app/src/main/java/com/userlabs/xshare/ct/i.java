package com.userlabs.xshare.ct;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements c {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ Executor c;

    public /* synthetic */ i(c cVar, Executor executor, int i) {
        this.a = i;
        this.b = cVar;
        this.c = executor;
    }

    @Override // com.userlabs.xshare.ct.c
    public final void onStepFinished(XJoinStepEvent xJoinStepEvent) {
        switch (this.a) {
            case 0:
                n.postApModeEvent(this.b, this.c, xJoinStepEvent);
                break;
            case 1:
                n.postApModeEvent(this.b, this.c, xJoinStepEvent);
                break;
            default:
                n.postRouteEvent(this.b, this.c, xJoinStepEvent);
                break;
        }
    }
}
