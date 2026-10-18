package androidx.camera.video.internal.encoder;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements CallbackToFutureAdapter.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ EncoderImpl.d b;

    public /* synthetic */ s(EncoderImpl.d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        int i = this.a;
        EncoderImpl.d dVar = this.b;
        switch (i) {
            case 0:
                return dVar.lambda$fetchData$1(aVar);
            default:
                return dVar.lambda$acquireBuffer$5(aVar);
        }
    }
}
