package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class m1 {
    private static final Unsafe a = getUnsafe();
    private static final Class<?> b = androidx.datastore.preferences.protobuf.d.getMemoryClass();
    private static final boolean c = determineAndroidSupportByAddressSize(Long.TYPE);
    private static final boolean d = determineAndroidSupportByAddressSize(Integer.TYPE);
    private static final e e = getMemoryAccessor();
    private static final boolean f = supportsUnsafeByteBufferOperations();
    private static final boolean g = supportsUnsafeArrayOperations();
    static final long h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final int v;
    static final boolean w;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class e {
        Unsafe a;

        public e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int arrayBaseOffset(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int arrayIndexScale(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract void copyMemory(long j, byte[] bArr, long j2, long j3);

        public abstract void copyMemory(byte[] bArr, long j, long j2, long j3);

        public abstract boolean getBoolean(Object obj, long j);

        public abstract byte getByte(long j);

        public abstract byte getByte(Object obj, long j);

        public abstract double getDouble(Object obj, long j);

        public abstract float getFloat(Object obj, long j);

        public abstract int getInt(long j);

        public final int getInt(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public abstract long getLong(long j);

        public final long getLong(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public final Object getObject(Object obj, long j) {
            return this.a.getObject(obj, j);
        }

        public abstract Object getStaticObject(Field field);

        public final long objectFieldOffset(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void putBoolean(Object obj, long j, boolean z);

        public abstract void putByte(long j, byte b);

        public abstract void putByte(Object obj, long j, byte b);

        public abstract void putDouble(Object obj, long j, double d);

        public abstract void putFloat(Object obj, long j, float f);

        public abstract void putInt(long j, int i);

        public final void putInt(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public abstract void putLong(long j, long j2);

        public final void putLong(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void putObject(Object obj, long j, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                m1.logMissingMethod(th);
                return false;
            }
        }

        public boolean supportsUnsafeByteBufferOperations() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return m1.bufferAddressField() != null;
            } catch (Throwable th) {
                m1.logMissingMethod(th);
                return false;
            }
        }
    }

    static {
        long jArrayBaseOffset = arrayBaseOffset(byte[].class);
        h = jArrayBaseOffset;
        i = arrayBaseOffset(boolean[].class);
        j = arrayIndexScale(boolean[].class);
        k = arrayBaseOffset(int[].class);
        l = arrayIndexScale(int[].class);
        m = arrayBaseOffset(long[].class);
        n = arrayIndexScale(long[].class);
        o = arrayBaseOffset(float[].class);
        p = arrayIndexScale(float[].class);
        q = arrayBaseOffset(double[].class);
        r = arrayIndexScale(double[].class);
        s = arrayBaseOffset(Object[].class);
        t = arrayIndexScale(Object[].class);
        u = fieldOffset(bufferAddressField());
        v = (int) (jArrayBaseOffset & 7);
        w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private m1() {
    }

    public static long addressOffset(ByteBuffer byteBuffer) {
        return e.getLong(byteBuffer, u);
    }

    public static <T> T allocateInstance(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            org.jsoup.helper.n.a(e2);
            return null;
        }
    }

    private static int arrayBaseOffset(Class<?> cls) {
        if (g) {
            return e.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int arrayIndexScale(Class<?> cls) {
        if (g) {
            return e.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field bufferAddressField() {
        Field field;
        if (androidx.datastore.preferences.protobuf.d.isOnAndroidDevice() && (field = field(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        Field field2 = field(Buffer.class, "address");
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void copyMemory(byte[] bArr, long j2, long j3, long j4) {
        e.copyMemory(bArr, j2, j3, j4);
    }

    public static boolean determineAndroidSupportByAddressSize(Class<?> cls) {
        if (!androidx.datastore.preferences.protobuf.d.isOnAndroidDevice()) {
            return false;
        }
        try {
            Class<?> cls2 = b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field field(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long fieldOffset(Field field) {
        e eVar;
        if (field == null || (eVar = e) == null) {
            return -1L;
        }
        return eVar.objectFieldOffset(field);
    }

    private static int firstDifferingByteIndexNativeEndian(long j2, long j3) {
        return (w ? Long.numberOfLeadingZeros(j2 ^ j3) : Long.numberOfTrailingZeros(j2 ^ j3)) >> 3;
    }

    public static boolean getBoolean(boolean[] zArr, long j2) {
        return e.getBoolean(zArr, (j2 * j) + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(Object obj, long j2) {
        return getByteBigEndian(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(Object obj, long j2) {
        return getByteLittleEndian(obj, j2) != 0;
    }

    public static byte getByte(byte[] bArr, long j2) {
        return e.getByte(bArr, h + j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(Object obj, long j2) {
        return (byte) ((getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object obj, long j2) {
        return (byte) ((getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static double getDouble(double[] dArr, long j2) {
        return e.getDouble(dArr, (j2 * r) + q);
    }

    public static float getFloat(float[] fArr, long j2) {
        return e.getFloat(fArr, (j2 * p) + o);
    }

    public static int getInt(int[] iArr, long j2) {
        return e.getInt(iArr, (j2 * l) + k);
    }

    public static long getLong(long[] jArr, long j2) {
        return e.getLong(jArr, (j2 * n) + m);
    }

    private static e getMemoryAccessor() {
        Unsafe unsafe = a;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.d.isOnAndroidDevice()) {
            return new d(unsafe);
        }
        if (c) {
            return new c(unsafe);
        }
        if (d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object getObject(Object[] objArr, long j2) {
        return e.getObject(objArr, (j2 * t) + s);
    }

    public static Object getStaticObject(Field field) {
        return e.getStaticObject(field);
    }

    public static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean hasUnsafeArrayOperations() {
        return g;
    }

    public static boolean hasUnsafeByteBufferOperations() {
        return f;
    }

    public static boolean isAndroid64() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMissingMethod(Throwable th) {
        Logger.getLogger(m1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static int mismatch(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        if (i2 < 0 || i3 < 0 || i4 < 0 || i2 + i4 > bArr.length || i3 + i4 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i5 = 0;
        if (g) {
            for (int i6 = (v + i2) & 7; i5 < i4 && (i6 & 7) != 0; i6++) {
                if (bArr[i2 + i5] != bArr2[i3 + i5]) {
                    return i5;
                }
                i5++;
            }
            int i7 = ((i4 - i5) & (-8)) + i5;
            while (i5 < i7) {
                long j2 = h;
                long j3 = i5;
                long j4 = getLong((Object) bArr, ((long) i2) + j2 + j3);
                long j5 = getLong((Object) bArr2, j2 + ((long) i3) + j3);
                if (j4 != j5) {
                    return i5 + firstDifferingByteIndexNativeEndian(j4, j5);
                }
                i5 += 8;
            }
        }
        while (i5 < i4) {
            if (bArr[i2 + i5] != bArr2[i3 + i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static long objectFieldOffset(Field field) {
        return e.objectFieldOffset(field);
    }

    public static void putBoolean(boolean[] zArr, long j2, boolean z) {
        e.putBoolean(zArr, (j2 * j) + i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(Object obj, long j2, boolean z) {
        putByteBigEndian(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(Object obj, long j2, boolean z) {
        putByteLittleEndian(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static void putByte(byte[] bArr, long j2, byte b2) {
        e.putByte(bArr, h + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = getInt(obj, j3);
        int i3 = ((~((int) j2)) & 3) << 3;
        putInt(obj, j3, ((255 & b2) << i3) | (i2 & (~(255 << i3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        putInt(obj, j3, ((255 & b2) << i2) | (getInt(obj, j3) & (~(255 << i2))));
    }

    public static void putDouble(double[] dArr, long j2, double d2) {
        e.putDouble(dArr, (j2 * r) + q, d2);
    }

    public static void putFloat(float[] fArr, long j2, float f2) {
        e.putFloat(fArr, (j2 * p) + o, f2);
    }

    public static void putInt(int[] iArr, long j2, int i2) {
        e.putInt(iArr, (j2 * l) + k, i2);
    }

    public static void putLong(long[] jArr, long j2, long j3) {
        e.putLong(jArr, (j2 * n) + m, j3);
    }

    public static void putObject(Object[] objArr, long j2, Object obj) {
        e.putObject(objArr, (j2 * t) + s, obj);
    }

    private static boolean supportsUnsafeArrayOperations() {
        e eVar = e;
        if (eVar == null) {
            return false;
        }
        return eVar.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        e eVar = e;
        if (eVar == null) {
            return false;
        }
        return eVar.supportsUnsafeByteBufferOperations();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        private static int smallAddress(long j) {
            return (int) j;
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void copyMemory(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public boolean getBoolean(Object obj, long j) {
            return m1.w ? m1.getBooleanBigEndian(obj, j) : m1.getBooleanLittleEndian(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public byte getByte(Object obj, long j) {
            return m1.w ? m1.getByteBigEndian(obj, j) : m1.getByteLittleEndian(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public double getDouble(Object obj, long j) {
            return Double.longBitsToDouble(getLong(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public float getFloat(Object obj, long j) {
            return Float.intBitsToFloat(getInt(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public int getInt(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public long getLong(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putBoolean(Object obj, long j, boolean z) {
            if (m1.w) {
                m1.putBooleanBigEndian(obj, j, z);
            } else {
                m1.putBooleanLittleEndian(obj, j, z);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putByte(Object obj, long j, byte b) {
            if (m1.w) {
                m1.putByteBigEndian(obj, j, b);
            } else {
                m1.putByteLittleEndian(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putDouble(Object obj, long j, double d) {
            putLong(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putFloat(Object obj, long j, float f) {
            putInt(obj, j, Float.floatToIntBits(f));
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putInt(long j, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putLong(long j, long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void copyMemory(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putByte(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public byte getByte(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void copyMemory(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public boolean getBoolean(Object obj, long j) {
            return m1.w ? m1.getBooleanBigEndian(obj, j) : m1.getBooleanLittleEndian(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public byte getByte(Object obj, long j) {
            return m1.w ? m1.getByteBigEndian(obj, j) : m1.getByteLittleEndian(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public double getDouble(Object obj, long j) {
            return Double.longBitsToDouble(getLong(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public float getFloat(Object obj, long j) {
            return Float.intBitsToFloat(getInt(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public int getInt(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public long getLong(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putBoolean(Object obj, long j, boolean z) {
            if (m1.w) {
                m1.putBooleanBigEndian(obj, j, z);
            } else {
                m1.putBooleanLittleEndian(obj, j, z);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putByte(Object obj, long j, byte b) {
            if (m1.w) {
                m1.putByteBigEndian(obj, j, b);
            } else {
                m1.putByteLittleEndian(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putDouble(Object obj, long j, double d) {
            putLong(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putFloat(Object obj, long j, float f) {
            putInt(obj, j, Float.floatToIntBits(f));
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putInt(long j, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putLong(long j, long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void copyMemory(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putByte(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public byte getByte(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void copyMemory(long j, byte[] bArr, long j2, long j3) {
            this.a.copyMemory((Object) null, j, bArr, m1.h + j2, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public boolean getBoolean(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public byte getByte(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public double getDouble(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public float getFloat(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public int getInt(long j) {
            return this.a.getInt(j);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public long getLong(long j) {
            return this.a.getLong(j);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public Object getStaticObject(Field field) {
            return getObject(this.a.staticFieldBase(field), this.a.staticFieldOffset(field));
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putBoolean(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putByte(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putDouble(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putFloat(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putInt(long j, int i) {
            this.a.putInt(j, i);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putLong(long j, long j2) {
            this.a.putLong(j, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public boolean supportsUnsafeArrayOperations() {
            if (!super.supportsUnsafeArrayOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                m1.logMissingMethod(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public boolean supportsUnsafeByteBufferOperations() {
            if (!super.supportsUnsafeByteBufferOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                m1.logMissingMethod(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void putByte(long j, byte b) {
            this.a.putByte(j, b);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public byte getByte(long j) {
            return this.a.getByte(j);
        }

        @Override // androidx.datastore.preferences.protobuf.m1.e
        public void copyMemory(byte[] bArr, long j, long j2, long j3) {
            this.a.copyMemory(bArr, m1.h + j, (Object) null, j2, j3);
        }
    }

    public static void putByte(Object obj, long j2, byte b2) {
        e.putByte(obj, j2, b2);
    }

    public static void copyMemory(long j2, byte[] bArr, long j3, long j4) {
        e.copyMemory(j2, bArr, j3, j4);
    }

    public static byte getByte(Object obj, long j2) {
        return e.getByte(obj, j2);
    }

    public static void putByte(long j2, byte b2) {
        e.putByte(j2, b2);
    }

    public static void copyMemory(byte[] bArr, long j2, byte[] bArr2, long j3, long j4) {
        System.arraycopy(bArr, (int) j2, bArr2, (int) j3, (int) j4);
    }

    public static byte getByte(long j2) {
        return e.getByte(j2);
    }

    public static void putBoolean(Object obj, long j2, boolean z) {
        e.putBoolean(obj, j2, z);
    }

    public static void putFloat(Object obj, long j2, float f2) {
        e.putFloat(obj, j2, f2);
    }

    public static void putInt(Object obj, long j2, int i2) {
        e.putInt(obj, j2, i2);
    }

    public static void putObject(Object obj, long j2, Object obj2) {
        e.putObject(obj, j2, obj2);
    }

    public static boolean getBoolean(Object obj, long j2) {
        return e.getBoolean(obj, j2);
    }

    public static double getDouble(Object obj, long j2) {
        return e.getDouble(obj, j2);
    }

    public static float getFloat(Object obj, long j2) {
        return e.getFloat(obj, j2);
    }

    public static int getInt(Object obj, long j2) {
        return e.getInt(obj, j2);
    }

    public static long getLong(Object obj, long j2) {
        return e.getLong(obj, j2);
    }

    public static Object getObject(Object obj, long j2) {
        return e.getObject(obj, j2);
    }

    public static void putInt(long j2, int i2) {
        e.putInt(j2, i2);
    }

    public static int getInt(long j2) {
        return e.getInt(j2);
    }

    public static long getLong(long j2) {
        return e.getLong(j2);
    }

    public static void putDouble(Object obj, long j2, double d2) {
        e.putDouble(obj, j2, d2);
    }

    public static void putLong(Object obj, long j2, long j3) {
        e.putLong(obj, j2, j3);
    }

    public static void putLong(long j2, long j3) {
        e.putLong(j2, j3);
    }
}
