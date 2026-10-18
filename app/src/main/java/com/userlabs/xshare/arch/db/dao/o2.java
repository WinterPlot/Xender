package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o2 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;
    public final /* synthetic */ List c;

    public /* synthetic */ o2(p2 p2Var, List list, int i) {
        this.a = i;
        this.b = p2Var;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        p2 p2Var = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return p2Var.lambda$deleteAllAndInsert$2(list, bVar);
            case 1:
                return p2Var.lambda$updateVideoGroupMessage$1(list, bVar);
            default:
                return p2Var.lambda$insert$0(list, bVar);
        }
    }
}
