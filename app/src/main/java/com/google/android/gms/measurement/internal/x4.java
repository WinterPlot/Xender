package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class x4 {
    private static final Object g = new Object();
    private final String a;
    private final k0 b;
    private final Object c;
    private final Object d = new Object();
    private volatile Object e = null;
    private volatile Object f = null;

    public /* synthetic */ x4(String str, Object obj, Object obj2, k0 k0Var, byte[] bArr) {
        this.a = str;
        this.c = obj;
        this.b = k0Var;
    }

    public final String zza() {
        return this.a;
    }

    public final Object zzb(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (r4.a == null) {
            return this.c;
        }
        synchronized (g) {
            try {
                if (f.zza()) {
                    return this.f == null ? this.c : this.f;
                }
                try {
                    for (x4 x4Var : y4.a) {
                        if (f.zza()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            k0 k0Var = x4Var.b;
                            if (k0Var != null) {
                                objZza = k0Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (g) {
                            x4Var.f = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                k0 k0Var2 = this.b;
                if (k0Var2 != null) {
                    try {
                        return k0Var2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
