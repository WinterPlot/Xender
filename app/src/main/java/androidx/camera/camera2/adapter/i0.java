package androidx.camera.camera2.adapter;

import androidx.camera.core.b2;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ i0(b2 b2Var, int i) {
        this.a = i;
        this.b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b2 b2Var = this.b;
        switch (i) {
            case 0:
                b2Var.safeClose();
                break;
            default:
                b2Var.safeClose();
                break;
        }
    }
}
