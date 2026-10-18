package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    private static b a;

    private static final long currentTimeMillis() {
        b bVar = a;
        return bVar != null ? bVar.currentTimeMillis() : System.currentTimeMillis();
    }

    public static final void mockTimeSource(b bVar) {
        a = bVar;
    }

    private static final long nanoTime() {
        b bVar = a;
        return bVar != null ? bVar.nanoTime() : System.nanoTime();
    }

    private static final void parkNanos(Object obj, long j) {
        b bVar = a;
        if (bVar != null) {
            bVar.parkNanos(obj, j);
        } else {
            LockSupport.parkNanos(obj, j);
        }
    }

    private static final void registerTimeLoopThread() {
        b bVar = a;
        if (bVar != null) {
            bVar.registerTimeLoopThread();
        }
    }

    private static final void trackTask() {
        b bVar = a;
        if (bVar != null) {
            bVar.trackTask();
        }
    }

    private static final void unTrackTask() {
        b bVar = a;
        if (bVar != null) {
            bVar.unTrackTask();
        }
    }

    private static final void unpark(Thread thread) {
        b bVar = a;
        if (bVar != null) {
            bVar.unpark(thread);
        } else {
            LockSupport.unpark(thread);
        }
    }

    private static final void unregisterTimeLoopThread() {
        b bVar = a;
        if (bVar != null) {
            bVar.unregisterTimeLoopThread();
        }
    }

    private static final Runnable wrapTask(Runnable runnable) {
        Runnable runnableWrapTask;
        b bVar = a;
        return (bVar == null || (runnableWrapTask = bVar.wrapTask(runnable)) == null) ? runnable : runnableWrapTask;
    }
}
