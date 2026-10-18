package androidx.lifecycle;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class i1<T> {
    private final WeakReference<T> a;

    public i1(T t) {
        t.getClass();
        this.a = new WeakReference<>(t);
    }

    public final T get() {
        return this.a.get();
    }
}
