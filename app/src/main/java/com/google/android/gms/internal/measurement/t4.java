package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class t4 {
    private static final Unsafe a;
    private static final Class b;
    private static final boolean c;
    private static final s4 d;
    private static final boolean e;
    static final long f;
    static final boolean g;

    static {
        boolean z;
        s4 s4Var;
        Unsafe unsafeZzp = zzp();
        a = unsafeZzp;
        int i = d1.a;
        b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zZzq = zzq(cls);
        c = zZzq;
        Class<?> cls2 = Integer.TYPE;
        boolean zZzq2 = zzq(cls2);
        s4 q4Var = null;
        if (unsafeZzp != null) {
            if (zZzq) {
                q4Var = new r4(unsafeZzp);
            } else if (zZzq2) {
                q4Var = new q4(unsafeZzp);
            }
        }
        d = q4Var;
        if (q4Var != null) {
            try {
                Class<?> cls3 = q4Var.a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                zzA();
            } catch (Throwable th) {
                zzx(th);
            }
        }
        s4 s4Var2 = d;
        if (s4Var2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = s4Var2.a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                zzx(th2);
                z = false;
            }
        }
        e = z;
        f = zzy(byte[].class);
        zzy(boolean[].class);
        zzz(boolean[].class);
        zzy(int[].class);
        zzz(int[].class);
        zzy(long[].class);
        zzz(long[].class);
        zzy(float[].class);
        zzz(float[].class);
        zzy(double[].class);
        zzz(double[].class);
        zzy(Object[].class);
        zzz(Object[].class);
        Field fieldZzA = zzA();
        if (fieldZzA != null && (s4Var = d) != null) {
            s4Var.a.objectFieldOffset(fieldZzA);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private t4() {
    }

    private static Field zzA() {
        int i = d1.a;
        Field fieldZzB = zzB(Buffer.class, "effectiveDirectAddress");
        if (fieldZzB != null) {
            return fieldZzB;
        }
        Field fieldZzB2 = zzB(Buffer.class, "address");
        if (fieldZzB2 == null || fieldZzB2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzB2;
    }

    private static Field zzB(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzC(Object obj, long j, byte b2) {
        Unsafe unsafe = d.a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j, byte b2) {
        Unsafe unsafe = d.a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static boolean zza() {
        return e;
    }

    public static Object zzb(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            org.jsoup.helper.n.a(e2);
            return null;
        }
    }

    public static int zzc(Object obj, long j) {
        return d.a.getInt(obj, j);
    }

    public static void zzd(Object obj, long j, int i) {
        d.a.putInt(obj, j, i);
    }

    public static long zze(Object obj, long j) {
        return d.a.getLong(obj, j);
    }

    public static void zzf(Object obj, long j, long j2) {
        d.a.putLong(obj, j, j2);
    }

    public static boolean zzg(Object obj, long j) {
        return d.zzb(obj, j);
    }

    public static void zzh(Object obj, long j, boolean z) {
        d.zzc(obj, j, z);
    }

    public static float zzi(Object obj, long j) {
        return d.zzd(obj, j);
    }

    public static void zzj(Object obj, long j, float f2) {
        d.zze(obj, j, f2);
    }

    public static double zzk(Object obj, long j) {
        return d.zzf(obj, j);
    }

    public static void zzl(Object obj, long j, double d2) {
        d.zzg(obj, j, d2);
    }

    public static Object zzm(Object obj, long j) {
        return d.a.getObject(obj, j);
    }

    public static void zzn(Object obj, long j, Object obj2) {
        d.a.putObject(obj, j, obj2);
    }

    public static void zzo(byte[] bArr, long j, byte b2) {
        d.zza(bArr, f + j, b2);
    }

    public static Unsafe zzp() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new p4());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(t4.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzq(Class cls) {
        int i = d1.a;
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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

    public static /* synthetic */ boolean zzt(Object obj, long j) {
        return ((byte) ((d.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzu(Object obj, long j) {
        return ((byte) ((d.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ void zzx(Throwable th) {
        Logger.getLogger(t4.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzy(Class cls) {
        if (e) {
            return d.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzz(Class cls) {
        if (e) {
            return d.a.arrayIndexScale(cls);
        }
        return -1;
    }
}
