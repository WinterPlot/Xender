package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.util.k;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class b<T> implements s<T> {
    protected final T a;

    public b(T t) {
        this.a = (T) k.checkNotNull(t);
    }

    @Override // com.bumptech.glide.load.engine.s
    public final T get() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.s
    public Class<T> getResourceClass() {
        return (Class<T>) this.a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.s
    public final int getSize() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
    }
}
