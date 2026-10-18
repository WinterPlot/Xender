package androidx.media3.common.util;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class r<T> {
    private final g a;
    private final Thread b;
    private final p c;
    private final b<T> d;
    private final CopyOnWriteArraySet<c<T>> e;
    private final ArrayDeque<Runnable> f;
    private final ArrayDeque<Runnable> g;
    private final Object h;
    private boolean i;
    private boolean j;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a<T> {
        void invoke(T t);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b<T> {
        void invoke(T t, androidx.media3.common.q qVar);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c<T> {
        public final T a;
        private androidx.media3.common.q.b b = new androidx.media3.common.q.b();
        private boolean c;
        private boolean d;

        public c(T t) {
            this.a = t;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release(b<T> bVar) {
            this.d = true;
            if (bVar == null || !this.c) {
                return;
            }
            this.c = false;
            bVar.invoke(this.a, this.b.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public void invoke(int i, a<T> aVar) {
            if (this.d) {
                return;
            }
            if (i != -1) {
                this.b.add(i);
            }
            this.c = true;
            aVar.invoke(this.a);
        }

        public void iterationFinished(b<T> bVar) {
            if (this.d || !this.c) {
                return;
            }
            androidx.media3.common.q qVarBuild = this.b.build();
            this.b = new androidx.media3.common.q.b();
            this.c = false;
            bVar.invoke(this.a, qVarBuild);
        }
    }

    private r(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, Thread thread, g gVar, b<T> bVar, boolean z) {
        this.a = gVar;
        this.b = thread;
        this.e = copyOnWriteArraySet;
        this.d = bVar;
        this.h = new Object();
        this.f = new ArrayDeque<>();
        this.g = new ArrayDeque<>();
        if (looper == null || gVar == null || bVar == null) {
            this.c = null;
        } else {
            this.c = gVar.createHandler(looper, new q(this, 0));
        }
        this.j = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        b<T> bVar = (b) com.google.common.base.m.checkNotNull(this.d);
        Iterator<c<T>> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().iterationFinished(bVar);
            if (((p) com.google.common.base.m.checkNotNull(this.c)).hasMessages(1)) {
                break;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queueEvent$0(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).invoke(i, aVar);
        }
    }

    private void verifyCurrentThread() {
        if (this.j) {
            com.google.common.base.m.checkState(isRunningOnCorrectThread());
        }
    }

    public void add(T t) {
        com.google.common.base.m.checkNotNull(t);
        synchronized (this.h) {
            try {
                if (this.i) {
                    return;
                }
                this.e.add(new c<>(t));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clear() {
        verifyCurrentThread();
        Iterator<c<T>> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().release(this.d);
        }
        this.e.clear();
    }

    public r<T> copy(g gVar) {
        p pVar = this.c;
        return pVar != null ? copy(pVar.getLooper(), gVar, this.d) : new r<>(this.e, null, this.b, gVar, null, this.j);
    }

    public void flushEvents() {
        verifyCurrentThread();
        if (this.g.isEmpty()) {
            return;
        }
        if (this.d != null && !((p) com.google.common.base.m.checkNotNull(this.c)).hasMessages(1)) {
            p pVar = this.c;
            pVar.sendMessageAtFrontOfQueue(pVar.obtainMessage(1));
        }
        boolean zIsEmpty = this.f.isEmpty();
        this.f.addAll(this.g);
        this.g.clear();
        if (zIsEmpty) {
            while (!this.f.isEmpty()) {
                this.f.peekFirst().run();
                this.f.removeFirst();
            }
        }
    }

    public boolean isRunningOnCorrectThread() {
        return Thread.currentThread() == this.b;
    }

    public void queueEvent(int i, a<T> aVar) {
        verifyCurrentThread();
        this.g.add(new androidx.activity.m(new CopyOnWriteArraySet(this.e), i, aVar, 2));
    }

    public void release() {
        verifyCurrentThread();
        synchronized (this.h) {
            this.i = true;
        }
        Iterator<c<T>> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().release(this.d);
        }
        this.e.clear();
    }

    public void remove(T t) {
        verifyCurrentThread();
        for (c<T> cVar : this.e) {
            if (cVar.a.equals(t)) {
                cVar.release(this.d);
                this.e.remove(cVar);
            }
        }
    }

    public void sendEvent(int i, a<T> aVar) {
        queueEvent(i, aVar);
        flushEvents();
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.j = z;
    }

    public int size() {
        verifyCurrentThread();
        return this.e.size();
    }

    public void sendEvent(a<T> aVar) {
        sendEvent(-1, aVar);
    }

    public void queueEvent(a<T> aVar) {
        queueEvent(-1, aVar);
    }

    public r<T> copy(Looper looper) {
        return copy(looper, this.a, this.d);
    }

    public r<T> copy(Looper looper, b<T> bVar) {
        return copy(looper, this.a, bVar);
    }

    public r<T> copy(Looper looper, g gVar, b<T> bVar) {
        com.google.common.base.m.checkState(gVar != null || bVar == null);
        return new r<>(this.e, looper, looper.getThread(), gVar, bVar, this.j);
    }

    public r(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public r(Looper looper, g gVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), gVar, bVar, true);
    }

    public r(Looper looper) {
        this(looper.getThread());
    }
}
