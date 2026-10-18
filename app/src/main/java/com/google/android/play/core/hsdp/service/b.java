package com.google.android.play.core.hsdp.service;

import android.os.IBinder;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class a {
        public abstract b build();

        public abstract a setExtraQueryParams(Map<String, String> map);

        public abstract a setReferrer(String str);

        public abstract a setTargetAppPackageName(String str);

        public abstract a setWindowToken(IBinder iBinder);
    }

    public static a builder() {
        d0 d0Var = new d0();
        d0Var.setExtraQueryParams(Collections.EMPTY_MAP);
        return d0Var;
    }

    public abstract Map<String, String> extraQueryParams();

    public abstract String referrer();

    public abstract String targetAppPackageName();

    public abstract IBinder windowToken();
}
