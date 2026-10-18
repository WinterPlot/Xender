package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class l {
    private final Class a;
    private final Object b;

    private l(Class cls, Object obj) {
        this.a = cls;
        this.b = obj;
    }

    public static l zzb(Class cls, Object obj) {
        return new l(cls, obj);
    }

    public final Class zzc() {
        return this.a;
    }

    public final Object zzd() {
        return this.b;
    }

    public /* synthetic */ l(Class cls, Object obj, byte[] bArr) {
        this(cls, obj);
    }
}
