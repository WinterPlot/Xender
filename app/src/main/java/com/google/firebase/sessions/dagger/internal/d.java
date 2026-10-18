package com.google.firebase.sessions.dagger.internal;

import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private d() {
    }

    public static <T> void checkBuilderRequirement(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static <T> T checkNotNull(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        if (!str.contains("%s")) {
            b0.i("errorMessageTemplate has no format specifiers");
            return null;
        }
        if (str.indexOf("%s") != str.lastIndexOf("%s")) {
            b0.i("errorMessageTemplate has more than one format specifier");
            return null;
        }
        if (obj instanceof Class) {
            obj = ((Class) obj).getCanonicalName();
        }
        com.google.gson.internal.a.j(str.replace("%s", String.valueOf(obj)));
        return null;
    }

    public static <T> T checkNotNullFromComponent(T t) {
        if (t != null) {
            return t;
        }
        com.google.gson.internal.a.j("Cannot return null from a non-@Nullable component method");
        return null;
    }

    public static <T> T checkNotNullFromProvides(T t) {
        if (t != null) {
            return t;
        }
        com.google.gson.internal.a.j("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        com.google.gson.internal.a.j(str);
        return null;
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
