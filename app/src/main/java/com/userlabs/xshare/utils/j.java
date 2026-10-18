package com.userlabs.xshare.utils;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class j {
    public static String formatBytes(long j) {
        String str;
        long j2;
        int i = Build.VERSION.SDK_INT <= 24 ? 1024 : 1000;
        boolean z = j < 0;
        if (z) {
            j = -j;
        }
        float f = j;
        if (f > 900.0f) {
            j2 = i;
            f /= i;
            str = "KB";
        } else {
            str = "B";
            j2 = 1;
        }
        if (f > 900.0f) {
            j2 *= (long) i;
            f /= i;
            str = "MB";
        }
        if (f > 900.0f) {
            j2 *= (long) i;
            f /= i;
            str = "GB";
        }
        if (f > 900.0f) {
            j2 *= (long) i;
            f /= i;
            str = "TB";
        }
        if (f > 900.0f) {
            j2 *= (long) i;
            f /= i;
            str = "PB";
        }
        String str2 = (j2 == 1 || f >= 100.0f) ? "%.0f" : "%.2f";
        if (z) {
            f = -f;
        }
        return String.format(str2, Float.valueOf(f)).concat(str);
    }

    public static String[] splitFileSizeToSizeAndSuffix(String str) {
        String[] strArr = new String[2];
        if (!TextUtils.isEmpty(str)) {
            char[] charArray = str.toCharArray();
            int i = -1;
            for (int length = charArray.length - 1; length >= 0; length--) {
                if (TextUtils.isDigitsOnly(charArray[length] + "")) {
                    break;
                }
                i = length;
            }
            if (i >= 0) {
                strArr[0] = str.substring(0, i);
                strArr[1] = str.substring(i);
            }
        }
        return strArr;
    }

    public static String[] splitFileSizeToSizeAndSuffix(long j) {
        return splitFileSizeToSizeAndSuffix(formatBytes(j));
    }
}
