package com.userlabs.xshare.arch.repository;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;
    public final /* synthetic */ List c;
    public final /* synthetic */ y d;

    public /* synthetic */ s(int i, x xVar, y yVar, List list) {
        this.a = i;
        this.b = xVar;
        this.c = list;
        this.d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        y yVar = this.d;
        List list = this.c;
        x xVar = this.b;
        switch (i) {
            case 0:
                xVar.lambda$updateDeleteColumnToDeletedByIdList$2(list, yVar);
                break;
            case 1:
                xVar.lambda$updateExistColumnToNotExistByPathList$4(list, yVar);
                break;
            case 2:
                xVar.lambda$updateData$1(list, yVar);
                break;
            case 3:
                xVar.lambda$insertData$0(list, yVar);
                break;
            default:
                xVar.lambda$updateHistoryCanInstallToNot$5(list, yVar);
                break;
        }
    }
}
