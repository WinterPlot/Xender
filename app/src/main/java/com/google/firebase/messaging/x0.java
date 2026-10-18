package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class x0 {
    static final long a = 60000;
    private static final Object b = new Object();
    private static com.google.android.gms.stats.a c;

    public static void acquireWakeLock(Intent intent, long j) {
        synchronized (b) {
            try {
                if (c != null) {
                    setAsWakefulIntent(intent, true);
                    c.acquire(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void checkAndInitWakeLock(Context context) {
        if (c == null) {
            com.google.android.gms.stats.a aVar = new com.google.android.gms.stats.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            c = aVar;
            aVar.setReferenceCounted(true);
        }
    }

    public static void completeWakefulIntent(Intent intent) {
        synchronized (b) {
            try {
                if (c != null && isWakefulIntent(intent)) {
                    setAsWakefulIntent(intent, false);
                    c.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void initWakeLock(Context context) {
        synchronized (b) {
            checkAndInitWakeLock(context);
        }
    }

    public static boolean isWakefulIntent(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void reset() {
        synchronized (b) {
            c = null;
        }
    }

    public static void sendWakefulServiceIntent(Context context, z0 z0Var, Intent intent) {
        synchronized (b) {
            try {
                checkAndInitWakeLock(context);
                boolean zIsWakefulIntent = isWakefulIntent(intent);
                int i = 1;
                setAsWakefulIntent(intent, true);
                if (!zIsWakefulIntent) {
                    c.acquire(a);
                }
                z0Var.sendIntent(intent).addOnCompleteListener(new z(intent, i));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void setAsWakefulIntent(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        synchronized (b) {
            try {
                checkAndInitWakeLock(context);
                boolean zIsWakefulIntent = isWakefulIntent(intent);
                setAsWakefulIntent(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zIsWakefulIntent) {
                    c.acquire(a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
