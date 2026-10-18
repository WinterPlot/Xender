package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.a0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class b implements h {
    public static d defaultSettings(a0 a0Var) {
        return new d(a0Var.getCurrentTimeMillis() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.h
    public d buildFromJson(a0 a0Var, JSONObject jSONObject) {
        return defaultSettings(a0Var);
    }
}
