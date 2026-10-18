package kotlin;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class m extends l {
    private static final <T> T getValue(j<? extends T> jVar, Object obj, kotlin.reflect.l<?> lVar) {
        jVar.getClass();
        lVar.getClass();
        return jVar.getValue();
    }

    public static final <T> j<T> lazyOf(T t) {
        return new InitializedLazyImpl(t);
    }
}
