package com.userlabs.xshare.core.utils;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.userlabs.xshare.multiplatformconnection.client.MPCClientData;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class s {
    private static volatile float a;
    private static int b;
    private static int c;

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getActionBarHeight(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static float getAspectRatio() {
        return a;
    }

    public static int getMinWidth(Context context) {
        return Math.min(getScreenWidth(context), getScreenHeight(context));
    }

    public static int getNavigationBarHeight(Context context) {
        Resources resources;
        int identifier;
        if (c == 0 && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", MPCClientData.PLATFORM_ANDROID)) > 0) {
            c = resources.getDimensionPixelSize(identifier);
        }
        return c;
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getStatusBarHeight(Context context) {
        Resources resources;
        int identifier;
        if (b == 0 && (identifier = (resources = context.getResources()).getIdentifier("status_bar_height", "dimen", MPCClientData.PLATFORM_ANDROID)) > 0) {
            b = resources.getDimensionPixelSize(identifier);
        }
        return b;
    }

    private static boolean hasHardwareKeys(Context context) {
        return context != null && ViewConfiguration.get(context).hasPermanentMenuKey();
    }

    public static boolean hasHardwareKeysCompat() {
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("system_bar", "hasHardwareKeys " + hasHardwareKeys(com.userlabs.xshare.core.c.getInstance()) + " isUsingOnScreenNavBar " + isUsingOnScreenNavBar() + " showNavigationBar " + com.userlabs.xshare.utils.x.b);
        }
        return hasHardwareKeys(com.userlabs.xshare.core.c.getInstance()) || !com.userlabs.xshare.utils.x.b;
    }

    public static void initDeviceAspectRatio(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        a = displayMetrics.heightPixels / displayMetrics.widthPixels;
    }

    private static boolean isUsingOnScreenNavBar() {
        return (KeyCharacterMap.deviceHasKey(4) && KeyCharacterMap.deviceHasKey(3) && KeyCharacterMap.deviceHasKey(187)) ? false : true;
    }

    public static float px2dip(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }

    public static int dip2px(float f) {
        return dip2px(com.userlabs.xshare.core.c.getInstance(), f);
    }
}
