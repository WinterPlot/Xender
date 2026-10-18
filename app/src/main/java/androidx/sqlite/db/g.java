package androidx.sqlite.db;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface g extends e {
    @Override // androidx.sqlite.db.e
    /* synthetic */ void bindBlob(int i, byte[] bArr);

    @Override // androidx.sqlite.db.e
    /* synthetic */ void bindDouble(int i, double d);

    @Override // androidx.sqlite.db.e
    /* synthetic */ void bindLong(int i, long j);

    @Override // androidx.sqlite.db.e
    /* synthetic */ void bindNull(int i);

    @Override // androidx.sqlite.db.e
    /* synthetic */ void bindString(int i, String str);

    @Override // androidx.sqlite.db.e
    /* synthetic */ void clearBindings();

    void execute();

    long executeInsert();

    int executeUpdateDelete();

    long simpleQueryForLong();

    String simpleQueryForString();
}
