package androidx.work.impl;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends androidx.room.migration.b {
    public static final g c = new g();

    private g() {
        super(12, 13);
    }

    @Override // androidx.room.migration.b
    public void migrate(androidx.sqlite.db.c cVar) {
        cVar.getClass();
        cVar.execSQL("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        cVar.execSQL("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
