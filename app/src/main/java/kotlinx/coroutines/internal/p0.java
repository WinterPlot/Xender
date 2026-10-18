package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.q0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class p0<T extends q0 & Comparable<? super T>> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private T[] a;

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final T[] realloc() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new q0[4];
            this.a = tArr2;
            return tArr2;
        }
        if (getSize() < tArr.length) {
            return tArr;
        }
        T[] tArr3 = (T[]) ((q0[]) Arrays.copyOf(tArr, getSize() * 2));
        this.a = tArr3;
        return tArr3;
    }

    private final void setSize(int i) {
        b.set(this, i);
    }

    private final /* synthetic */ void set_size$volatile(int i) {
        this._size$volatile = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    private final void siftDownFrom(int i) {
        while (true) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            if (i3 >= getSize()) {
                return;
            }
            T[] tArr = this.a;
            tArr.getClass();
            int i4 = i2 + 2;
            if (i4 < getSize()) {
                T t = tArr[i4];
                t.getClass();
                T t2 = tArr[i3];
                t2.getClass();
                if (((Comparable) t).compareTo(t2) >= 0) {
                    i4 = i3;
                }
            } else {
                i4 = i3;
            }
            T t3 = tArr[i];
            t3.getClass();
            T t4 = tArr[i4];
            t4.getClass();
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            swap(i, i4);
            i = i4;
        }
    }

    private final void siftUpFrom(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            tArr.getClass();
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            t.getClass();
            T t2 = tArr[i];
            t2.getClass();
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            swap(i, i2);
            i = i2;
        }
    }

    private final void swap(int i, int i2) {
        T[] tArr = this.a;
        tArr.getClass();
        T t = tArr[i2];
        t.getClass();
        T t2 = tArr[i];
        t2.getClass();
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }

    public final void addImpl(T t) {
        t.setHeap(this);
        q0[] q0VarArrRealloc = realloc();
        int size = getSize();
        setSize(size + 1);
        q0VarArrRealloc[size] = t;
        t.setIndex(size);
        siftUpFrom(size);
    }

    public final void addLast(T t) {
        synchronized (this) {
            addImpl(t);
            kotlin.y yVar = kotlin.y.a;
        }
    }

    public final boolean addLastIf(T t, kotlin.jvm.functions.l<? super T, Boolean> lVar) {
        boolean z;
        synchronized (this) {
            try {
                if (lVar.invoke(firstImpl()).booleanValue()) {
                    addImpl(t);
                    z = true;
                } else {
                    z = false;
                }
                kotlin.jvm.internal.w.finallyStart(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.w.finallyStart(1);
                kotlin.jvm.internal.w.finallyEnd(1);
                throw th;
            }
        }
        kotlin.jvm.internal.w.finallyEnd(1);
        return z;
    }

    public final T find(kotlin.jvm.functions.l<? super T, Boolean> lVar) {
        T t;
        synchronized (this) {
            try {
                int size = getSize();
                int i = 0;
                while (true) {
                    t = null;
                    if (i >= size) {
                        break;
                    }
                    T[] tArr = this.a;
                    if (tArr != null) {
                        t = (Object) tArr[i];
                    }
                    t.getClass();
                    if (lVar.invoke(t).booleanValue()) {
                        break;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public final T firstImpl() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int getSize() {
        return b.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final T peek() {
        T t;
        synchronized (this) {
            t = (T) firstImpl();
        }
        return t;
    }

    public final boolean remove(T t) {
        boolean z;
        synchronized (this) {
            if (t.getHeap() == null) {
                z = false;
            } else {
                removeAtImpl(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public final T removeAtImpl(int i) {
        T[] tArr = this.a;
        tArr.getClass();
        setSize(getSize() - 1);
        if (i < getSize()) {
            swap(i, getSize());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                t.getClass();
                T t2 = tArr[i2];
                t2.getClass();
                if (((Comparable) t).compareTo(t2) < 0) {
                    swap(i, i2);
                    siftUpFrom(i2);
                } else {
                    siftDownFrom(i);
                }
            } else {
                siftDownFrom(i);
            }
        }
        T t3 = tArr[getSize()];
        t3.getClass();
        t3.setHeap(null);
        t3.setIndex(-1);
        tArr[getSize()] = null;
        return t3;
    }

    public final T removeFirstIf(kotlin.jvm.functions.l<? super T, Boolean> lVar) {
        synchronized (this) {
            int i = 1;
            try {
                q0 q0VarFirstImpl = firstImpl();
                T t = null;
                if (q0VarFirstImpl == null) {
                    kotlin.jvm.internal.w.finallyStart(2);
                    return null;
                }
                if (lVar.invoke(q0VarFirstImpl).booleanValue()) {
                    t = (T) removeAtImpl(0);
                }
                kotlin.jvm.internal.w.finallyStart(i);
                return t;
            } finally {
                kotlin.jvm.internal.w.finallyStart(i);
                kotlin.jvm.internal.w.finallyEnd(i);
            }
        }
    }

    public final T removeFirstOrNull() {
        T t;
        synchronized (this) {
            t = getSize() > 0 ? (T) removeAtImpl(0) : null;
        }
        return t;
    }
}
