package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public interface v7 {
    public static final v7 a0 = new a8();
    public static final v7 b0 = new t7();
    public static final v7 c0 = new m4("continue");
    public static final v7 d0 = new m4("break");
    public static final v7 e0 = new m4("return");
    public static final v7 f0 = new n3(Boolean.TRUE);
    public static final v7 g0 = new n3(Boolean.FALSE);
    public static final v7 h0 = new z7("");

    String zzc();

    v7 zzcG(String str, fd fdVar, List list);

    Double zzd();

    Boolean zze();

    Iterator zzf();

    v7 zzt();
}
