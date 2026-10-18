package androidx.media3.session;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0 implements t1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ o0(t1 t1Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = t1Var;
        this.c = i;
        this.d = i2;
    }

    @Override // androidx.media3.session.t1.d
    public final void run(q qVar, int i) throws RemoteException {
        int i2 = this.a;
        int i3 = this.d;
        int i4 = this.c;
        t1 t1Var = this.b;
        switch (i2) {
            case 0:
                t1Var.lambda$moveMediaItem$43(i4, i3, qVar, i);
                break;
            case 1:
                t1Var.lambda$removeMediaItems$41(i4, i3, qVar, i);
                break;
            default:
                t1Var.lambda$setDeviceVolume$64(i4, i3, qVar, i);
                break;
        }
    }
}
