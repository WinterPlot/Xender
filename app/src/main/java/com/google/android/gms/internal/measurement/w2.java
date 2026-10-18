package com.google.android.gms.internal.measurement;

import java.util.AbstractList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class w2<T> extends AbstractList<T> {
    private final u2 a;
    private final v2<T> b;

    public w2(u2 u2Var, v2<T> v2Var) {
        this.a = u2Var;
        this.b = v2Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return (T) this.b.zza(this.a.zzf(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.a.size();
    }
}
