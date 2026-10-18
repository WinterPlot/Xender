package com.userlabs.xshare.utils;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class y {
    public static boolean isDeviceTV(Context context) {
        return ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getCurrentModeType() == 4;
    }
}
