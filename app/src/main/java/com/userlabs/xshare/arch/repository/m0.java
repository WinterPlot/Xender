package com.userlabs.xshare.arch.repository;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;
    public final /* synthetic */ com.userlabs.xshare.arch.db.entity.q c;

    public /* synthetic */ m0(o0 o0Var, com.userlabs.xshare.arch.db.entity.q qVar, int i) {
        this.a = i;
        this.b = o0Var;
        this.c = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        com.userlabs.xshare.arch.db.entity.q qVar = this.c;
        o0 o0Var = this.b;
        switch (i) {
            case 0:
                o0Var.lambda$saveProfile$2(qVar);
                break;
            default:
                o0Var.saveProfile(qVar);
                break;
        }
    }
}
