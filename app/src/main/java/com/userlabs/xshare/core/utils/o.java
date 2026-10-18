package com.userlabs.xshare.core.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class o {
    private static boolean OppoA37F(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.coloros.simsettings", "com.coloros.simsettings.OppoSimSettingsActivity"));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean dataEnabledBelow26(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return ((Boolean) connectivityManager.getClass().getMethod("getMobileDataEnabled", null).invoke(connectivityManager, null)).booleanValue();
        } catch (Throwable th) {
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.i("GPRSUtil", th.toString());
            }
            th.printStackTrace();
            return false;
        }
    }

    private static boolean dataEnabledOver26(Context context) {
        try {
            TelephonyManager telephonyManager = com.userlabs.xshare.core.ap.utils.l.getTelephonyManager(context);
            return telephonyManager != null && telephonyManager.isDataEnabled();
        } catch (Throwable unused) {
        }
    }

    public static void gotoSystemSettingsMobileDataEnabledManually(Context context) {
        String lowerCase = Build.BRAND.toLowerCase(Locale.getDefault());
        if (isXiaomi(lowerCase)) {
            try {
                try {
                    Intent intent = new Intent("android.settings.DATA_ROAMING_SETTINGS");
                    intent.setComponent(new ComponentName("com.android.phone", "com.android.phone.settings.MobileNetworkSettings"));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                } catch (Exception unused) {
                    Intent intent2 = new Intent("android.settings.DATA_ROAMING_SETTINGS");
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                    return;
                }
            } catch (Throwable unused2) {
                toDefaultSettings(context);
                return;
            }
        }
        if (isSamsung(lowerCase)) {
            try {
                if (com.userlabs.xshare.core.c.isOverAndroidP()) {
                    try {
                        Intent intent3 = new Intent("android.settings.DATA_USAGE_SETTINGS");
                        intent3.addFlags(268435456);
                        context.startActivity(intent3);
                    } catch (Throwable unused3) {
                        Intent intent4 = new Intent();
                        intent4.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$DataUsageSummaryActivity"));
                        intent4.addFlags(268435456);
                        context.startActivity(intent4);
                    }
                } else {
                    try {
                        Intent intent5 = new Intent();
                        intent5.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$DataUsageSummaryActivity"));
                        intent5.addFlags(268435456);
                        context.startActivity(intent5);
                    } catch (Throwable unused4) {
                        Intent intent6 = new Intent("android.settings.DATA_ROAMING_SETTINGS");
                        intent6.addFlags(268435456);
                        context.startActivity(intent6);
                    }
                }
                return;
            } catch (Exception unused5) {
                toDefaultSettings(context);
                return;
            }
        }
        if (isOppo(lowerCase)) {
            handOppoMobileData(context);
            return;
        }
        if (isHuawei(lowerCase)) {
            try {
                try {
                    Intent intent7 = new Intent();
                    intent7.setComponent(new ComponentName("com.android.phone", "com.android.phone.MSimMobileNetworkSettings"));
                    intent7.addFlags(268435456);
                    context.startActivity(intent7);
                    return;
                } catch (Throwable unused6) {
                    toDefaultSettings(context);
                    return;
                }
            } catch (Throwable unused7) {
                Intent intent8 = new Intent("android.settings.DATA_ROAMING_SETTINGS");
                intent8.addFlags(268435456);
                context.startActivity(intent8);
                return;
            }
        }
        if (isRealMe(lowerCase)) {
            handRealMeMobileData(context);
            return;
        }
        if (!isItel(lowerCase)) {
            toDefaultCompatSettings(context);
            return;
        }
        if (!com.userlabs.xshare.core.c.isOverAndroidP()) {
            if (toSettingsDataUsageSummary(context) || toSettingsSimSettings(context) || toRoaming(context)) {
                return;
            }
            toDefaultSettings(context);
            return;
        }
        try {
            try {
                Intent intent9 = new Intent();
                intent9.setComponent(new ComponentName("com.android.phone", "com.android.phone.MobileNetworkSettings"));
                intent9.addFlags(268435456);
                context.startActivity(intent9);
            } catch (Throwable unused8) {
                toDefaultSettings(context);
            }
        } catch (Throwable unused9) {
            Intent intent10 = new Intent("android.settings.DATA_USAGE_SETTINGS");
            intent10.addFlags(268435456);
            context.startActivity(intent10);
        }
    }

    private static void handOppoMobileData(Context context) {
        if (OppoA37F(context)) {
            return;
        }
        try {
            Intent intent = new Intent("android.settings.DATA_ROAMING_SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
            toDefaultCompatSettings(context);
        }
    }

    private static void handRealMeMobileData(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.android.phone", "com.android.phone.OplusSimSettingsImpl"));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
            toDefaultCompatSettings(context);
        }
    }

    public static boolean hasSimCard(Context context) {
        return com.userlabs.xshare.core.ap.utils.l.getTelephonyManager(context).getSimState() == 5;
    }

    public static boolean isDataEnabled(Context context) {
        return com.userlabs.xshare.core.c.isOverAndroidO() ? dataEnabledOver26(context) : dataEnabledBelow26(context);
    }

    public static boolean isHuawei(String str) {
        if (str != null) {
            return str.contains("huawei") || str.contains("honor");
        }
        return false;
    }

    private static boolean isItel(String str) {
        return str != null && str.contains("itel");
    }

    private static boolean isOppo(String str) {
        return str != null && str.contains("oppo");
    }

    private static boolean isRealMe(String str) {
        return str != null && str.contains("realme");
    }

    public static boolean isRealMeRMX3930() {
        if (isRealMe(Build.BRAND.toLowerCase(Locale.getDefault()))) {
            return "RMX3930".equalsIgnoreCase(Build.MODEL) || "RE6054".equalsIgnoreCase(Build.DEVICE);
        }
        return false;
    }

    private static boolean isSamsung(String str) {
        return str != null && str.contains("samsung");
    }

    private static boolean isVivo(String str) {
        return str != null && str.contains("vivo");
    }

    private static boolean isXiaomi(String str) {
        if (str != null) {
            return str.contains("xiaomi") || str.contains("redmi");
        }
        return false;
    }

    public static void setDataEnabled(Context context, boolean z) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (isDataEnabled(context) == (!z)) {
            setGprsEnable("setMobileDataEnabled", z, connectivityManager);
        }
    }

    private static void setGprsEnable(String str, boolean z, ConnectivityManager connectivityManager) {
        try {
            connectivityManager.getClass().getMethod(str, Boolean.TYPE).invoke(connectivityManager, Boolean.valueOf(z));
        } catch (Throwable th) {
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.i("GPRSUtil", th.toString());
            }
        }
    }

    public static void toDataUsage(Context context) {
        try {
            if (com.userlabs.xshare.core.c.isOverAndroidP()) {
                Intent intent = new Intent("android.settings.DATA_USAGE_SETTINGS");
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (Throwable unused) {
        }
    }

    public static void toDataUsageComponent(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$DataUsageSummaryActivity"));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    private static void toDefaultCompatSettings(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$DataUsageSummaryActivity"));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Throwable unused) {
            if (com.userlabs.xshare.core.c.isOverAndroidP()) {
                try {
                    Intent intent2 = new Intent("android.settings.DATA_USAGE_SETTINGS");
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                    return;
                } catch (Throwable unused2) {
                    toDefaultSettings(context);
                    return;
                }
            }
            try {
                Intent intent3 = new Intent("android.settings.DATA_ROAMING_SETTINGS");
                intent3.addFlags(268435456);
                context.startActivity(intent3);
            } catch (Throwable unused3) {
                toDefaultSettings(context);
            }
        }
    }

    private static void toDefaultSettings(Context context) {
        try {
            Intent intent = new Intent("android.settings.SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static void toMobileNetworkSettingsComponent(Context context) {
        try {
            Intent intent = new Intent("android.settings.DATA_ROAMING_SETTINGS");
            intent.setComponent(new ComponentName("com.android.phone", "com.android.phone.settings.MobileNetworkSettings"));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    public static boolean toRoaming(Context context) {
        try {
            Intent intent = new Intent("android.settings.DATA_ROAMING_SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean toSettingsDataUsageSummary(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$DataUsageSummaryActivity"));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean toSettingsSimSettings(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$SimSettingsActivity"));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isHuawei() {
        return isHuawei(Build.BRAND.toLowerCase(Locale.getDefault()));
    }
}
