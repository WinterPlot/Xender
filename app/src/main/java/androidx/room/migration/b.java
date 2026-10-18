package androidx.room.migration;

import androidx.sqlite.db.c;
import kotlin.NotImplementedError;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public final int a;
    public final int b;

    public b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void migrate(androidx.sqlite.b bVar) {
        bVar.getClass();
        if (!(bVar instanceof androidx.sqlite.driver.a)) {
            throw new NotImplementedError("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        migrate(((androidx.sqlite.driver.a) bVar).getDb());
    }

    public void migrate(c cVar) {
        cVar.getClass();
        throw new NotImplementedError("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
