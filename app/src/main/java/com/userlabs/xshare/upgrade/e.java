package com.userlabs.xshare.upgrade;

import com.google.common.util.concurrent.m0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ e(m0 m0Var, int i) {
        this.a = i;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        m0 m0Var = this.b;
        switch (i) {
            case 0:
                f.lambda$needShowSendDialog$8(m0Var);
                break;
            default:
                m0Var.set(null);
                break;
        }
    }
}
