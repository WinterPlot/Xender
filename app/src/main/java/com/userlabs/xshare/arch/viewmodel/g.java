package com.userlabs.xshare.arch.viewmodel;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.lifecycle.h0 b;
    public final /* synthetic */ List c;

    public /* synthetic */ g(androidx.lifecycle.h0 h0Var, List list, int i) {
        this.a = i;
        this.b = h0Var;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.setValue(this.c);
                break;
            case 1:
                this.b.setValue(this.c);
                break;
            case 2:
                this.b.setValue(this.c);
                break;
            default:
                this.b.setValue(this.c);
                break;
        }
    }
}
