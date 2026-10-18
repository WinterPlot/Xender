package androidx.media3.session;

import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w0 implements t1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;
    public final /* synthetic */ List c;

    public /* synthetic */ w0(int i, List list, t1 t1Var) {
        this.a = i;
        this.b = t1Var;
        this.c = list;
    }

    @Override // androidx.media3.session.t1.d
    public final void run(q qVar, int i) throws RemoteException {
        int i2 = this.a;
        List list = this.c;
        t1 t1Var = this.b;
        switch (i2) {
            case 0:
                t1Var.lambda$addMediaItems$37(list, qVar, i);
                break;
            default:
                t1Var.lambda$setMediaItems$27(list, qVar, i);
                break;
        }
    }
}
