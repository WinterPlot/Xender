package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class e {
    private final Float a;
    private final boolean b;

    private e(Float f, boolean z) {
        this.b = z;
        this.a = f;
    }

    public static e get(Context context) {
        boolean zIsPowerConnected = false;
        Float level = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zIsPowerConnected = isPowerConnected(intentRegisterReceiver);
                level = getLevel(intentRegisterReceiver);
            }
        } catch (IllegalStateException e) {
            com.google.firebase.crashlytics.internal.f.getLogger().e("An error occurred getting battery state.", e);
        }
        return new e(level, zIsPowerConnected);
    }

    private static Float getLevel(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean isPowerConnected(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float getBatteryLevel() {
        return this.a;
    }

    public int getBatteryVelocity() {
        Float f;
        if (!this.b || (f = this.a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }

    public boolean isPowerConnected() {
        return this.b;
    }
}
