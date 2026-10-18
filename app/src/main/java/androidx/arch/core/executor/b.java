package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class b extends d {
    private static volatile b c;
    private static final Executor d;
    private static final Executor e;
    private d a;
    private final d b;

    static {
        final int i = 0;
        d = new Executor() { // from class: androidx.arch.core.executor.a
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                switch (i) {
                    case 0:
                        b.lambda$static$0(runnable);
                        break;
                    default:
                        b.lambda$static$1(runnable);
                        break;
                }
            }
        };
        final int i2 = 1;
        e = new Executor() { // from class: androidx.arch.core.executor.a
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                switch (i2) {
                    case 0:
                        b.lambda$static$0(runnable);
                        break;
                    default:
                        b.lambda$static$1(runnable);
                        break;
                }
            }
        };
    }

    private b() {
        c cVar = new c();
        this.b = cVar;
        this.a = cVar;
    }

    public static Executor getIOThreadExecutor() {
        return e;
    }

    public static b getInstance() {
        if (c != null) {
            return c;
        }
        synchronized (b.class) {
            try {
                if (c == null) {
                    c = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static Executor getMainThreadExecutor() {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Runnable runnable) {
        getInstance().postToMainThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(Runnable runnable) {
        getInstance().executeOnDiskIO(runnable);
    }

    @Override // androidx.arch.core.executor.d
    public void executeOnDiskIO(Runnable runnable) {
        this.a.executeOnDiskIO(runnable);
    }

    @Override // androidx.arch.core.executor.d
    public boolean isMainThread() {
        return this.a.isMainThread();
    }

    @Override // androidx.arch.core.executor.d
    public void postToMainThread(Runnable runnable) {
        this.a.postToMainThread(runnable);
    }

    public void setDelegate(d dVar) {
        if (dVar == null) {
            dVar = this.b;
        }
        this.a = dVar;
    }
}
