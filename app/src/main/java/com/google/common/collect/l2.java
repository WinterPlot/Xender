package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
abstract class l2<F, T> implements Iterator<T> {
    final Iterator<? extends F> a;

    public l2(Iterator<? extends F> it) {
        this.a = (Iterator) com.google.common.base.m.checkNotNull(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return transform(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }

    public abstract T transform(F f);
}
