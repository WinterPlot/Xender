package com.google.android.gms.internal.measurement;

import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class pw implements Iterator {
    private final gv a;
    private int b;
    private int c;
    final /* synthetic */ qw d;

    public /* synthetic */ pw(qw qwVar, gv gvVar, int i, byte[] bArr) {
        Objects.requireNonNull(qwVar);
        this.d = qwVar;
        this.a = gvVar;
        int i2 = i & 31;
        this.b = i2;
        this.c = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objZze = this.a.zze(this.d.zze(this.b));
        int i = this.c;
        if (i == 0) {
            this.b = -1;
            return objZze;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
        this.c >>>= iNumberOfTrailingZeros;
        this.b += iNumberOfTrailingZeros;
        return objZze;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
