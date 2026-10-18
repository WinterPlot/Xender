package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static g create(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        return new c(context, aVar, aVar2, "cct");
    }

    public abstract Context getApplicationContext();

    public abstract String getBackendName();

    public abstract com.google.android.datatransport.runtime.time.a getMonotonicClock();

    public abstract com.google.android.datatransport.runtime.time.a getWallClock();

    public static g create(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, String str) {
        return new c(context, aVar, aVar2, str);
    }
}
