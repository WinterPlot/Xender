package com.userlabs.xshare.arch.repository;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ List c;
    public final /* synthetic */ y d;

    public /* synthetic */ f(h hVar, List list, y yVar, int i) {
        this.a = i;
        this.b = hVar;
        this.c = list;
        this.d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        y yVar = this.d;
        List list = this.c;
        h hVar = this.b;
        switch (i) {
            case 0:
                hVar.lambda$exeInsertToNameMatchDb$5(list, yVar);
                break;
            case 1:
                hVar.lambda$exeDeleteFromNameMatchTableByPackageNameList$6(list, yVar);
                break;
            case 2:
                hVar.lambda$updateApps$0(list, yVar);
                break;
            case 3:
                hVar.lambda$exeInsertToAppDb$3(list, yVar);
                break;
            default:
                hVar.lambda$exeDeleteFromAppTableByList$2(list, yVar);
                break;
        }
    }
}
