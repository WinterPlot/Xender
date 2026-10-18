package com.userlabs.xshare.core.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class n {
    private static boolean a;

    public static boolean canUseAnim() {
        return !a;
    }

    public static int getAvailMemoryMB(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.availMem >> 20);
    }

    public static int getTotalMemoryMB(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.totalMem >> 20);
    }

    public static void initLowRamDevice(Context context) {
        a = Build.VERSION.SDK_INT < 28 || isLowRamDeviceFromActivityManager() || com.userlabs.xshare.k.isInfinixGoEdition();
    }

    public static boolean isLowRamDeviceFromActivityManager() {
        ActivityManager activityManager = (ActivityManager) com.userlabs.xshare.core.c.getInstance().getSystemService("activity");
        return activityManager != null && activityManager.isLowRamDevice();
    }
}
