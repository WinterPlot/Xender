package kotlinx.coroutines.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class s<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public s(boolean z) {
        this._cur$volatile = new t(8, z);
    }

    private final /* synthetic */ Object get_cur$volatile() {
        return this._cur$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlin.jvm.functions.l<Object, kotlin.y> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_cur$volatile(Object obj) {
        this._cur$volatile = obj;
    }

    public final boolean addLast(E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            int iAddLast = tVar.addLast(e);
            if (iAddLast == 0) {
                return true;
            }
            if (iAddLast == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                t<E> next = tVar.next();
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar, next) && atomicReferenceFieldUpdater2.get(this) == tVar) {
                }
            } else if (iAddLast == 2) {
                return false;
            }
        }
    }

    public final void close() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            if (tVar.close()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            t<E> next = tVar.next();
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar, next) && atomicReferenceFieldUpdater2.get(this) == tVar) {
            }
        }
    }

    public final int getSize() {
        return ((t) a.get(this)).getSize();
    }

    public final boolean isClosed() {
        return ((t) a.get(this)).isClosed();
    }

    public final boolean isEmpty() {
        return ((t) a.get(this)).isEmpty();
    }

    public final <R> List<R> map(kotlin.jvm.functions.l<? super E, ? extends R> lVar) {
        return ((t) a.get(this)).map(lVar);
    }

    public final E removeFirstOrNull() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            E e = (E) tVar.removeFirstOrNull();
            if (e != t.h) {
                return e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            t<E> next = tVar.next();
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar, next) && atomicReferenceFieldUpdater2.get(this) == tVar) {
            }
        }
    }
}
