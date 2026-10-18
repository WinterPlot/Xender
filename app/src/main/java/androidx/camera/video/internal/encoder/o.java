package androidx.camera.video.internal.encoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EncoderImpl b;
    public final /* synthetic */ long c;

    public /* synthetic */ o(EncoderImpl encoderImpl, long j, int i) {
        this.a = i;
        this.b = encoderImpl;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        EncoderImpl encoderImpl = this.b;
        switch (i) {
            case 0:
                encoderImpl.lambda$start$1(j);
                break;
            default:
                encoderImpl.lambda$pause$5(j);
                break;
        }
    }
}
