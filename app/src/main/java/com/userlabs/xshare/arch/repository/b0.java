package com.userlabs.xshare.arch.repository;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ y d;

    public /* synthetic */ b0(f0 f0Var, List list, y yVar, int i) {
        this.a = i;
        this.b = f0Var;
        this.c = list;
        this.d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        y yVar = this.d;
        List list = this.c;
        f0 f0Var = this.b;
        switch (i) {
            case 0:
                f0Var.lambda$exeUpdateDb$8(list, yVar);
                break;
            case 1:
                f0Var.lambda$exeDeletePathListFromLocalDb$4(list, yVar);
                break;
            case 2:
                f0Var.lambda$exeInertData$1(list, yVar);
                break;
            default:
                f0Var.lambda$exeDeleteIdListFromLocalDb$5(list, yVar);
                break;
        }
    }
}
