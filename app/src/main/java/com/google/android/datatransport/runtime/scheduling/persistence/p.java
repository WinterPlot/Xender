package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements t.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ p(t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.t.b
    public final Object apply(Object obj) {
        int i = this.a;
        t tVar = this.b;
        switch (i) {
            case 0:
                return tVar.lambda$resetClientMetrics$23((SQLiteDatabase) obj);
            case 1:
                return tVar.lambda$cleanUp$11((Cursor) obj);
            default:
                return tVar.lambda$recordFailure$3((Cursor) obj);
        }
    }
}
