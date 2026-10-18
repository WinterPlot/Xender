package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements t.b, t.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.t.b
    public Object apply(Object obj) {
        return t.lambda$loadMetadata$16((HashMap) this.b, (Cursor) obj);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.t.d
    public Object produce() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                return t.lambda$ensureBeginTransaction$24((SQLiteDatabase) obj);
            default:
                return ((w) obj).getWritableDatabase();
        }
    }
}
