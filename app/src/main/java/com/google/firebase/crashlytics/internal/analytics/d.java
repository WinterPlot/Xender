package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.common.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class d implements b, com.google.firebase.crashlytics.internal.breadcrumbs.b {
    private com.google.firebase.crashlytics.internal.breadcrumbs.a a;

    private static String serializeEvent(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void onEvent(String str, Bundle bundle) {
        com.google.firebase.crashlytics.internal.breadcrumbs.a aVar = this.a;
        if (aVar != null) {
            try {
                ((t) aVar).handleBreadcrumb("$A$:" + serializeEvent(str, bundle));
            } catch (JSONException unused) {
                com.google.firebase.crashlytics.internal.f.getLogger().w("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.b
    public void registerBreadcrumbHandler(com.google.firebase.crashlytics.internal.breadcrumbs.a aVar) {
        this.a = aVar;
        com.google.firebase.crashlytics.internal.f.getLogger().d("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
