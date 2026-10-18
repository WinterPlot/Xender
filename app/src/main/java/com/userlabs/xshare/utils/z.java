package com.userlabs.xshare.utils;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class z {
    public static String checkValidUrl(String str) {
        if (isValidUrl(str)) {
            return str;
        }
        okhttp3.b0.i(defpackage.a.o("invalid url: ", str));
        return null;
    }

    public static boolean isValidUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.startsWith("http://") || lowerCase.startsWith("https://");
    }
}
