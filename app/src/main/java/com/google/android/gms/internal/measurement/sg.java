package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class sg {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature e;
    public static final Feature f;
    public static final Feature g;
    public static final Feature h;
    public static final Feature i;
    public static final Feature[] j;

    static {
        Feature feature = new Feature("commit_to_configuration_v2_api", 1L, true);
        a = feature;
        Feature feature2 = new Feature("get_serving_version_api", 1L, true);
        b = feature2;
        Feature feature3 = new Feature("get_experiment_tokens_api", 1L, true);
        c = feature3;
        Feature feature4 = new Feature("register_flag_update_listener_api", 2L, true);
        d = feature4;
        Feature feature5 = new Feature("sync_after_api", 1L, true);
        e = feature5;
        Feature feature6 = new Feature("sync_after_for_application_api", 1L, true);
        f = feature6;
        Feature feature7 = new Feature("set_app_wide_properties_api", 1L, true);
        g = feature7;
        Feature feature8 = new Feature("set_runtime_properties_api", 1L, true);
        h = feature8;
        Feature feature9 = new Feature("get_storage_info_api", 1L, true);
        i = feature9;
        j = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9};
    }
}
