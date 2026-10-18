package kotlin.sequences;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class c<T, K> implements m<T> {
    private final m<T> a;
    private final kotlin.jvm.functions.l<T, K> b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(m<? extends T> mVar, kotlin.jvm.functions.l<? super T, ? extends K> lVar) {
        mVar.getClass();
        lVar.getClass();
        this.a = mVar;
        this.b = lVar;
    }

    @Override // kotlin.sequences.m
    public Iterator<T> iterator() {
        return new b(this.a.iterator(), this.b);
    }
}
