package com.google.android.gms.cloudmessaging;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s {
    public static final Feature a;
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("register", 1L, true);
        a = feature;
        Feature feature2 = new Feature("unregister", 1L, true);
        b = feature2;
        c = new Feature[]{feature, feature2};
    }
}
