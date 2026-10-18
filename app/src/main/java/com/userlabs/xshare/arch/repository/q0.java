package com.userlabs.xshare.arch.repository;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ q0(r0 r0Var, List list, Runnable runnable, int i) {
        this.a = i;
        this.b = r0Var;
        this.c = list;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.d;
        List list = this.c;
        r0 r0Var = this.b;
        switch (i) {
            case 0:
                r0Var.lambda$exeDeleteFromLocalDbByPathList$0(list, runnable);
                break;
            case 1:
                r0Var.lambda$exeDeleteByIdList$1(list, runnable);
                break;
            default:
                r0Var.lambda$exeInsertData$2(list, runnable);
                break;
        }
    }
}
