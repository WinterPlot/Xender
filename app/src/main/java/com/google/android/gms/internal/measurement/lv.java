package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class lv {
    public static final lv a = new hv();
    public static final lv b = new hv();

    public static lv zzc(lv lvVar, lv lvVar2) {
        lv lvVar3;
        lv lvVar4;
        if (lvVar == null) {
            return lvVar2;
        }
        if (lvVar2 == null || lvVar == (lvVar3 = a) || lvVar2 == (lvVar4 = b)) {
            return lvVar;
        }
        return (lvVar2 == lvVar3 || lvVar == lvVar4) ? lvVar2 : new iv(lvVar, lvVar2);
    }

    public abstract void zzb();
}
