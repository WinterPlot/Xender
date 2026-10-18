package com.bumptech.glide.util;

import android.text.TextUtils;
import java.util.Collection;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {
    private k() {
    }

    public static void checkArgument(boolean z, String str) {
        if (z) {
            return;
        }
        b0.i(str);
    }

    public static String checkNotEmpty(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        b0.i("Must not be null or empty");
        return null;
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        com.google.gson.internal.a.j(str);
        return null;
    }

    public static void checkArgument(boolean z) {
        checkArgument(z, "");
    }

    public static <T> T checkNotNull(T t) {
        return (T) checkNotNull(t, "Argument must not be null");
    }

    public static <T extends Collection<Y>, Y> T checkNotEmpty(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        b0.i("Must not be empty.");
        return null;
    }
}
