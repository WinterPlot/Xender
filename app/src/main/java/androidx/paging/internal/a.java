package androidx.paging.internal;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements Iterable<T>, kotlin.jvm.internal.markers.a {
    private final CopyOnWriteArrayList<T> a = new CopyOnWriteArrayList<>();

    public final boolean add(T t) {
        return this.a.add(t);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        Iterator<T> it = this.a.iterator();
        it.getClass();
        return it;
    }

    public final boolean remove(T t) {
        return this.a.remove(t);
    }
}
