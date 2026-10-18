package com.userlabs.xshare.core.utils;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class p {
    public static void analyticsTimeMills(String str, long j) {
        String str2;
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("firebase_a", "analytics interval event id:" + str + ",interval:" + j);
        }
        if (j <= 100) {
            str2 = "0-100";
        } else if (j <= 500) {
            str2 = "100-500";
        } else if (j <= 1000) {
            str2 = "500-1000";
        } else if (j <= 2000) {
            str2 = "1s-2s";
        } else if (j <= 3000) {
            str2 = "2s-3s";
        } else if (j <= 5000) {
            str2 = "3s-5s";
        } else {
            str2 = j <= 8000 ? "5s-8s" : "8s-";
        }
        HashMap map = new HashMap();
        map.put("interval", str2);
        firebaseAnalytics(str, map);
    }

    public static void analyticsTimeMills2(String str, long j) {
        String str2;
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("firebase_a", "analytics interval2 event id:" + str + ",interval:" + j);
        }
        if (j <= 100) {
            str2 = "0-100";
        } else if (j <= 500) {
            str2 = "100-500";
        } else if (j <= 1000) {
            str2 = "500-1000";
        } else if (j <= 2000) {
            str2 = "1s-2s";
        } else if (j <= 5000) {
            str2 = "2s-5s";
        } else if (j <= 10000) {
            str2 = "5s-10s";
        } else if (j <= 20000) {
            str2 = "10s-20s";
        } else if (j <= 30000) {
            str2 = "20s-30s";
        } else {
            str2 = j <= 50000 ? "30s-50s" : "50s-";
        }
        HashMap map = new HashMap();
        map.put("interval", str2);
        firebaseAnalytics(str, map);
    }

    public static String countToRange(Integer num) {
        if (num.intValue() == 0) {
            return "0";
        }
        if (num.intValue() <= 5) {
            return "1-5";
        }
        if (num.intValue() <= 20) {
            return "5-20";
        }
        return num.intValue() <= 50 ? "20-50" : "50-";
    }

    public static void firebaseAnalytics(String str, Map<String, String> map) {
        try {
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.d("firebase_a", "event:" + str + ",params:" + map);
            }
            Bundle bundle = new Bundle();
            if (map != null) {
                for (String str2 : map.keySet()) {
                    bundle.putString(str2, map.get(str2));
                }
            }
            FirebaseAnalytics.getInstance(com.userlabs.xshare.core.c.getInstance()).logEvent(str, bundle);
        } catch (Throwable unused) {
        }
    }

    public static void firebaseAnalytics(String str) {
        firebaseAnalytics(str, null);
    }
}
