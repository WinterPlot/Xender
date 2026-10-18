package com.userlabs.xshare.multiplatformconnection.db;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ List c;

    public /* synthetic */ i(l lVar, List list, int i) {
        this.a = i;
        this.b = lVar;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.c;
        l lVar = this.b;
        switch (i) {
            case 0:
                lVar.lambda$serverRemoveTaskList$9(list);
                break;
            case 1:
                lVar.lambda$clientAddNewTask$1(list);
                break;
            case 2:
                lVar.lambda$clientRemoveTaskList$3(list);
                break;
            default:
                lVar.lambda$serverAddNewTask$7(list);
                break;
        }
    }
}
