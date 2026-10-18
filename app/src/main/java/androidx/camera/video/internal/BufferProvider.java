package androidx.camera.video.internal;

import androidx.camera.core.impl.e2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface BufferProvider<T> extends e2<State> {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum State {
        ACTIVE,
        INACTIVE
    }

    ListenableFuture<T> acquireBuffer();

    @Override // androidx.camera.core.impl.e2
    /* synthetic */ void addObserver(Executor executor, e2.a<? super State> aVar);

    @Override // androidx.camera.core.impl.e2
    /* synthetic */ ListenableFuture<State> fetchData();

    @Override // androidx.camera.core.impl.e2
    /* synthetic */ void removeObserver(e2.a<? super State> aVar);
}
