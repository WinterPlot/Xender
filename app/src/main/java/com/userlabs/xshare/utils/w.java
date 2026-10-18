package com.userlabs.xshare.utils;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class w {
    public static boolean endsWith(String str, String str2) {
        return !TextUtils.isEmpty(str) && str.endsWith(str2);
    }

    public static String getFirstLetter(String str) {
        try {
            String upperCase = str.substring(0, 1).toUpperCase(Locale.getDefault());
            return !isLetter(upperCase) ? "#" : upperCase;
        } catch (Throwable unused) {
            return "#";
        }
    }

    public static boolean isLetter(String str) {
        try {
            return str.matches("^[A-Z]+$");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isNickNameAllowed(CharSequence charSequence) {
        try {
            return charSequence.toString().matches("^(?!\\s)(?!.*\\s$)[\\p{Alnum}\\s\\u4e00-\\u9fa5]*$");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String replaceFirst(String str, String str2, String str3) {
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf < 0) {
            return str;
        }
        StringBuilder sbY = androidx.camera.camera2.pipe.w.y(str3);
        sbY.append(str.substring(str2.length() + iIndexOf));
        return sbY.toString();
    }
}
