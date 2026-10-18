package kotlinx.serialization.internal;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class k1<T> {
    public volatile SoftReference<T> a = new SoftReference<>(null);

    public final synchronized T getOrSetWithLock(kotlin.jvm.functions.a<? extends T> aVar) {
        aVar.getClass();
        T t = this.a.get();
        if (t != null) {
            return t;
        }
        T tInvoke = aVar.invoke();
        this.a = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}
