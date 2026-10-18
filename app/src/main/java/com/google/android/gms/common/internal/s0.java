package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import kotlin.uuid.Uuid;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s0 {
    private static final Object a = new Object();
    private static boolean b;
    private static String c;
    private static int d;

    public static String zza(Context context) {
        zzc(context);
        return c;
    }

    public static int zzb(Context context) {
        zzc(context);
        return d;
    }

    private static void zzc(Context context) {
        synchronized (a) {
            try {
                if (b) {
                    return;
                }
                b = true;
                try {
                    Bundle bundle = com.google.android.gms.common.wrappers.d.packageManager(context).getApplicationInfo(context.getPackageName(), Uuid.SIZE_BITS).metaData;
                    if (bundle == null) {
                        return;
                    }
                    c = bundle.getString("com.google.app.id");
                    d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
