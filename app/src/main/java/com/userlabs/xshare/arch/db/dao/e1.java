package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ List c;

    public /* synthetic */ e1(f1 f1Var, List list, int i) {
        this.a = i;
        this.b = f1Var;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        f1 f1Var = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return f1Var.lambda$insertAllFts$1(list, bVar);
            default:
                return f1Var.lambda$insertAll$0(list, bVar);
        }
    }
}
