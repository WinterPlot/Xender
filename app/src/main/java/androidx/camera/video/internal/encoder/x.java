package androidx.camera.video.internal.encoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((k) obj).onEncodeStop();
                break;
            case 1:
                ((k) obj).onEncodeStart();
                break;
            case 2:
                ((k) obj).onEncodePaused();
                break;
            default:
                ((EncoderImpl.e) obj).reachEndData();
                break;
        }
    }
}
