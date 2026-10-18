package com.userlabs.xshare.core.permission;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.camera2.pipe.w;
import com.userlabs.xshare.core.log.h;
import com.userlabs.xshare.utils.e0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private static String a;
    private static String b;

    private static boolean check(String str) {
        String upperCase;
        String str2 = a;
        if (str2 != null) {
            return str2.equals(str);
        }
        String prop = getProp("ro.miui.ui.version.name");
        b = prop;
        if (TextUtils.isEmpty(prop)) {
            String prop2 = getProp("ro.build.version.emui");
            b = prop2;
            if (TextUtils.isEmpty(prop2)) {
                String prop3 = getProp("ro.build.version.opporom");
                b = prop3;
                if (TextUtils.isEmpty(prop3)) {
                    String prop4 = getProp("ro.vivo.os.build.display.id");
                    b = prop4;
                    if (TextUtils.isEmpty(prop4)) {
                        String prop5 = getProp("ro.smartisan.version");
                        b = prop5;
                        if (TextUtils.isEmpty(prop5)) {
                            String str3 = Build.DISPLAY;
                            b = str3;
                            if (str3.toUpperCase(Locale.getDefault()).contains("FLYME")) {
                                a = "FLYME";
                                upperCase = "FLYME";
                            } else {
                                b = "unknown";
                                upperCase = Build.MANUFACTURER.toUpperCase(Locale.getDefault());
                                a = upperCase;
                            }
                        } else {
                            upperCase = "SMARTISAN";
                            a = "SMARTISAN";
                        }
                    } else {
                        upperCase = "VIVO";
                        a = "VIVO";
                    }
                } else {
                    upperCase = "OPPO";
                    a = "OPPO";
                }
            } else {
                upperCase = "EMUI";
                a = "EMUI";
            }
        } else {
            upperCase = "MIUI";
            a = "MIUI";
        }
        return upperCase.equals(str);
    }

    public static void ensureFetchPhoneVersion() {
        try {
            if (TextUtils.isEmpty(getPhoneVersion())) {
                com.userlabs.xshare.core.preferences.a.putStringV2("phone_os_version", getPhoneVersionInBackground());
            }
        } catch (Throwable unused) {
        }
    }

    public static String getBrandPhoneVersion() {
        String prop = getProp("ro.miui.ui.version.name");
        if (!TextUtils.isEmpty(prop)) {
            String str = Build.VERSION.INCREMENTAL;
            return str.startsWith(prop) ? str : w.q(prop, " ", str);
        }
        String prop2 = getProp("ro.build.version.emui");
        if (!TextUtils.isEmpty(prop2)) {
            return prop2;
        }
        String prop3 = getProp("ro.build.version.opporom");
        if (!TextUtils.isEmpty(prop3)) {
            return prop3;
        }
        String prop4 = getProp("ro.vivo.os.build.display.id");
        if (!TextUtils.isEmpty(prop4)) {
            return prop4;
        }
        String prop5 = getProp("ro.smartisan.version");
        return !TextUtils.isEmpty(prop5) ? prop5 : Build.DISPLAY;
    }

    public static String getName() {
        if (a == null) {
            check("");
        }
        return a;
    }

    public static String getPhoneVersion() {
        return com.userlabs.xshare.core.preferences.a.getStringV2("phone_os_version", "");
    }

    private static String getPhoneVersionInBackground() {
        String prop = getProp("ro.miui.ui.version.name");
        if (!TextUtils.isEmpty(prop)) {
            String strQ = Build.VERSION.INCREMENTAL;
            if (!strQ.startsWith(prop)) {
                strQ = w.q(prop, " ", strQ);
            }
            return w.r("MIUI: ", strQ, "\nVersion: ", Build.DISPLAY);
        }
        String prop2 = getProp("ro.build.version.emui");
        if (!TextUtils.isEmpty(prop2)) {
            return w.q(prop2, "\nVersion: ", Build.DISPLAY);
        }
        String prop3 = getProp("ro.build.version.opporom");
        if (!TextUtils.isEmpty(prop3)) {
            return w.r("ColorOS: ", prop3, "\nVersion: ", Build.DISPLAY);
        }
        String prop4 = getProp("ro.vivo.os.build.display.id");
        if (!TextUtils.isEmpty(prop4)) {
            return w.q(prop4, "\nVersion: ", Build.DISPLAY);
        }
        String prop5 = getProp("ro.smartisan.version");
        return !TextUtils.isEmpty(prop5) ? w.r("Smartisan OS: ", prop5, "\nVersion: ", Build.DISPLAY) : defpackage.a.o("Version: ", Build.DISPLAY);
    }

    public static String getProp(String str) {
        BufferedReader bufferedReader;
        if (!isValidPropName(str)) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder("getprop", str).start().getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                e0.closeQuietly(bufferedReader);
                h.d("RomUtil", "getProp name=" + str + " ,line=" + line);
                return line;
            } catch (Throwable th) {
                th = th;
                try {
                    h.d("RomUtil", "Unable to read prop " + str, th);
                    return null;
                } finally {
                    e0.closeQuietly(bufferedReader);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    private static String getVersion() {
        if (b == null) {
            check("");
        }
        return b;
    }

    public static boolean isChromebook(Context context) {
        if (isChromebookByFeature(context) || isChromebookByBrand()) {
            return true;
        }
        return isChromebookByProduct();
    }

    private static boolean isChromebookByBrand() {
        return "chromium".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean isChromebookByFeature(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().hasSystemFeature("android.software.leanback_only");
        }
        return false;
    }

    private static boolean isChromebookByProduct() {
        String str = Build.PRODUCT;
        if (str != null) {
            return str.contains("chrome") || str.contains("chromeboxyz");
        }
        return false;
    }

    public static boolean isCoolpad() {
        String str = Build.BRAND;
        return str != null && androidx.versionedparcelable.b.C(str, "coolpad");
    }

    public static boolean isEmui() {
        return check("EMUI");
    }

    public static boolean isFlyme() {
        return check("FLYME");
    }

    public static boolean isHuawei() {
        String str = Build.BRAND;
        String lowerCase = str != null ? str.toLowerCase(Locale.getDefault()) : null;
        if (lowerCase != null) {
            return lowerCase.contains("huawei") || lowerCase.contains("honor");
        }
        return false;
    }

    public static boolean isMiui() {
        return check("MIUI");
    }

    public static boolean isMotorola() {
        String str = Build.BRAND;
        return str != null && androidx.versionedparcelable.b.C(str, "motorola");
    }

    public static boolean isNokiaDevice() {
        try {
            String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.getDefault());
            String lowerCase2 = Build.MODEL.toLowerCase(Locale.getDefault());
            String lowerCase3 = Build.BRAND.toLowerCase(Locale.getDefault());
            h.d("rom_util", "manufacturer =" + lowerCase + ",model=" + lowerCase2 + ",brand=" + lowerCase3);
            return lowerCase.contains("nokia") || lowerCase2.contains("nokia") || lowerCase3.contains("nokia");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isOppo() {
        return check("OPPO");
    }

    public static boolean isOppoByBrand() {
        return androidx.versionedparcelable.b.C(Build.BRAND, "oppo");
    }

    public static boolean isQiku() {
        return check("QIKU") || check("360");
    }

    public static boolean isSamsung() {
        String str = Build.BRAND;
        return str != null && androidx.versionedparcelable.b.C(str, "samsung");
    }

    public static boolean isSmartisan() {
        return check("SMARTISAN");
    }

    public static boolean isTranssionDevice() {
        try {
            String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.getDefault());
            String lowerCase2 = Build.MODEL.toLowerCase(Locale.getDefault());
            String lowerCase3 = Build.BRAND.toLowerCase(Locale.getDefault());
            h.d("rom_util", "manufacturer =" + lowerCase + ",model=" + lowerCase2 + ",brand=" + lowerCase3);
            return lowerCase.matches("tecno|infinix|itel") || lowerCase2.matches("tecno|infinix|itel") || lowerCase3.matches("tecno|infinix|itel");
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean isValidPropName(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "ro.config.low_ram".equals(str) || "ro.build.version.emui".equals(str) || "ro.build.version.opporom".equals(str) || "ro.smartisan.version".equals(str) || "ro.vivo.os.build.display.id".equals(str) || "ro.gn.sv.version".equals(str) || "ro.lenovo.lvp.version".equals(str) || "ro.build.display.id".equals(str) || "ro.build.hw_emui_api_level".equals(str) || "ro.miui.ui.version.code".equals(str) || "ro.miui.ui.version.name".equals(str) || "ro.miui.internal.storage".equals(str) || "ro.miui.has_handy_mode_sf".equals(str) || "ro.miui.has_real_blur".equals(str) || "persist.sys.use.flyme.icon".equals(str) || "ro.meizu.setupwizard.flyme".equals(str) || "ro.flyme.published".equals(str) || "ro.vivo.os.name".equals(str) || "ro.vivo.os.version".equals(str) || "ro.vivo.rom.version".equals(str);
    }

    public static boolean isVivo() {
        return check("VIVO");
    }

    public static boolean isVivoByBrand() {
        String str = Build.BRAND;
        return str != null && androidx.versionedparcelable.b.C(str, "vivo");
    }
}
