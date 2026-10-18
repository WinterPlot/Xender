package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements t.b {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(com.google.android.datatransport.runtime.p pVar, long j) {
        this.b = j;
        this.c = pVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.t.b
    public final Object apply(Object obj) {
        int i = this.a;
        long j = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return t.lambda$recordNextCallTime$7(j, (com.google.android.datatransport.runtime.p) obj2, (SQLiteDatabase) obj);
            default:
                return ((t) obj2).lambda$cleanUp$12(j, (SQLiteDatabase) obj);
        }
    }

    public /* synthetic */ o(t tVar, long j) {
        this.c = tVar;
        this.b = j;
    }
}
