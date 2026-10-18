package com.google.android.gms.measurement.internal;

import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class c0 implements Iterator {
    final Iterator a;
    final /* synthetic */ zzbf b;

    public c0(zzbf zzbfVar) {
        Objects.requireNonNull(zzbfVar);
        this.b = zzbfVar;
        this.a = zzbfVar.zzg().keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.a.next();
    }
}
