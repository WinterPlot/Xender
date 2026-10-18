package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class u<T> extends ClassValue<k1<T>> {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public final class a implements kotlin.jvm.functions.a<T> {
        final /* synthetic */ kotlin.jvm.functions.a<T> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.jvm.functions.a<? extends T> aVar) {
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.a
        public final T invoke() {
            return this.a.invoke();
        }
    }

    @Override // java.lang.ClassValue
    public k1<T> computeValue(Class<?> cls) {
        cls.getClass();
        return new k1<>();
    }

    public final T getOrSet(Class<?> cls, kotlin.jvm.functions.a<? extends T> aVar) {
        cls.getClass();
        aVar.getClass();
        T t = get(cls);
        t.getClass();
        k1 k1Var = (k1) t;
        T t2 = k1Var.a.get();
        return t2 != null ? t2 : (T) k1Var.getOrSetWithLock(new a(aVar));
    }

    public final boolean isStored(Class<?> cls) {
        cls.getClass();
        return ((k1) get(cls)).a.get() != null;
    }

    @Override // java.lang.ClassValue
    public /* bridge */ /* synthetic */ Object computeValue(Class cls) {
        return computeValue((Class<?>) cls);
    }
}
