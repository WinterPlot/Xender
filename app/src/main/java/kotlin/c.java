package kotlin;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c<T, R> {
    public /* synthetic */ c(kotlin.jvm.internal.r rVar) {
        this();
    }

    public abstract Object callRecursive(T t, kotlin.coroutines.d<? super R> dVar);

    public abstract <U, S> Object callRecursive(a<U, S> aVar, U u, kotlin.coroutines.d<? super S> dVar);

    public final Void invoke(a<?, ?> aVar, Object obj) {
        aVar.getClass();
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }

    private c() {
    }
}
