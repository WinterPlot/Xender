package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l2 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;
    public final /* synthetic */ List c;

    public /* synthetic */ l2(m2 m2Var, List list, int i) {
        this.a = i;
        this.b = m2Var;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        m2 m2Var = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return m2Var.lambda$updateVideos$2(list, bVar);
            case 1:
                return m2Var.lambda$insertAllFts$1(list, bVar);
            default:
                return m2Var.lambda$insertAll$0(list, bVar);
        }
    }
}
