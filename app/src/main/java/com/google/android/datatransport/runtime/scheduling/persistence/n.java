package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements t.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(t tVar, Object obj, int i) {
        this.a = i;
        this.b = tVar;
        this.c = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.t.b
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        t tVar = this.b;
        switch (i) {
            case 0:
                return tVar.lambda$hasPendingEventsFor$6((com.google.android.datatransport.runtime.p) obj2, (SQLiteDatabase) obj);
            case 1:
                return tVar.lambda$loadBatch$8((com.google.android.datatransport.runtime.p) obj2, (SQLiteDatabase) obj);
            default:
                return tVar.lambda$recordFailure$4((String) obj2, "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (SQLiteDatabase) obj);
        }
    }
}
