package com.userlabs.xshare.arch.repository;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ List c;
    public final /* synthetic */ y d;

    public /* synthetic */ d(e eVar, List list, y yVar, int i) {
        this.a = i;
        this.b = eVar;
        this.c = list;
        this.d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        y yVar = this.d;
        List list = this.c;
        e eVar = this.b;
        switch (i) {
            case 0:
                eVar.lambda$insertAll$0(list, yVar);
                break;
            case 1:
                eVar.lambda$deleteByPnList$2(list, yVar);
                break;
            default:
                eVar.lambda$updateAll$1(list, yVar);
                break;
        }
    }
}
