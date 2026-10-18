package com.userlabs.xshare;

import android.os.Handler;
import android.os.Looper;
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
public class g0 {
    public static final int e = Runtime.getRuntime().availableProcessors();
    private static final int f = netExecutorPoolCount();
    private static final int g = localExecutorPoolCount();
    private static g0 h;
    private final Executor a;
    private final Executor b;
    private final Executor c;
    private final Executor d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "network-io-" + this.a.incrementAndGet());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class b implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "local-work-" + this.a.incrementAndGet());
        }
    }

    private g0() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new e0());
        int i = f;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1000);
        a aVar = new a();
        RejectedExecutionHandler rejectedExecutionHandlerRejectHandler = rejectHandler();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0L, timeUnit, linkedBlockingQueue, aVar, rejectedExecutionHandlerRejectHandler);
        int i2 = g;
        this(executorServiceNewSingleThreadExecutor, threadPoolExecutor, new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new LinkedBlockingQueue(1000), new b(), rejectHandler()), new c(0));
    }

    public static g0 getInstance() {
        g0 g0Var = h;
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0();
        h = g0Var2;
        return g0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$new$0(Runnable runnable) {
        return new Thread(runnable, "disk-io");
    }

    private static int localExecutorPoolCount() {
        return Math.max(e + 1, 5);
    }

    private static int netExecutorPoolCount() {
        return Math.max(e * 2, 5);
    }

    private static RejectedExecutionHandler rejectHandler() {
        return new f0();
    }

    public Executor diskIO() {
        return this.a;
    }

    public Handler getMainThreadHandler() {
        return ((c) this.d).getMainThreadHandler();
    }

    public Executor localWorkIO() {
        return this.c;
    }

    public Executor mainThread() {
        return this.d;
    }

    public void mainThreadExecuteDelayed(Runnable runnable, long j) {
        Executor executor = this.d;
        if (executor instanceof c) {
            ((c) executor).executeDelayed(runnable, j);
        }
    }

    public void mainThreadRemoveCallbacks(Runnable runnable) {
        Executor executor = this.d;
        if (executor instanceof c) {
            ((c) executor).removeCallbacks(runnable);
        }
    }

    public Executor networkIO() {
        return this.b;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c implements Executor {
        private final Handler a;

        private c() {
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

        public /* synthetic */ c(int i) {
            this();
        }
    }

    private g0(Executor executor, Executor executor2, Executor executor3, Executor executor4) {
        this.a = executor;
        this.b = executor2;
        this.d = executor4;
        this.c = executor3;
    }
}
