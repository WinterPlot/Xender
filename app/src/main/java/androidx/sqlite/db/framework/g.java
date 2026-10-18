package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends f implements androidx.sqlite.db.g {
    private final SQLiteStatement b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        sQLiteStatement.getClass();
        this.b = sQLiteStatement;
    }

    @Override // androidx.sqlite.db.g
    public void execute() {
        this.b.execute();
    }

    @Override // androidx.sqlite.db.g
    public long executeInsert() {
        return this.b.executeInsert();
    }

    @Override // androidx.sqlite.db.g
    public int executeUpdateDelete() {
        return this.b.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.g
    public long simpleQueryForLong() {
        return this.b.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.g
    public String simpleQueryForString() {
        return this.b.simpleQueryForString();
    }
}
