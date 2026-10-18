package com.userlabs.xshare.arch.repository;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ List c;

    public /* synthetic */ m(r rVar, List list, int i) {
        this.a = i;
        this.b = rVar;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.c;
        r rVar = this.b;
        switch (i) {
            case 0:
                rVar.lambda$exeDeleteIdList$3(list);
                break;
            default:
                rVar.lambda$deleteFromLocalDbByPathList$2(list);
                break;
        }
    }
}
