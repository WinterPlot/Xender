package androidx.sqlite;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface d extends AutoCloseable {
    void bindBlob(int i, byte[] bArr);

    void bindBoolean(int i, boolean z);

    void bindDouble(int i, double d);

    void bindFloat(int i, float f);

    void bindInt(int i, int i2);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindText(int i, String str);

    void clearBindings();

    @Override // java.lang.AutoCloseable
    void close();

    byte[] getBlob(int i);

    boolean getBoolean(int i);

    int getColumnCount();

    String getColumnName(int i);

    List<String> getColumnNames();

    int getColumnType(int i);

    double getDouble(int i);

    float getFloat(int i);

    int getInt(int i);

    long getLong(int i);

    String getText(int i);

    boolean isNull(int i);

    void reset();

    boolean step();
}
