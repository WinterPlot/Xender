package com.userlabs.xshare.af.util;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private static c a = new c();

        private a() {
        }
    }

    public static String getCookie(String str) {
        return CookieManager.getInstance().getCookie(str);
    }

    public static c getInstance() {
        return a.a;
    }

    public static void setCookies(String str, Map<String, List<String>> map) {
        List<String> list;
        if (map == null || (list = map.get("Set-Cookie")) == null) {
            return;
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            cookieManager.setCookie(str, it.next());
        }
        CookieManager.getInstance().flush();
    }

    public static void init(Context context) {
    }
}
