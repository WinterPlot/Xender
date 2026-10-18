package androidx.work.impl;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends androidx.room.migration.b {
    public static final f c = new f();

    private f() {
        super(11, 12);
    }

    @Override // androidx.room.migration.b
    public void migrate(androidx.sqlite.db.c cVar) {
        cVar.getClass();
        cVar.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
