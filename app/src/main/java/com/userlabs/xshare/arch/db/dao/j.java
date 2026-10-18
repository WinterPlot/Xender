package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ List c;

    public /* synthetic */ j(n nVar, List list, int i) {
        this.a = i;
        this.b = nVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        n nVar = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return nVar.lambda$insertAll$0(list, bVar);
            case 1:
                return nVar.lambda$updateApps$2(list, bVar);
            default:
                return nVar.lambda$insertAllFts$1(list, bVar);
        }
    }
}
