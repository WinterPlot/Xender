package androidx.collection.internal;

import kotlin.jvm.internal.w;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final <T> T synchronizedImpl(kotlin.jvm.functions.a<? extends T> aVar) {
        T tInvoke;
        aVar.getClass();
        synchronized (this) {
            try {
                tInvoke = aVar.invoke();
                w.finallyStart(1);
            } finally {
                w.finallyStart(1);
                w.finallyEnd(1);
            }
        }
        return tInvoke;
    }
}
