package com.google.android.gms.iid;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    private static i a;

    public static synchronized i zzy() {
        i cVar;
        cVar = a;
        if (cVar == null) {
            cVar = new c();
            a = cVar;
        }
        return cVar;
    }

    public abstract j<Boolean> zzd(String str, boolean z);
}
