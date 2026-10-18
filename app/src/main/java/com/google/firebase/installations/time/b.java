package com.google.firebase.installations.time;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements a {
    private static b a;

    private b() {
    }

    public static b getInstance() {
        b bVar = a;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        a = bVar2;
        return bVar2;
    }

    @Override // com.google.firebase.installations.time.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
