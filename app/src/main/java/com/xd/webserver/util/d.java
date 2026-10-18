package com.xd.webserver.util;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static String safeGroup(Matcher matcher, int i, String str) {
        try {
            return matcher.group(i);
        } catch (Throwable unused) {
            return str;
        }
    }
}
