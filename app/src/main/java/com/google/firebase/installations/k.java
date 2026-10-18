package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {
    public static final long b = 3600;
    private static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static k d;
    private final com.google.firebase.installations.time.a a;

    private k(com.google.firebase.installations.time.a aVar) {
        this.a = aVar;
    }

    public static k getInstance(com.google.firebase.installations.time.a aVar) {
        k kVar = d;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(aVar);
        d = kVar2;
        return kVar2;
    }

    public static boolean isValidApiKeyFormat(String str) {
        return c.matcher(str).matches();
    }

    public static boolean isValidAppIdFormat(String str) {
        return str.contains(":");
    }

    public long currentTimeInMillis() {
        return this.a.currentTimeMillis();
    }

    public long currentTimeInSecs() {
        return currentTimeInMillis() / 1000;
    }

    public long getRandomDelayForSyncPrevention() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean isAuthTokenExpired(com.google.firebase.installations.local.c cVar) {
        if (TextUtils.isEmpty(cVar.getAuthToken())) {
            return true;
        }
        return cVar.getExpiresInSecs() + cVar.getTokenCreationEpochInSecs() < currentTimeInSecs() + b;
    }

    public static k getInstance() {
        return getInstance(com.google.firebase.installations.time.b.getInstance());
    }
}
