package com.userlabs.xshare.core.ap;

import androidx.lifecycle.i0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ k(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        int i = this.a;
        l lVar = this.b;
        com.userlabs.xshare.arch.entry.b bVar = (com.userlabs.xshare.arch.entry.b) obj;
        switch (i) {
            case 0:
                lVar.lambda$new$0(bVar);
                break;
            case 1:
                lVar.lambda$registerPreconditionResultListener$3(bVar);
                break;
            case 2:
                lVar.lambda$subscribeViewModel$1(bVar);
                break;
            default:
                lVar.lambda$subscribeViewModel$2(bVar);
                break;
        }
    }
}
