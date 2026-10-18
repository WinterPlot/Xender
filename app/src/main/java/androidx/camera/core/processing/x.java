package androidx.camera.core.processing;

import androidx.camera.core.impl.DeferrableSurface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeferrableSurface b;

    public /* synthetic */ x(DeferrableSurface deferrableSurface, int i) {
        this.a = i;
        this.b = deferrableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DeferrableSurface deferrableSurface = this.b;
        switch (i) {
            case 0:
                deferrableSurface.close();
                break;
            default:
                deferrableSurface.decrementUseCount();
                break;
        }
    }
}
