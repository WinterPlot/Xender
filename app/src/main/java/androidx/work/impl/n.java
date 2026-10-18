package androidx.work.impl;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends androidx.room.migration.b {
    public static final n c = new n();

    private n() {
        super(7, 8);
    }

    @Override // androidx.room.migration.b
    public void migrate(androidx.sqlite.db.c cVar) {
        cVar.getClass();
        cVar.execSQL("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
