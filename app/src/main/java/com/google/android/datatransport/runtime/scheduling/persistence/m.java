package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements t.b {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i) {
        this.a = i;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.t.b
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return t.lambda$getTransportContextId$2((Cursor) obj);
            case 1:
                return t.lambda$recordLogEventDropped$17((Cursor) obj);
            case 2:
                return t.lambda$loadActiveContexts$9((Cursor) obj);
            case 3:
                return t.lambda$readPayload$15((Cursor) obj);
            case 4:
                return t.lambda$loadActiveContexts$10((SQLiteDatabase) obj);
            case 5:
                return t.lambda$getNextCallTime$5((Cursor) obj);
            case 6:
                return t.lambda$ensureBeginTransaction$25((Throwable) obj);
            case 7:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 8:
                return t.lambda$clearDb$13((SQLiteDatabase) obj);
            default:
                return t.lambda$getDb$0((Throwable) obj);
        }
    }
}
