package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements t.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ s(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.t.b
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return t.lambda$getTimeWindow$22(this.b, (SQLiteDatabase) obj);
            default:
                return t.lambda$getTimeWindow$21(this.b, (Cursor) obj);
        }
    }
}
