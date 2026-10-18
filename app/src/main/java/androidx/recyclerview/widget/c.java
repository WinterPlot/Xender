package androidx.recyclerview.widget;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class c<T> {
    private final Executor a;
    private final Executor b;
    private final i.f<T> c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a<T> {
        private static final Object d = new Object();
        private static Executor e;
        private Executor a;
        private Executor b;
        private final i.f<T> c;

        public a(i.f<T> fVar) {
            this.c = fVar;
        }

        public c<T> build() {
            Executor executorNewFixedThreadPool = this.b;
            if (executorNewFixedThreadPool == null) {
                synchronized (d) {
                    try {
                        executorNewFixedThreadPool = e;
                        if (executorNewFixedThreadPool == null) {
                            executorNewFixedThreadPool = Executors.newFixedThreadPool(2);
                            e = executorNewFixedThreadPool;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.b = executorNewFixedThreadPool;
            }
            return new c<>(this.a, executorNewFixedThreadPool, this.c);
        }

        public a<T> setBackgroundThreadExecutor(Executor executor) {
            this.b = executor;
            return this;
        }

        public a<T> setMainThreadExecutor(Executor executor) {
            this.a = executor;
            return this;
        }
    }

    public c(Executor executor, Executor executor2, i.f<T> fVar) {
        this.a = executor;
        this.b = executor2;
        this.c = fVar;
    }

    public Executor getBackgroundThreadExecutor() {
        return this.b;
    }

    public i.f<T> getDiffCallback() {
        return this.c;
    }

    public Executor getMainThreadExecutor() {
        return this.a;
    }
}
