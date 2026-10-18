package androidx.media3.session;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c1 implements t1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;
    public final /* synthetic */ a5 c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ c1(int i, a5 a5Var, Bundle bundle, t1 t1Var) {
        this.a = i;
        this.b = t1Var;
        this.c = a5Var;
        this.d = bundle;
    }

    @Override // androidx.media3.session.t1.d
    public final void run(q qVar, int i) throws RemoteException {
        int i2 = this.a;
        Bundle bundle = this.d;
        a5 a5Var = this.c;
        t1 t1Var = this.b;
        switch (i2) {
            case 0:
                t1Var.lambda$sendCustomCommand$21(a5Var, bundle, qVar, i);
                break;
            default:
                t1Var.lambda$sendCustomCommand$22(null, a5Var, bundle, qVar, i);
                break;
        }
    }
}
