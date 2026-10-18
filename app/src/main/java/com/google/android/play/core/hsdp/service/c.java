package com.google.android.play.core.hsdp.service;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
abstract class c {
    public static int zza(Activity activity, int i) {
        return (int) ((i * activity.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int zzb(Activity activity) {
        return zza(activity, activity.getResources().getConfiguration().screenHeightDp);
    }

    public static int zzc(Activity activity) {
        return zza(activity, activity.getResources().getConfiguration().screenWidthDp);
    }
}
