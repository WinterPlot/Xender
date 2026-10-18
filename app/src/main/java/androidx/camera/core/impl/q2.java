package androidx.camera.core.impl;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q2<T> implements e2<T> {
    private final AtomicReference<Object> b;
    private final Object a = new Object();
    private int c = 0;
    private boolean d = false;
    private final Map<e2.a<? super T>, b<T>> e = new HashMap();
    private final CopyOnWriteArraySet<b<T>> f = new CopyOnWriteArraySet<>();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        public static a wrap(Throwable th) {
            return new o(th);
        }

        public abstract Throwable getError();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b<T> implements Runnable {
        private static final Object h = new Object();
        private final Executor a;
        private final e2.a<? super T> b;
        private final AtomicReference<Object> d;
        private final AtomicBoolean c = new AtomicBoolean(true);
        private Object e = h;
        private int f = -1;
        private boolean g = false;

        public b(AtomicReference<Object> atomicReference, Executor executor, e2.a<? super T> aVar) {
            this.d = atomicReference;
            this.a = executor;
            this.b = aVar;
        }

        public void close() {
            this.c.set(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.c.get()) {
                        this.g = false;
                        return;
                    }
                    Object obj = this.d.get();
                    int i = this.f;
                    while (true) {
                        if (!Objects.equals(this.e, obj)) {
                            this.e = obj;
                            boolean z = obj instanceof a;
                            e2.a<? super T> aVar = this.b;
                            if (z) {
                                aVar.onError(((a) obj).getError());
                            } else {
                                aVar.onNewData(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i == this.f || !this.c.get()) {
                                    break;
                                    break;
                                } else {
                                    obj = this.d.get();
                                    i = this.f;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    this.g = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void update(int i) {
            synchronized (this) {
                try {
                    if (this.c.get()) {
                        if (i <= this.f) {
                            return;
                        }
                        this.f = i;
                        if (this.g) {
                            return;
                        }
                        this.g = true;
                        try {
                            this.a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.g = false;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public q2(Object obj, boolean z) {
        if (!z) {
            this.b = new AtomicReference<>(obj);
        } else {
            androidx.core.util.i.checkArgument(obj instanceof Throwable, "Initial errors must be Throwable");
            this.b = new AtomicReference<>(a.wrap((Throwable) obj));
        }
    }

    private void removeObserverLocked(e2.a<? super T> aVar) {
        b<T> bVarRemove = this.e.remove(aVar);
        if (bVarRemove != null) {
            bVarRemove.close();
            this.f.remove(bVarRemove);
        }
    }

    private void updateStateInternal(Object obj) {
        Iterator<b<T>> it;
        int i;
        synchronized (this.a) {
            try {
                if (Objects.equals(this.b.getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.c + 1;
                this.c = i2;
                if (this.d) {
                    return;
                }
                this.d = true;
                Iterator<b<T>> it2 = this.f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().update(i2);
                    } else {
                        synchronized (this.a) {
                            try {
                                if (this.c == i2) {
                                    this.d = false;
                                    return;
                                } else {
                                    it = this.f.iterator();
                                    i = this.c;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        it2 = it;
                        i2 = i;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.e2
    public void addObserver(Executor executor, e2.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.a) {
            removeObserverLocked(aVar);
            bVar = new b<>(this.b, executor, aVar);
            this.e.put(aVar, bVar);
            this.f.add(bVar);
        }
        bVar.update(0);
    }

    @Override // androidx.camera.core.impl.e2
    public ListenableFuture<T> fetchData() {
        Object obj = this.b.get();
        return obj instanceof a ? androidx.camera.core.impl.utils.futures.k.immediateFailedFuture(((a) obj).getError()) : androidx.camera.core.impl.utils.futures.k.immediateFuture(obj);
    }

    @Override // androidx.camera.core.impl.e2
    public void removeObserver(e2.a<? super T> aVar) {
        synchronized (this.a) {
            removeObserverLocked(aVar);
        }
    }

    public void removeObservers() {
        synchronized (this.a) {
            try {
                Iterator it = new HashSet(this.e.keySet()).iterator();
                while (it.hasNext()) {
                    removeObserverLocked((e2.a) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateState(T t) {
        updateStateInternal(t);
    }

    public void updateStateAsError(Throwable th) {
        updateStateInternal(a.wrap(th));
    }
}
