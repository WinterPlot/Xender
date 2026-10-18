package com.google.android.gms.common.api.internal;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f2 {
    private static final ExecutorService a = com.google.android.gms.internal.base.m.zaa().zac(new com.google.android.gms.common.util.concurrent.c("GAC_Transform"), 1);

    public static ExecutorService zaa() {
        return a;
    }
}
