package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f2 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;
    public final /* synthetic */ com.userlabs.xshare.arch.db.entity.r c;

    public /* synthetic */ f2(g2 g2Var, com.userlabs.xshare.arch.db.entity.r rVar, int i) {
        this.a = i;
        this.b = g2Var;
        this.c = rVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        com.userlabs.xshare.arch.db.entity.r rVar = this.c;
        g2 g2Var = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return g2Var.lambda$insert$0(rVar, bVar);
            default:
                return g2Var.lambda$update$1(rVar, bVar);
        }
    }
}
