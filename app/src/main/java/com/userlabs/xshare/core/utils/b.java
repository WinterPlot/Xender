package com.userlabs.xshare.core.utils;

import android.text.TextUtils;
import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private b() {
    }

    public static String decode(String str) {
        try {
            return new String(Base64.decode(str, 8), "utf-8");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String encode(String str) {
        return TextUtils.isEmpty(str) ? "" : Base64.encodeToString(str.getBytes(), 8);
    }
}
