package androidx.camera.video.internal.encoder;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements CallbackToFutureAdapter.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ c0(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        int i = this.a;
        AtomicReference atomicReference = this.b;
        switch (i) {
            case 0:
                return d0.lambda$new$0(atomicReference, aVar);
            case 1:
                return g.lambda$new$0(atomicReference, aVar);
            case 2:
                return i.lambda$new$0(atomicReference, aVar);
            case 3:
                return EncoderImpl.lambda$acquireInputBuffer$13(atomicReference, aVar);
            default:
                return EncoderImpl.lambda$new$0(atomicReference, aVar);
        }
    }
}
