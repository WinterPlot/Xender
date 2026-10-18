package androidx.camera.view;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements androidx.arch.core.util.a, u.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ b(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // androidx.arch.core.util.a
    public Object apply(Object obj) {
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                return dVar.lambda$new$0((s) obj);
            case 1:
                return dVar.enableTorch(((Boolean) obj).booleanValue());
            case 2:
                return dVar.setLinearZoom(((Float) obj).floatValue());
            default:
                return dVar.setZoomRatio(((Float) obj).floatValue());
        }
    }

    @Override // androidx.camera.view.u.b
    public void onRotationChanged(int i) {
        this.b.lambda$new$1(i);
    }
}
