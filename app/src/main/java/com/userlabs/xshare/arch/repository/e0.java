package com.userlabs.xshare.arch.repository;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ List c;

    public /* synthetic */ e0(f0 f0Var, List list, int i) {
        this.a = i;
        this.b = f0Var;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.c;
        f0 f0Var = this.b;
        switch (i) {
            case 0:
                f0Var.lambda$deleteData$9(list);
                break;
            default:
                f0Var.lambda$exeDeleteFolderListFromLocalDb$7(list);
                break;
        }
    }
}
