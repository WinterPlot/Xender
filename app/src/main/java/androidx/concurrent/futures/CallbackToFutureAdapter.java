package androidx.concurrent.futures;

import androidx.camera.core.impl.y2;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class CallbackToFutureAdapter {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class FutureGarbageCollectedException extends Throwable {
        public FutureGarbageCollectedException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a<T> {
        Object a;
        c<T> b;
        private androidx.concurrent.futures.b<Void> c = androidx.concurrent.futures.b.create();
        private boolean d;

        private void setCompletedNormally() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public void addCancellationListener(Runnable runnable, Executor executor) {
            androidx.concurrent.futures.b<Void> bVar = this.c;
            if (bVar != null) {
                bVar.addListener(runnable, executor);
            }
        }

        public void finalize() {
            androidx.concurrent.futures.b<Void> bVar;
            c<T> cVar = this.b;
            if (cVar != null && !cVar.isDone()) {
                cVar.setException(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
            if (this.d || (bVar = this.c) == null) {
                return;
            }
            bVar.set(null);
        }

        public void fireCancellationListeners() {
            this.a = null;
            this.b = null;
            this.c.set(null);
        }

        public boolean set(T t) {
            this.d = true;
            c<T> cVar = this.b;
            boolean z = cVar != null && cVar.set(t);
            if (z) {
                setCompletedNormally();
            }
            return z;
        }

        public boolean setCancelled() {
            this.d = true;
            c<T> cVar = this.b;
            boolean z = cVar != null && cVar.cancelWithoutNotifyingCompleter(true);
            if (z) {
                setCompletedNormally();
            }
            return z;
        }

        public boolean setException(Throwable th) {
            this.d = true;
            c<T> cVar = this.b;
            boolean z = cVar != null && cVar.setException(th);
            if (z) {
                setCompletedNormally();
            }
            return z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b<T> {
        Object attachCompleter(a<T> aVar) throws Exception;
    }

    private CallbackToFutureAdapter() {
    }

    public static <T> ListenableFuture<T> getFuture(b<T> bVar) {
        a<T> aVar = new a<>();
        c<T> cVar = new c<>(aVar);
        aVar.b = cVar;
        aVar.a = bVar.getClass();
        try {
            Object objAttachCompleter = bVar.attachCompleter(aVar);
            if (objAttachCompleter == null) {
                return cVar;
            }
            aVar.a = objAttachCompleter;
            return cVar;
        } catch (Exception e) {
            cVar.setException(e);
            return cVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c<T> implements ListenableFuture<T> {
        final WeakReference<a<T>> a;
        private final AbstractResolvableFuture<T> b = new a();

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public class a extends AbstractResolvableFuture<T> {
            public a() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public String pendingToString() {
                a<T> aVar = c.this.a.get();
                return aVar == null ? "Completer object has been garbage collected, future will fail soon" : y2.A(new StringBuilder("tag=["), aVar.a, "]");
            }
        }

        public c(a<T> aVar) {
            this.a = new WeakReference<>(aVar);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.b.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            a<T> aVar = this.a.get();
            boolean zCancel = this.b.cancel(z);
            if (zCancel && aVar != null) {
                aVar.fireCancellationListeners();
            }
            return zCancel;
        }

        public boolean cancelWithoutNotifyingCompleter(boolean z) {
            return this.b.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            return this.b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.b.isDone();
        }

        public boolean set(T t) {
            return this.b.set(t);
        }

        public boolean setException(Throwable th) {
            return this.b.setException(th);
        }

        public String toString() {
            return this.b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.b.get(j, timeUnit);
        }
    }
}
