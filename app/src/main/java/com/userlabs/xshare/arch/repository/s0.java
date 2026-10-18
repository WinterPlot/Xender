package com.userlabs.xshare.arch.repository;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ y d;

    public /* synthetic */ s0(u0 u0Var, List list, y yVar, int i) {
        this.a = i;
        this.b = u0Var;
        this.c = list;
        this.d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        y yVar = this.d;
        List list = this.c;
        u0 u0Var = this.b;
        switch (i) {
            case 0:
                u0Var.lambda$exeDeleteFromLocalDbByIdList$5(list, yVar);
                break;
            case 1:
                u0Var.lambda$updateVideos$7(list, yVar);
                break;
            case 2:
                u0Var.lambda$exeInertData$0(list, yVar);
                break;
            default:
                u0Var.lambda$exeDeleteFromLocalDbByPathList$4(list, yVar);
                break;
        }
    }
}
