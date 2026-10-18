package com.google.android.gms.internal.measurement;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class h4 implements Iterator {
    private int a;
    private boolean b;
    private Iterator c;
    final /* synthetic */ j4 d;

    public /* synthetic */ h4(j4 j4Var, byte[] bArr) {
        Objects.requireNonNull(j4Var);
        this.d = j4Var;
        this.a = -1;
    }

    private final Iterator zza() {
        Iterator it = this.c;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.d.zzk().entrySet().iterator();
        this.c = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a + 1;
        j4 j4Var = this.d;
        if (i >= j4Var.zzj()) {
            return !j4Var.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        j4 j4Var = this.d;
        return i < j4Var.zzj() ? (g4) j4Var.zzi()[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            okio.j0.g("remove() was called before next()");
            return;
        }
        this.b = false;
        j4 j4Var = this.d;
        j4Var.zzh();
        int i = this.a;
        if (i >= j4Var.zzj()) {
            zza().remove();
        } else {
            this.a = i - 1;
            j4Var.zzg(i);
        }
    }
}
