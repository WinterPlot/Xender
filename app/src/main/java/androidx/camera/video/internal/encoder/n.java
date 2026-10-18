package androidx.camera.video.internal.encoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EncoderImpl b;

    public /* synthetic */ n(EncoderImpl encoderImpl, int i) {
        this.a = i;
        this.b = encoderImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        EncoderImpl encoderImpl = this.b;
        switch (i) {
            case 0:
                encoderImpl.signalEndOfInputStream();
                break;
            case 1:
                encoderImpl.lambda$stop$3();
                break;
            case 2:
                encoderImpl.lambda$stop$2();
                break;
            case 3:
                encoderImpl.lambda$release$6();
                break;
            case 4:
                encoderImpl.lambda$requestKeyFrame$8();
                break;
            default:
                encoderImpl.lambda$signalSourceStopped$7();
                break;
        }
    }
}
