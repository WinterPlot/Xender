package com.userlabs.xshare.disconnect;

import androidx.lifecycle.h0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ h0 c;

    public /* synthetic */ l(h0 h0Var, boolean z) {
        this.c = h0Var;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h0 h0Var = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                m.lambda$getNeedShowDisconnectLiveData$0(h0Var, z);
                break;
            default:
                com.userlabs.xshare.upgrade.f.lambda$needShowUploadDialog$7(z, h0Var);
                break;
        }
    }

    public /* synthetic */ l(boolean z, h0 h0Var) {
        this.b = z;
        this.c = h0Var;
    }
}
