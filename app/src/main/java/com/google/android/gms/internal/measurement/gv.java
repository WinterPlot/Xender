package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class gv {
    private final String a;
    private final Class b;
    private final boolean c;
    private final boolean d;
    private final long e;

    private gv(String str, Class cls, boolean z, boolean z2) {
        r0.zzd(str);
        this.a = str;
        this.b = cls;
        this.c = z;
        this.d = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i = 0; i < 5; i++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.e = j;
    }

    public static gv zzc(String str, Class cls) {
        return new gv(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.b;
        String name = getClass().getName();
        String name2 = cls.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        androidx.camera.camera2.pipe.w.H(sb, name, "/", str, "[");
        return androidx.camera.camera2.pipe.w.t(sb, name2, "]");
    }

    public void zza(Iterator it, fv fvVar) {
        while (it.hasNext()) {
            zzb(it.next(), fvVar);
        }
    }

    public void zzb(Object obj, fv fvVar) {
        fvVar.zza(this.a, obj);
    }

    public final String zzd() {
        return this.a;
    }

    public final Object zze(Object obj) {
        return this.b.cast(obj);
    }

    public final boolean zzf() {
        return this.c;
    }

    public final void zzg(Object obj, fv fvVar) {
        if (!this.d || f.zza() <= 20) {
            zzb(obj, fvVar);
        } else {
            fvVar.zza(this.a, obj);
        }
    }

    public final void zzh(Iterator it, fv fvVar) {
        r0.zzc(this.c, "non repeating key");
        if (!this.d || f.zza() <= 20) {
            zza(it, fvVar);
        } else {
            while (it.hasNext()) {
                fvVar.zza(this.a, it.next());
            }
        }
    }

    public final long zzi() {
        return this.e;
    }

    public gv(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }
}
