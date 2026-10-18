package androidx.camera.core.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public /* synthetic */ k0(p0 p0Var, List list, int i, int i2) {
        this.a = i2;
        this.b = p0Var;
        this.c = list;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.d;
        List list = this.c;
        p0 p0Var = this.b;
        switch (i) {
            case 0:
                p0.scheduleRetryAttempt$lambda$0(p0Var, list, i2);
                break;
            default:
                p0.scheduleRetryAttempt$lambda$0$0(p0Var, list, i2);
                break;
        }
    }
}
