package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.activity.c0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.j;
import kotlin.jvm.functions.r;
import kotlin.jvm.internal.y;
import kotlin.k;
import okhttp3.b0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements androidx.sqlite.db.c {
    private static final b b = new b(null);
    private static final String[] c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] d = new String[0];
    private static final j<Method> e;
    private static final j<Method> f;
    private final SQLiteDatabase a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public final void execPerConnectionSQL(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
            sQLiteDatabase.getClass();
            str.getClass();
            sQLiteDatabase.execPerConnectionSQL(str, objArr);
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = k.lazy(lazyThreadSafetyMode, (kotlin.jvm.functions.a) new c0(21));
        f = k.lazy(lazyThreadSafetyMode, (kotlin.jvm.functions.a) new c0(22));
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.a = sQLiteDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method beginTransactionMethod_delegate$lambda$8() {
        Class<?> returnType;
        try {
            Method getThreadSessionMethod = b.getGetThreadSessionMethod();
            if (getThreadSessionMethod == null || (returnType = getThreadSessionMethod.getReturnType()) == null) {
                return null;
            }
            Class<?> cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method getThreadSessionMethod_delegate$lambda$7() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void internalBeginTransactionWithListenerReadOnly(SQLiteTransactionListener sQLiteTransactionListener) throws IllegalAccessException, InvocationTargetException {
        b bVar = b;
        if (bVar.getBeginTransactionMethod() == null || bVar.getGetThreadSessionMethod() == null) {
            if (sQLiteTransactionListener != null) {
                beginTransactionWithListener(sQLiteTransactionListener);
                return;
            } else {
                beginTransaction();
                return;
            }
        }
        Method beginTransactionMethod = bVar.getBeginTransactionMethod();
        beginTransactionMethod.getClass();
        Method getThreadSessionMethod = bVar.getGetThreadSessionMethod();
        getThreadSessionMethod.getClass();
        Object objInvoke = getThreadSessionMethod.invoke(this.a, null);
        if (objInvoke != null) {
            beginTransactionMethod.invoke(objInvoke, 0, sQLiteTransactionListener, 0, null);
        } else {
            j0.g("Required value was null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteCursor query$lambda$0(androidx.sqlite.db.f fVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        sQLiteQuery.getClass();
        fVar.bindTo(new f(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$1(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) rVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$2(androidx.sqlite.db.f fVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        sQLiteQuery.getClass();
        fVar.bindTo(new f(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.db.c
    public void beginTransaction() {
        this.a.beginTransaction();
    }

    @Override // androidx.sqlite.db.c
    public void beginTransactionNonExclusive() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.c
    public void beginTransactionReadOnly() throws IllegalAccessException, InvocationTargetException {
        internalBeginTransactionWithListenerReadOnly(null);
    }

    @Override // androidx.sqlite.db.c
    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        sQLiteTransactionListener.getClass();
        this.a.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // androidx.sqlite.db.c
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        sQLiteTransactionListener.getClass();
        this.a.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // androidx.sqlite.db.c
    public void beginTransactionWithListenerReadOnly(SQLiteTransactionListener sQLiteTransactionListener) throws IllegalAccessException, InvocationTargetException {
        sQLiteTransactionListener.getClass();
        internalBeginTransactionWithListenerReadOnly(sQLiteTransactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // androidx.sqlite.db.c
    public androidx.sqlite.db.g compileStatement(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.a.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new g(sQLiteStatementCompileStatement);
    }

    @Override // androidx.sqlite.db.c
    public int delete(String str, String str2, Object[] objArr) {
        str.getClass();
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(str);
        if (str2 != null && str2.length() != 0) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        androidx.sqlite.db.g gVarCompileStatement = compileStatement(sb.toString());
        androidx.sqlite.db.a.c.bind(gVarCompileStatement, objArr);
        return gVarCompileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.c
    public void disableWriteAheadLogging() {
        this.a.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.c
    public boolean enableWriteAheadLogging() {
        return this.a.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.c
    public void endTransaction() {
        this.a.endTransaction();
    }

    @Override // androidx.sqlite.db.c
    public void execPerConnectionSQL(String str, Object[] objArr) {
        str.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            a.a.execPerConnectionSQL(this.a, str, objArr);
        } else {
            b0.p(defpackage.a.j(i, "execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: "));
        }
    }

    @Override // androidx.sqlite.db.c
    public void execSQL(String str, Object[] objArr) throws SQLException {
        str.getClass();
        objArr.getClass();
        this.a.execSQL(str, objArr);
    }

    @Override // androidx.sqlite.db.c
    public List<Pair<String, String>> getAttachedDbs() {
        return this.a.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.c
    public long getMaximumSize() {
        return this.a.getMaximumSize();
    }

    @Override // androidx.sqlite.db.c
    public long getPageSize() {
        return this.a.getPageSize();
    }

    @Override // androidx.sqlite.db.c
    public String getPath() {
        return this.a.getPath();
    }

    @Override // androidx.sqlite.db.c
    public int getVersion() {
        return this.a.getVersion();
    }

    @Override // androidx.sqlite.db.c
    public boolean inTransaction() {
        return this.a.inTransaction();
    }

    @Override // androidx.sqlite.db.c
    public long insert(String str, int i, ContentValues contentValues) throws SQLException {
        str.getClass();
        contentValues.getClass();
        return this.a.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // androidx.sqlite.db.c
    public boolean isDatabaseIntegrityOk() {
        return this.a.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.c
    public boolean isDbLockedByCurrentThread() {
        return this.a.isDbLockedByCurrentThread();
    }

    public final boolean isDelegate$sqlite_framework(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return y.areEqual(this.a, sQLiteDatabase);
    }

    @Override // androidx.sqlite.db.c
    public boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // androidx.sqlite.db.c
    public boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // androidx.sqlite.db.c
    public boolean isReadOnly() {
        return this.a.isReadOnly();
    }

    @Override // androidx.sqlite.db.c
    public boolean isWriteAheadLoggingEnabled() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.c
    public boolean needUpgrade(int i) {
        return this.a.needUpgrade(i);
    }

    @Override // androidx.sqlite.db.c
    public Cursor query(final androidx.sqlite.db.f fVar) {
        fVar.getClass();
        Cursor cursorRawQueryWithFactory = this.a.rawQueryWithFactory(new androidx.sqlite.db.framework.a(new r() { // from class: androidx.sqlite.db.framework.b
            @Override // kotlin.jvm.functions.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return c.query$lambda$0(fVar, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
            }
        }, 1), fVar.getSql(), d, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.c
    public void setForeignKeyConstraintsEnabled(boolean z) {
        this.a.setForeignKeyConstraintsEnabled(z);
    }

    @Override // androidx.sqlite.db.c
    public void setLocale(Locale locale) {
        locale.getClass();
        this.a.setLocale(locale);
    }

    @Override // androidx.sqlite.db.c
    public void setMaxSqlCacheSize(int i) {
        this.a.setMaxSqlCacheSize(i);
    }

    @Override // androidx.sqlite.db.c
    public long setMaximumSize(long j) {
        this.a.setMaximumSize(j);
        return this.a.getMaximumSize();
    }

    @Override // androidx.sqlite.db.c
    public void setPageSize(long j) {
        this.a.setPageSize(j);
    }

    @Override // androidx.sqlite.db.c
    public void setTransactionSuccessful() {
        this.a.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.c
    public void setVersion(int i) {
        this.a.setVersion(i);
    }

    @Override // androidx.sqlite.db.c
    public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        str.getClass();
        contentValues.getClass();
        int i2 = 0;
        if (contentValues.size() == 0) {
            b0.i("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(c[i]);
        sb.append(str);
        sb.append(" SET ");
        for (String str3 : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i2] = contentValues.get(str3);
            sb.append("=?");
            i2++;
        }
        if (objArr != null) {
            for (int i3 = size; i3 < length; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        androidx.sqlite.db.g gVarCompileStatement = compileStatement(sb.toString());
        androidx.sqlite.db.a.c.bind(gVarCompileStatement, objArr2);
        return gVarCompileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.c
    public boolean yieldIfContendedSafely() {
        return this.a.yieldIfContendedSafely();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.r rVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getBeginTransactionMethod() {
            return (Method) c.f.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetThreadSessionMethod() {
            return (Method) c.e.getValue();
        }

        private b() {
        }
    }

    @Override // androidx.sqlite.db.c
    public boolean yieldIfContendedSafely(long j) {
        return this.a.yieldIfContendedSafely(j);
    }

    @Override // androidx.sqlite.db.c
    public void execSQL(String str) throws SQLException {
        str.getClass();
        this.a.execSQL(str);
    }

    /* JADX INFO: renamed from: setMaximumSize, reason: collision with other method in class */
    public void m1055setMaximumSize(long j) {
        this.a.setMaximumSize(j);
    }

    @Override // androidx.sqlite.db.c
    public Cursor query(String str, Object[] objArr) {
        str.getClass();
        objArr.getClass();
        return query(new androidx.sqlite.db.a(str, objArr));
    }

    @Override // androidx.sqlite.db.c
    public Cursor query(String str) {
        str.getClass();
        return query(new androidx.sqlite.db.a(str));
    }

    @Override // androidx.sqlite.db.c
    public Cursor query(androidx.sqlite.db.f fVar, CancellationSignal cancellationSignal) {
        fVar.getClass();
        SQLiteDatabase sQLiteDatabase = this.a;
        androidx.sqlite.db.framework.a aVar = new androidx.sqlite.db.framework.a(fVar, 0);
        String sql = fVar.getSql();
        String[] strArr = d;
        cancellationSignal.getClass();
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, sql, strArr, null, cancellationSignal);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }
}
