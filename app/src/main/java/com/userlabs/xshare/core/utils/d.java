package com.userlabs.xshare.core.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    private static final DecimalFormat a = new DecimalFormat("00");

    public static String conversionDigitToString(long j) {
        return NumberFormat.getIntegerInstance(Locale.getDefault()).format(j);
    }

    public static String conversionDurationMillis(long j) {
        return conversionDurationSeconds(j / 1000);
    }

    public static String conversionDurationSeconds(long j) {
        long j2 = j % 60;
        long j3 = j / 60;
        long j4 = j3 % 60;
        long j5 = j3 / 60;
        if (j5 <= 0) {
            StringBuilder sb = new StringBuilder();
            DecimalFormat decimalFormat = a;
            sb.append(decimalFormat.format(j4));
            sb.append(":");
            sb.append(decimalFormat.format(j2));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        DecimalFormat decimalFormat2 = a;
        sb2.append(decimalFormat2.format(j5));
        sb2.append(":");
        sb2.append(decimalFormat2.format(j4));
        sb2.append(":");
        sb2.append(decimalFormat2.format(j2));
        return sb2.toString();
    }
}
