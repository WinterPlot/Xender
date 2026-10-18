package androidx.camera.core.impl.utils.executor;

import android.os.Process;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class b implements Executor {
    private static volatile Executor b;
    private final ExecutorService a = Executors.newFixedThreadPool(2, new a());

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(0);

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$newThread$0(Runnable runnable) {
            Process.setThreadPriority(-16);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: androidx.camera.core.impl.utils.executor.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.lambda$newThread$0(runnable);
                }
            });
            Locale locale = Locale.US;
            thread.setName("CameraX-camerax_audio_" + this.a.getAndIncrement());
            return thread;
        }
    }

    public static Executor getInstance() {
        if (b != null) {
            return b;
        }
        synchronized (b.class) {
            try {
                if (b == null) {
                    b = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
