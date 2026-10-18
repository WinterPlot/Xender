package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static final b b = new a().build();
    private final d a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private d a = null;

        public b build() {
            return new b(this.a);
        }

        public a setStorageMetrics(d dVar) {
            this.a = dVar;
            return this;
        }
    }

    public b(d dVar) {
        this.a = dVar;
    }

    public static b getDefaultInstance() {
        return b;
    }

    public static a newBuilder() {
        return new a();
    }

    public d getStorageMetrics() {
        d dVar = this.a;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public d getStorageMetricsInternal() {
        return this.a;
    }
}
