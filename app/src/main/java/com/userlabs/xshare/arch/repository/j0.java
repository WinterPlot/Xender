package com.userlabs.xshare.arch.repository;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ y c;

    public /* synthetic */ j0(int i, List list, y yVar) {
        this.a = i;
        this.b = list;
        this.c = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        y yVar = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                k0.lambda$exeDeleteAllAndInsertNew$0(list, yVar);
                break;
            default:
                k0.lambda$exeInsertData$1(list, yVar);
                break;
        }
    }
}
