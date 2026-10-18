package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements androidx.sqlite.db.e {
    private final SQLiteProgram a;

    public f(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.a = sQLiteProgram;
    }

    @Override // androidx.sqlite.db.e
    public void bindBlob(int i, byte[] bArr) {
        bArr.getClass();
        this.a.bindBlob(i, bArr);
    }

    @Override // androidx.sqlite.db.e
    public void bindDouble(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // androidx.sqlite.db.e
    public void bindLong(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // androidx.sqlite.db.e
    public void bindNull(int i) {
        this.a.bindNull(i);
    }

    @Override // androidx.sqlite.db.e
    public void bindString(int i, String str) {
        str.getClass();
        this.a.bindString(i, str);
    }

    @Override // androidx.sqlite.db.e
    public void clearBindings() {
        this.a.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }
}
