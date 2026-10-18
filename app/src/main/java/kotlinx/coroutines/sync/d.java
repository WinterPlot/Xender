package kotlinx.coroutines.sync;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface d {
    Object acquire(kotlin.coroutines.d<? super y> dVar);

    int getAvailablePermits();

    void release();

    boolean tryAcquire();
}
