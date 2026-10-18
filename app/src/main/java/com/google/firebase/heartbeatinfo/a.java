package com.google.firebase.heartbeatinfo;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class a extends n {
    private final String a;
    private final List<String> b;

    public a(String str, List<String> list) {
        if (str == null) {
            com.google.gson.internal.a.j("Null userAgent");
            throw null;
        }
        this.a = str;
        if (list != null) {
            this.b = list;
        } else {
            com.google.gson.internal.a.j("Null usedDates");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.a.equals(nVar.getUserAgent()) && this.b.equals(nVar.getUsedDates())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.n
    public List<String> getUsedDates() {
        return this.b;
    }

    @Override // com.google.firebase.heartbeatinfo.n
    public String getUserAgent() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
