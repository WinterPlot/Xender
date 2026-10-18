package com.userlabs.xshare.core.utils;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class q {
    private q() {
    }

    public static String create() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String createUUid() {
        return UUID.randomUUID().toString();
    }
}
