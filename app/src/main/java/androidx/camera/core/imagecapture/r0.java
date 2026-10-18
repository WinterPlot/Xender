package androidx.camera.core.imagecapture;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((s0) obj).issueNextRequest();
                break;
            case 1:
                ((s0) obj).lambda$trackCurrentRequests$0();
                break;
            default:
                ((s.a) obj).lambda$onCaptureStarted$0();
                break;
        }
    }
}
