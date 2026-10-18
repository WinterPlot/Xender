package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class w extends SQLiteOpenHelper {
    private static final String c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    static int d = 7;
    private static final a e;
    private static final a f;
    private static final a g;
    private static final a h;
    private static final a i;
    private static final a j;
    private static final a k;
    private static final List<a> l;
    private final int a;
    private boolean b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void upgrade(SQLiteDatabase sQLiteDatabase);
    }

    static {
        final int i2 = 0;
        a aVar = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w.a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                switch (i2) {
                    case 0:
                        w.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        w.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        w.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        w.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        w.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        e = aVar;
        final int i3 = 1;
        a aVar2 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w.a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                switch (i3) {
                    case 0:
                        w.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        w.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        w.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        w.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        w.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        f = aVar2;
        final int i4 = 2;
        a aVar3 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w.a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                switch (i4) {
                    case 0:
                        w.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        w.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        w.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        w.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        w.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        g = aVar3;
        final int i5 = 3;
        a aVar4 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w.a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                switch (i5) {
                    case 0:
                        w.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        w.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        w.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        w.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        w.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        h = aVar4;
        final int i6 = 4;
        a aVar5 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w.a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                switch (i6) {
                    case 0:
                        w.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        w.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        w.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        w.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        w.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        i = aVar5;
        final int i7 = 5;
        a aVar6 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w.a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                switch (i7) {
                    case 0:
                        w.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        w.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        w.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        w.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        w.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        j = aVar6;
        final int i8 = 6;
        a aVar7 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w.a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                switch (i8) {
                    case 0:
                        w.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        w.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        w.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        w.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        w.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        k = aVar7;
        l = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public w(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.b = false;
        this.a = i2;
    }

    private void ensureConfigured(SQLiteDatabase sQLiteDatabase) {
        if (this.b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$3(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$4(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$6(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    private void onCreate(SQLiteDatabase sQLiteDatabase, int i2) {
        ensureConfigured(sQLiteDatabase);
        upgrade(sQLiteDatabase, 0, i2);
    }

    private void upgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List<a> list = l;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                l.get(i2).upgrade(sQLiteDatabase);
                i2++;
            }
        } else {
            StringBuilder sbW = androidx.camera.camera2.pipe.w.w(i2, "Migration from ", " to ", i3, " was requested, but cannot be performed. Only ");
            sbW.append(list.size());
            sbW.append(" migrations are provided");
            throw new IllegalArgumentException(sbW.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        onCreate(sQLiteDatabase, i3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        ensureConfigured(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        ensureConfigured(sQLiteDatabase);
        upgrade(sQLiteDatabase, i2, i3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        onCreate(sQLiteDatabase, this.a);
    }
}
