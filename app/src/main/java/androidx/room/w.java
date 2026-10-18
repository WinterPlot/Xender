package androidx.room;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w implements x {
    private final int a;
    private final String b;
    private final String c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public final boolean a;
        public final String b;

        public a(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public w(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public abstract void createAllTables(androidx.sqlite.b bVar);

    public abstract void dropAllTables(androidx.sqlite.b bVar);

    public final String getIdentityHash() {
        return this.b;
    }

    public final String getLegacyIdentityHash() {
        return this.c;
    }

    public final int getVersion() {
        return this.a;
    }

    public abstract void onCreate(androidx.sqlite.b bVar);

    public abstract void onOpen(androidx.sqlite.b bVar);

    public abstract void onPostMigrate(androidx.sqlite.b bVar);

    public abstract void onPreMigrate(androidx.sqlite.b bVar);

    public abstract a onValidateSchema(androidx.sqlite.b bVar);
}
