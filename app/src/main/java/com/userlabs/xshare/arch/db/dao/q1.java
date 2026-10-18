package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ r1 b;
    public final /* synthetic */ List c;

    public /* synthetic */ q1(r1 r1Var, List list, int i) {
        this.a = i;
        this.b = r1Var;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        r1 r1Var = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return r1Var.lambda$deleteAllAndInsertAll$1(list, bVar);
            default:
                return r1Var.lambda$insertAll$0(list, bVar);
        }
    }
}
