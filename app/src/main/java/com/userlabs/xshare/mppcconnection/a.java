package com.userlabs.xshare.mppcconnection;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static volatile Context a = null;
    public static boolean b = false;

    public static Context getGlobalContext() {
        return a;
    }

    public static void init(Context context, boolean z) {
        b = z;
        a = context;
    }

    public static boolean isOpenLog() {
        return b;
    }

    public static void setOpenLog(boolean z) {
        b = z;
    }
}
