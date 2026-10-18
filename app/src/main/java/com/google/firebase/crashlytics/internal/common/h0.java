package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class h0 {
    private String a;

    private static String loadInstallerPackageName(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public synchronized String getInstallerPackageName(Context context) {
        String strLoadInstallerPackageName;
        try {
            strLoadInstallerPackageName = this.a;
            if (strLoadInstallerPackageName == null) {
                strLoadInstallerPackageName = loadInstallerPackageName(context);
                this.a = strLoadInstallerPackageName;
            }
        } catch (Throwable th) {
            throw th;
        }
        return "".equals(strLoadInstallerPackageName) ? null : this.a;
    }
}
