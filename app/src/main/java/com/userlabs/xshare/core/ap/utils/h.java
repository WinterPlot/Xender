package com.userlabs.xshare.core.ap.utils;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class h {
    public static String exception2String(Throwable th, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.toString());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\n");
            sb.append(stackTraceElement.toString());
            if (TextUtils.equals(str, stackTraceElement.getFileName())) {
                break;
            }
        }
        return sb.toString();
    }
}
