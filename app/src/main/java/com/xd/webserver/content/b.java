package com.xd.webserver.content;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class b {
    private final String a;
    private final String b;
    private final String c;

    public b(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = getHTTPTime(i);
    }

    public static String getHTTPTime(int i) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        calendar.add(5, i);
        return simpleDateFormat.format(calendar.getTime());
    }

    public String getHTTPHeader() {
        return this.a + "=" + this.b + "; expires=" + this.c;
    }

    public b(String str, String str2) {
        this(str, str2, 30);
    }

    public b(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
