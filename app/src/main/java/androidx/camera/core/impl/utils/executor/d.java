package androidx.camera.core.impl.utils.executor;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class d implements Executor {
    private static volatile d a;

    public static Executor getInstance() {
        if (a != null) {
            return a;
        }
        synchronized (d.class) {
            try {
                if (a == null) {
                    a = new d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
