package androidx.camera.core.impl.utils.futures;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements CallbackToFutureAdapter.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListenableFuture b;

    public /* synthetic */ f(ListenableFuture listenableFuture, int i) {
        this.a = i;
        this.b = listenableFuture;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        int i = this.a;
        ListenableFuture listenableFuture = this.b;
        switch (i) {
            case 0:
                return k.lambda$transformAsyncOnCompletion$8(listenableFuture, aVar);
            default:
                return k.lambda$nonCancellationPropagating$0(listenableFuture, aVar);
        }
    }
}
