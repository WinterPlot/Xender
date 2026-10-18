package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class l {
    private final EnumMap a;

    private l(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static l zzd(String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        if (str.length() >= zzjk.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                zzjk[] zzjkVarArrValues = zzjk.values();
                int length = zzjkVarArrValues.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put(zzjkVarArrValues[i], zzam.zza(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new l(enumMap);
            }
        }
        return new l();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (zzjk zzjkVar : zzjk.values()) {
            zzam zzamVar = (zzam) this.a.get(zzjkVar);
            if (zzamVar == null) {
                zzamVar = zzam.UNSET;
            }
            sb.append(zzamVar.zzb());
        }
        return sb.toString();
    }

    public final zzam zza(zzjk zzjkVar) {
        zzam zzamVar = (zzam) this.a.get(zzjkVar);
        return zzamVar == null ? zzam.UNSET : zzamVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void zzb(zzjk zzjkVar, int i) {
        zzam zzamVar = zzam.UNSET;
        if (i == -30) {
            zzamVar = zzam.TCF;
        } else if (i == -20) {
            zzamVar = zzam.API;
        } else if (i == -10) {
            zzamVar = zzam.MANIFEST;
        } else if (i == 0) {
            zzamVar = zzam.API;
        } else if (i == 30) {
            zzamVar = zzam.INITIALIZATION;
        }
        this.a.put(zzjkVar, zzamVar);
    }

    public final void zzc(zzjk zzjkVar, zzam zzamVar) {
        this.a.put(zzjkVar, zzamVar);
    }

    public l() {
        this.a = new EnumMap(zzjk.class);
    }
}
