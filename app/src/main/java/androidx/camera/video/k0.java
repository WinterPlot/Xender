package androidx.camera.video;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Recorder b;
    public final /* synthetic */ Recorder.i c;

    public /* synthetic */ k0(Recorder recorder, Recorder.i iVar, int i) {
        this.a = i;
        this.b = recorder;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Recorder.i iVar = this.c;
        Recorder recorder = this.b;
        switch (i) {
            case 0:
                recorder.lambda$resume$6(iVar);
                break;
            default:
                recorder.lambda$pause$5(iVar);
                break;
        }
    }
}
