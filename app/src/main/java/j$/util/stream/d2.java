package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public interface d2 extends e2 {
    @Override // j$.util.stream.e2
    d2 a(int i);

    Object b();

    void f(int i, Object obj);

    void g(Object obj);

    Object newArray(int i);

    @Override // j$.util.stream.e2
    Spliterator.OfPrimitive spliterator();
}
