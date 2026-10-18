package androidx.media3.exoplayer;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((k.b) obj2).lambda$enable$1((Context) obj);
                break;
            case 1:
                ((k.c) obj2).lambda$enable$1((Context) obj);
                break;
            case 2:
                ((l0) obj2).lambda$new$1((t0.e) obj);
                break;
            default:
                ((t0) obj2).lambda$sendMessageToTargetThread$4((o1) obj);
                break;
        }
    }
}
