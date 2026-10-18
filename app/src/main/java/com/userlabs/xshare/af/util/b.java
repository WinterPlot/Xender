package com.userlabs.xshare.af.util;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static boolean isDeepLink(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return isGooglePlayUrl(str) || isDeepLinkUrl(str);
    }

    public static boolean isDeepLinkUrl(String str) {
        try {
            Uri uri = Uri.parse(str);
            return ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme())) ? false : true;
        } catch (Exception unused) {
        }
    }

    public static boolean isGooglePlayUrl(String str) {
        try {
            Uri uri = Uri.parse(str);
            return "market".equalsIgnoreCase(uri.getScheme()) || "play.google.com".equalsIgnoreCase(uri.getHost());
        } catch (Exception unused) {
            return false;
        }
    }
}
