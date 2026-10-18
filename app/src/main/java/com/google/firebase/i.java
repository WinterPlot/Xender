package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.util.t;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        m.checkState(!t.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static i fromResource(Context context) {
        o oVar = new o(context);
        String string = oVar.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new i(string, oVar.getString("google_api_key"), oVar.getString("firebase_database_url"), oVar.getString("ga_trackingId"), oVar.getString("gcm_defaultSenderId"), oVar.getString("google_storage_bucket"), oVar.getString("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.equal(this.b, iVar.b) && l.equal(this.a, iVar.a) && l.equal(this.c, iVar.c) && l.equal(this.d, iVar.d) && l.equal(this.e, iVar.e) && l.equal(this.f, iVar.f) && l.equal(this.g, iVar.g);
    }

    public String getApiKey() {
        return this.a;
    }

    public String getApplicationId() {
        return this.b;
    }

    public String getDatabaseUrl() {
        return this.c;
    }

    public String getGaTrackingId() {
        return this.d;
    }

    public String getGcmSenderId() {
        return this.e;
    }

    public String getProjectId() {
        return this.g;
    }

    public String getStorageBucket() {
        return this.f;
    }

    public int hashCode() {
        return l.hashCode(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return l.toStringHelper(this).add("applicationId", this.b).add("apiKey", this.a).add("databaseUrl", this.c).add("gcmSenderId", this.e).add("storageBucket", this.f).add("projectId", this.g).toString();
    }
}
