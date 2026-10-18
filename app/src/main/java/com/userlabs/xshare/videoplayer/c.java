package com.userlabs.xshare.videoplayer;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.p;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private static c d;
    private Executor a;
    private Executor b;
    private final b c = new b(0);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "local-work-" + this.a.incrementAndGet());
        }
    }

    private c() {
    }

    public static c getInstance() {
        c cVar = d;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        d = cVar2;
        return cVar2;
    }

    private static RejectedExecutionHandler rejectHandler() {
        return new p(1);
    }

    public Executor diskIO() {
        Executor executor = this.b;
        if (executor != null) {
            return executor;
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.b = executorServiceNewSingleThreadExecutor;
        return executorServiceNewSingleThreadExecutor;
    }

    public Executor getExecutor() {
        Executor executor = this.a;
        if (executor != null) {
            return executor;
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1000), new a(), rejectHandler());
        this.a = threadPoolExecutor;
        return threadPoolExecutor;
    }

    public Executor getMainThread() {
        return this.c;
    }

    public void mainThreadExecuteDelayed(Runnable runnable, long j) {
        this.c.executeDelayed(runnable, j);
    }

    public void mainThreadRemoveCallbacks(Runnable runnable) {
        this.c.removeCallbacks(runnable);
    }

    public void setExecutor(Executor executor, Executor executor2) {
        this.a = executor;
        this.b = executor2;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b implements Executor {
        private final Handler a;

        private b() {
            this.a = new Handler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.a.post(runnable);
        }

        public void executeDelayed(Runnable runnable, long j) {
            this.a.postDelayed(runnable, j);
        }

        public Handler getMainThreadHandler() {
            return this.a;
        }

        public void removeCallbacks(Runnable runnable) {
            this.a.removeCallbacks(runnable);
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }
}
