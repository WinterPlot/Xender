package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class up {
    private static final Pattern a = Pattern.compile("(\\w+).*");

    public static String zza(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        okhttp3.b0.i("Invalid fragment spec: ".concat(String.valueOf(str)));
        return null;
    }

    @Nullable
    public static String zzb(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(String.valueOf(com.google.common.base.g.on("+").join(list)));
    }
}
