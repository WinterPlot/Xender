package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements f<Object> {
    public final Throwable a;

    public b0(Throwable th) {
        this.a = th;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object emit(Object obj, kotlin.coroutines.d<? super kotlin.y> dVar) throws Throwable {
        throw this.a;
    }
}
