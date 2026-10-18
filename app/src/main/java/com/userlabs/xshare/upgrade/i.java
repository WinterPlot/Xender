package com.userlabs.xshare.upgrade;

import com.userlabs.xshare.util.n;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ i(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                j.lambda$startXShareUpdated$0(i2);
                break;
            default:
                n.lambda$stop$1(i2);
                break;
        }
    }
}
