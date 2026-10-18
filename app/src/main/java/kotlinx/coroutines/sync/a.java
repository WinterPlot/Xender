package kotlinx.coroutines.sync;

import kotlin.y;
import kotlinx.coroutines.selects.g;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface a {
    g<Object, a> getOnLock();

    boolean holdsLock(Object obj);

    boolean isLocked();

    Object lock(Object obj, kotlin.coroutines.d<? super y> dVar);

    boolean tryLock(Object obj);

    void unlock(Object obj);

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0688a {
        public static /* synthetic */ Object lock$default(a aVar, Object obj, kotlin.coroutines.d dVar, int i, Object obj2) {
            if (obj2 != null) {
                b0.p("Super calls with default arguments not supported in this target, function: lock");
                return null;
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return aVar.lock(obj, dVar);
        }

        public static /* synthetic */ boolean tryLock$default(a aVar, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                b0.p("Super calls with default arguments not supported in this target, function: tryLock");
                return false;
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return aVar.tryLock(obj);
        }

        public static /* synthetic */ void unlock$default(a aVar, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                b0.p("Super calls with default arguments not supported in this target, function: unlock");
                return;
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            aVar.unlock(obj);
        }

        public static /* synthetic */ void getOnLock$annotations() {
        }
    }
}
