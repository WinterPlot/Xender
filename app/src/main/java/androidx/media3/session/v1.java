package androidx.media3.session;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v1 implements t1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1.f b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ v1(t1.f fVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = fVar;
        this.c = i;
        this.d = i2;
    }

    @Override // androidx.media3.session.t1.d
    public final void run(q qVar, int i) throws RemoteException {
        int i2 = this.a;
        int i3 = this.d;
        int i4 = this.c;
        t1.f fVar = this.b;
        switch (i2) {
            case 0:
                fVar.lambda$surfaceChanged$0(i4, i3, qVar, i);
                break;
            default:
                fVar.lambda$onSurfaceTextureSizeChanged$1(i4, i3, qVar, i);
                break;
        }
    }
}
