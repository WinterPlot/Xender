package com.userlabs.xshare.core.pc.event;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static String removeActionTaskPath(String str) {
        String[] strArr = {"sendPhoto1://", "sendPhoto2://", "sendPhoto3://", "camera://", "gallery://", "latestImage100://", "sendPhoto0://", "photoAck://"};
        for (int i = 0; i < 8; i++) {
            String str2 = strArr[i];
            if (str.startsWith(str2)) {
                return str.replaceFirst(str2, "");
            }
        }
        return str;
    }
}
