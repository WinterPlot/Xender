package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class g0 {
    private static final Comparator b = new a0();
    private static final g0 c = new g0(new f0(Collections.EMPTY_LIST));
    public static final /* synthetic */ int d = 0;
    private final f0 a;

    private g0(f0 f0Var) {
        this.a = f0Var;
    }

    public static g0 zza() {
        return c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g0) && ((g0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final Map zzb() {
        return this.a;
    }

    public final boolean zzc() {
        return this.a.isEmpty();
    }

    public final g0 zzd(g0 g0Var) {
        f0 f0Var = g0Var.a;
        if (f0Var.isEmpty()) {
            return this;
        }
        f0 f0Var2 = this.a;
        return f0Var2.isEmpty() ? g0Var : new g0(new f0(f0Var2, f0Var));
    }
}
