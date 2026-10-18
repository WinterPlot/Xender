package androidx.camera.core.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface e2<T> {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a<T> {
        void onError(Throwable th);

        void onNewData(T t);
    }

    void addObserver(Executor executor, a<? super T> aVar);

    ListenableFuture<T> fetchData();

    void removeObserver(a<? super T> aVar);
}
