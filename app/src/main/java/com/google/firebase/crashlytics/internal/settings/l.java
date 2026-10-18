package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class l implements h {
    private static d.a buildFeatureFlagDataFrom(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static d.b buildSessionDataFrom(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long getExpiresAtFrom(a0 a0Var, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j * 1000) + a0Var.getCurrentTimeMillis();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.h
    public d buildFromJson(a0 a0Var, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new d(getExpiresAtFrom(a0Var, iOptInt2, jSONObject), jSONObject.has("session") ? buildSessionDataFrom(jSONObject.getJSONObject("session")) : buildSessionDataFrom(new JSONObject()), buildFeatureFlagDataFrom(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
