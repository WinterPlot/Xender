package androidx.camera.video;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Recorder.j.a) obj).lambda$onFailure$0();
                break;
            case 1:
                ((VideoEncoderSession) obj).lambda$terminateNow$3();
                break;
            default:
                ((c1) obj).notifyReset();
                break;
        }
    }
}
