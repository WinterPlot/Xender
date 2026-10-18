package com.userlabs.xshare.disconnect;

import androidx.lifecycle.h0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ h0 c;

    public /* synthetic */ f(j jVar, h0 h0Var, int i) {
        this.a = i;
        this.b = jVar;
        this.c = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h0 h0Var = this.c;
        j jVar = this.b;
        switch (i) {
            case 0:
                jVar.lambda$getTransferOther$12(h0Var);
                break;
            case 1:
                jVar.lambda$getTransferVideoAndPhoto$8(h0Var);
                break;
            case 2:
                jVar.lambda$getTransferAndOfferData$3(h0Var);
                break;
            default:
                jVar.lambda$getShowViewPagerPositionLiveDate$18(h0Var);
                break;
        }
    }
}
