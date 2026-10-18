package androidx.camera.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SurfaceRequest.h b;
    public final /* synthetic */ SurfaceRequest.g c;

    public /* synthetic */ h2(SurfaceRequest.h hVar, SurfaceRequest.g gVar, int i) {
        this.a = i;
        this.b = hVar;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onTransformationInfoUpdate(this.c);
                break;
            default:
                this.b.onTransformationInfoUpdate(this.c);
                break;
        }
    }
}
