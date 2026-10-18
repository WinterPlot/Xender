package androidx.work.impl;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends androidx.room.migration.b {
    public static final l c = new l();

    private l() {
        super(4, 5);
    }

    @Override // androidx.room.migration.b
    public void migrate(androidx.sqlite.db.c cVar) {
        cVar.getClass();
        cVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        cVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
