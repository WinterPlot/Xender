package com.userlabs.xshare;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a0 {
    public static int getSafeDimensionPixelSize(Context context, int i, int i2) {
        try {
            return context.getResources().getDimensionPixelSize(i);
        } catch (Throwable unused) {
            return i2;
        }
    }

    public static String getSafeString(Context context, int i, String str) {
        try {
            return context.getString(i);
        } catch (Throwable unused) {
            return str;
        }
    }

    public static boolean isDrawIdValid(Context context, int i) {
        if (i > 0) {
            try {
                return "drawable".equals(context.getResources().getResourceTypeName(i));
            } catch (Resources.NotFoundException unused) {
            }
        }
        return false;
    }
}
