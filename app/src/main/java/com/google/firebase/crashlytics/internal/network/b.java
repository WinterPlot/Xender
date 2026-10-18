package com.google.firebase.crashlytics.internal.network;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class b {
    public a buildHttpGetRequest(String str) {
        return buildHttpGetRequest(str, Collections.EMPTY_MAP);
    }

    public a buildHttpGetRequest(String str, Map<String, String> map) {
        return new a(str, map);
    }
}
