package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
abstract class ui {
    private static final Object a = new Object();
    private static volatile zzlr b = null;
    private static volatile boolean c = false;
    private static volatile zzlr d;

    public static void zza() {
        c = true;
    }

    public static boolean zzb() {
        synchronized (a) {
        }
        return false;
    }

    public static void zzc() {
        if (d == null) {
            d = new zzlr(null);
        }
    }

    public static void zzd() {
        if (b == null) {
            b = new zzlr(null);
        }
    }
}
