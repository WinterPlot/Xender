package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
class r {
    private static final r c = new r(null, null);
    private final Long a;
    private final TimeZone b;

    private r(Long l, TimeZone timeZone) {
        this.a = l;
        this.b = timeZone;
    }

    public static r fixed(long j) {
        return new r(Long.valueOf(j), null);
    }

    public static r system() {
        return c;
    }

    public Calendar now(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }

    public static r fixed(long j, TimeZone timeZone) {
        return new r(Long.valueOf(j), timeZone);
    }

    public Calendar now() {
        return now(this.b);
    }
}
