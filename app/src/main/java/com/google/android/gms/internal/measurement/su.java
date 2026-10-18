package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class su extends gv {
    public su(String str, Class cls, boolean z) {
        super("group_by", cls, true);
    }

    @Override // com.google.android.gms.internal.measurement.gv
    public final void zza(Iterator it, fv fvVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                fvVar.zza(zzd(), next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String strZzd = zzd();
            sb.append(']');
            fvVar.zza(strZzd, sb.toString());
        }
    }
}
