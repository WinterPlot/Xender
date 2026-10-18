package androidx.camera.core.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
@FunctionalInterface
public interface a<I, O> {
    ListenableFuture<O> apply(I i) throws Exception;
}
