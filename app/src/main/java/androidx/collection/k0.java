package androidx.collection;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    private static final Object[] a = new Object[0];
    private static final j0<Object> b = new g0(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            androidx.collection.internal.d.throwIndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            androidx.collection.internal.d.throwIllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        }
        if (i < 0) {
            androidx.collection.internal.d.throwIndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        }
        if (i2 > size) {
            androidx.collection.internal.d.throwIndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final <E> j0<E> emptyObjectList() {
        j0<E> j0Var = (j0<E>) b;
        j0Var.getClass();
        return j0Var;
    }

    public static final <E> g0<E> mutableObjectListOf(E e, E e2, E e3) {
        g0<E> g0Var = new g0<>(3);
        g0Var.add(e);
        g0Var.add(e2);
        g0Var.add(e3);
        return g0Var;
    }

    public static final <E> j0<E> objectListOf(E... eArr) {
        eArr.getClass();
        g0 g0Var = new g0(eArr.length);
        g0Var.plusAssign((Object[]) eArr);
        return g0Var;
    }

    public static final <E> j0<E> objectListOf(E e) {
        return mutableObjectListOf(e);
    }

    public static final <E> j0<E> objectListOf(E e, E e2) {
        return mutableObjectListOf(e, e2);
    }

    public static final <E> j0<E> objectListOf(E e, E e2, E e3) {
        return mutableObjectListOf(e, e2, e3);
    }

    public static final <E> g0<E> mutableObjectListOf(E e) {
        g0<E> g0Var = new g0<>(1);
        g0Var.add(e);
        return g0Var;
    }

    public static final <E> j0<E> objectListOf() {
        j0<E> j0Var = (j0<E>) b;
        j0Var.getClass();
        return j0Var;
    }

    public static final <E> g0<E> mutableObjectListOf(E e, E e2) {
        g0<E> g0Var = new g0<>(2);
        g0Var.add(e);
        g0Var.add(e2);
        return g0Var;
    }

    public static final <E> g0<E> mutableObjectListOf() {
        return new g0<>(0, 1, null);
    }

    public static final <E> g0<E> mutableObjectListOf(E... eArr) {
        eArr.getClass();
        g0<E> g0Var = new g0<>(eArr.length);
        g0Var.plusAssign((Object[]) eArr);
        return g0Var;
    }
}
