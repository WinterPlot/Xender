package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class t0 implements Closeable {
    private static final ThreadLocal b = new s0();
    private int a = 0;

    public static int zza() {
        return zzd().a;
    }

    public static t0 zzc() {
        t0 t0VarZzd = zzd();
        int i = t0VarZzd.a + 1;
        t0VarZzd.a = i;
        if (i != 0) {
            return t0VarZzd;
        }
        okhttp3.b0.o("Overflow of RecursionDepth (possible error in core library)");
        return null;
    }

    private static t0 zzd() {
        return (t0) b.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i > 0) {
            this.a = i - 1;
        } else {
            okhttp3.b0.o("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }

    public final int zzb() {
        return this.a;
    }
}
