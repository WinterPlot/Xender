package androidx.room;

import java.util.List;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
final class c implements androidx.sqlite.d {
    public static final a b = new a(null);
    private final /* synthetic */ androidx.sqlite.d a;

    public c(androidx.sqlite.d dVar) {
        dVar.getClass();
        this.a = dVar;
    }

    @Override // androidx.sqlite.d
    public void bindBlob(int i, byte[] bArr) {
        bArr.getClass();
        this.a.bindBlob(i, bArr);
    }

    @Override // androidx.sqlite.d
    public void bindBoolean(int i, boolean z) {
        this.a.bindBoolean(i, z);
    }

    @Override // androidx.sqlite.d
    public void bindDouble(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // androidx.sqlite.d
    public void bindFloat(int i, float f) {
        this.a.bindFloat(i, f);
    }

    @Override // androidx.sqlite.d
    public void bindInt(int i, int i2) {
        this.a.bindInt(i, i2);
    }

    @Override // androidx.sqlite.d
    public void bindLong(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // androidx.sqlite.d
    public void bindNull(int i) {
        this.a.bindNull(i);
    }

    @Override // androidx.sqlite.d
    public void bindText(int i, String str) {
        str.getClass();
        this.a.bindText(i, str);
    }

    @Override // androidx.sqlite.d
    public void clearBindings() {
        this.a.clearBindings();
    }

    @Override // androidx.sqlite.d, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public byte[] getBlob(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public boolean getBoolean(int i) {
        return this.a.getBoolean(i);
    }

    @Override // androidx.sqlite.d
    public int getColumnCount() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public String getColumnName(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public List<String> getColumnNames() {
        return this.a.getColumnNames();
    }

    @Override // androidx.sqlite.d
    public int getColumnType(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public double getDouble(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public float getFloat(int i) {
        return this.a.getFloat(i);
    }

    @Override // androidx.sqlite.d
    public int getInt(int i) {
        return this.a.getInt(i);
    }

    @Override // androidx.sqlite.d
    public long getLong(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public String getText(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public boolean isNull(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public void reset() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.d
    public boolean step() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        private a() {
        }
    }
}
