package androidx.camera.video.internal.encoder;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EncoderImpl.d b;
    public final /* synthetic */ CallbackToFutureAdapter.a c;

    public /* synthetic */ t(EncoderImpl.d dVar, CallbackToFutureAdapter.a aVar, int i) {
        this.a = i;
        this.b = dVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CallbackToFutureAdapter.a aVar = this.c;
        EncoderImpl.d dVar = this.b;
        switch (i) {
            case 0:
                dVar.lambda$acquireBuffer$4(aVar);
                break;
            default:
                dVar.lambda$fetchData$0(aVar);
                break;
        }
    }
}
