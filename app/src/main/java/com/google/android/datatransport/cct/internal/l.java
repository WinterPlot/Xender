package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class l extends t {
    private final long a;

    public l(long j) {
        this.a = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof t) && this.a == ((t) obj).getNextRequestWaitMillis();
    }

    @Override // com.google.android.datatransport.cct.internal.t
    public long getNextRequestWaitMillis() {
        return this.a;
    }

    public int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return defpackage.a.l(this.a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
