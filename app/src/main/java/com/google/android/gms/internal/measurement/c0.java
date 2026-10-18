package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class c0 {
    private b a;
    private b b;
    private final List c;

    public c0() {
        this.a = new b("", 0L, null);
        this.b = new b("", 0L, null);
        this.c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        c0 c0Var = new c0(this.a.clone());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            c0Var.c.add(((b) it.next()).clone());
        }
        return c0Var;
    }

    public final b zza() {
        return this.a;
    }

    public final void zzb(b bVar) {
        this.a = bVar;
        this.b = bVar.clone();
        this.c.clear();
    }

    public final b zzc() {
        return this.b;
    }

    public final void zzd(b bVar) {
        this.b = bVar;
    }

    public final void zze(String str, long j, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, b.zzh(str2, this.a.zze(str2), map.get(str2)));
        }
        this.c.add(new b(str, j, map2));
    }

    public final List zzf() {
        return this.c;
    }

    public c0(b bVar) {
        this.a = bVar;
        this.b = bVar.clone();
        this.c = new ArrayList();
    }
}
