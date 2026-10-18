package androidx.camera.core.processing;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements CallbackToFutureAdapter.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((a0.a) obj).lambda$new$0(aVar);
            default:
                return ((b0) obj).lambda$new$0(aVar);
        }
    }
}
