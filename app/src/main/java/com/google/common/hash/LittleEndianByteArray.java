package com.google.common.hash;

import com.google.common.primitives.Longs;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.PrivilegedExceptionAction;
import okhttp3.b0;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class LittleEndianByteArray {
    private static final b a = makeGetter();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum JavaLittleEndianBytes implements b {
        INSTANCE { // from class: com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.1
            @Override // com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes, com.google.common.hash.LittleEndianByteArray.b
            public long getLongLittleEndian(byte[] bArr, int i) {
                return Longs.fromBytes(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes, com.google.common.hash.LittleEndianByteArray.b
            public void putLongLittleEndian(byte[] bArr, int i, long j) {
                long j2 = 255;
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i + i2] = (byte) ((j & j2) >> (i2 * 8));
                    j2 <<= 8;
                }
            }

            @Override // com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes, com.google.common.hash.LittleEndianByteArray.b
            public boolean usesFastPath() {
                return false;
            }
        };

        @Override // com.google.common.hash.LittleEndianByteArray.b
        public abstract /* synthetic */ long getLongLittleEndian(byte[] bArr, int i);

        @Override // com.google.common.hash.LittleEndianByteArray.b
        public abstract /* synthetic */ void putLongLittleEndian(byte[] bArr, int i, long j);

        @Override // com.google.common.hash.LittleEndianByteArray.b
        public abstract /* synthetic */ boolean usesFastPath();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum UnsafeByteArray implements b {
        UNSAFE_LITTLE_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.1
            @Override // com.google.common.hash.LittleEndianByteArray.UnsafeByteArray, com.google.common.hash.LittleEndianByteArray.b
            public long getLongLittleEndian(byte[] bArr, int i) {
                return UnsafeByteArray.a.getLong(bArr, ((long) i) + ((long) UnsafeByteArray.b));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.UnsafeByteArray, com.google.common.hash.LittleEndianByteArray.b
            public void putLongLittleEndian(byte[] bArr, int i, long j) {
                UnsafeByteArray.a.putLong(bArr, ((long) i) + ((long) UnsafeByteArray.b), j);
            }
        },
        UNSAFE_BIG_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.2
            @Override // com.google.common.hash.LittleEndianByteArray.UnsafeByteArray, com.google.common.hash.LittleEndianByteArray.b
            public long getLongLittleEndian(byte[] bArr, int i) {
                return Long.reverseBytes(UnsafeByteArray.a.getLong(bArr, ((long) i) + ((long) UnsafeByteArray.b)));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.UnsafeByteArray, com.google.common.hash.LittleEndianByteArray.b
            public void putLongLittleEndian(byte[] bArr, int i, long j) {
                UnsafeByteArray.a.putLong(bArr, ((long) i) + ((long) UnsafeByteArray.b), Long.reverseBytes(j));
            }
        };

        private static final Unsafe a;
        private static final int b;

        static {
            Unsafe unsafe = getUnsafe();
            a = unsafe;
            b = unsafe.arrayBaseOffset(byte[].class);
            if (unsafe.arrayIndexScale(byte[].class) == 1) {
                return;
            }
            b0.c();
        }

        private static Unsafe getUnsafe() {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    try {
                        return (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new n());
                    } catch (Exception unused2) {
                        return lambda$getUnsafe$0();
                    }
                } catch (Exception e) {
                    androidx.savedstate.a.c("Could not initialize intrinsics", e);
                    return null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unsafe lambda$getUnsafe$0() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // com.google.common.hash.LittleEndianByteArray.b
        public abstract /* synthetic */ long getLongLittleEndian(byte[] bArr, int i);

        @Override // com.google.common.hash.LittleEndianByteArray.b
        public abstract /* synthetic */ void putLongLittleEndian(byte[] bArr, int i, long j);

        @Override // com.google.common.hash.LittleEndianByteArray.b
        public boolean usesFastPath() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        long getLongLittleEndian(byte[] bArr, int i);

        void putLongLittleEndian(byte[] bArr, int i, long j);

        boolean usesFastPath();
    }

    private LittleEndianByteArray() {
    }

    public static int load32(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long load64(byte[] bArr, int i) {
        return a.getLongLittleEndian(bArr, i);
    }

    public static long load64Safely(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, 8);
        long j = 0;
        for (int i3 = 0; i3 < iMin; i3++) {
            j |= (((long) bArr[i + i3]) & 255) << (i3 * 8);
        }
        return j;
    }

    private static b makeGetter() {
        try {
            if (Objects.equals(System.getProperty("os.arch"), "amd64")) {
                return ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? UnsafeByteArray.UNSAFE_LITTLE_ENDIAN : UnsafeByteArray.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        return JavaLittleEndianBytes.INSTANCE;
    }

    public static void store64(byte[] bArr, int i, long j) {
        a.putLongLittleEndian(bArr, i, j);
    }

    public static boolean usingFastPath() {
        return a.usesFastPath();
    }
}
