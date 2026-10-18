package androidx.core.util;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class h<T> extends g<T> {
    private final Object c;

    public h(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // androidx.core.util.g, androidx.core.util.f
    public T acquire() {
        T t;
        synchronized (this.c) {
            t = (T) super.acquire();
        }
        return t;
    }

    @Override // androidx.core.util.g, androidx.core.util.f
    public boolean release(T t) {
        boolean zRelease;
        t.getClass();
        synchronized (this.c) {
            zRelease = super.release(t);
        }
        return zRelease;
    }
}
