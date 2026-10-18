package androidx.room.support;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements l {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Long.valueOf(AutoClosingRoomOpenHelper.a.simpleQueryForLong$lambda$3((androidx.sqlite.db.g) obj));
            case 1:
                return AutoClosingRoomOpenHelper.a.simpleQueryForString$lambda$4((androidx.sqlite.db.g) obj);
            case 2:
                return Integer.valueOf(AutoClosingRoomOpenHelper.a.executeUpdateDelete$lambda$1((androidx.sqlite.db.g) obj));
            case 3:
                return Long.valueOf(AutoClosingRoomOpenHelper.a.executeInsert$lambda$2((androidx.sqlite.db.g) obj));
            case 4:
                return AutoClosingRoomOpenHelper.a.execute$lambda$0((androidx.sqlite.db.g) obj);
            default:
                return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pokeOpen$lambda$0((androidx.sqlite.db.c) obj);
        }
    }
}
