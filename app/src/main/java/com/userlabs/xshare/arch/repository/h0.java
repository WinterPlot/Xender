package com.userlabs.xshare.arch.repository;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;
    public final /* synthetic */ List c;

    public /* synthetic */ h0(i0 i0Var, List list, int i) {
        this.a = i;
        this.b = i0Var;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.c;
        i0 i0Var = this.b;
        switch (i) {
            case 0:
                i0Var.lambda$exeDeleteIdList$6(list);
                break;
            default:
                i0Var.lambda$exeDeletePathList$5(list);
                break;
        }
    }
}
