package androidx.sqlite.db;

import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements f {
    public static final C0273a c = new C0273a(null);
    private final String a;
    private final Object[] b;

    public a(String str, Object[] objArr) {
        str.getClass();
        this.a = str;
        this.b = objArr;
    }

    public static final void bind(e eVar, Object[] objArr) {
        c.bind(eVar, objArr);
    }

    @Override // androidx.sqlite.db.f
    public void bindTo(e eVar) {
        eVar.getClass();
        c.bind(eVar, this.b);
    }

    @Override // androidx.sqlite.db.f
    public int getArgCount() {
        Object[] objArr = this.b;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // androidx.sqlite.db.f
    public String getSql() {
        return this.a;
    }

    /* JADX INFO: renamed from: androidx.sqlite.db.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0273a {
        public /* synthetic */ C0273a(r rVar) {
            this();
        }

        private final void bind(e eVar, int i, Object obj) {
            if (obj == null) {
                eVar.bindNull(i);
                return;
            }
            if (obj instanceof byte[]) {
                eVar.bindBlob(i, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                eVar.bindDouble(i, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                eVar.bindDouble(i, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                eVar.bindLong(i, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                eVar.bindLong(i, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                eVar.bindLong(i, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                eVar.bindLong(i, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                eVar.bindString(i, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                eVar.bindLong(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        private C0273a() {
        }

        public final void bind(e eVar, Object[] objArr) {
            eVar.getClass();
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                bind(eVar, i, obj);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(str, null);
        str.getClass();
    }
}
