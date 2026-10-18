package androidx.activity;

import android.hardware.camera2.CameraExtensionSession;
import android.window.OnBackInvokedDispatcher;
import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.core.i1;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements androidx.arch.core.util.a, androidx.camera.core.internal.utils.b.a {
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return CameraExtensionSession.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(int i, Object obj, String str) {
        throw new IllegalStateException((str + obj + ((char) i)).toString());
    }

    @Override // androidx.arch.core.util.a
    public Object apply(Object obj) {
        return CoroutineAdaptersKt.asVoidListenableFuture$lambda$0(obj);
    }

    @Override // androidx.camera.core.internal.utils.b.a
    public void onRemove(Object obj) {
        androidx.camera.camera2.adapter.j0.zslRingBuffer$lambda$0((i1) obj);
    }
}
