package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static final d c = new a().build();
    private final long a;
    private final long b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private long a = 0;
        private long b = 0;

        public d build() {
            return new d(this.a, this.b);
        }

        public a setCurrentCacheSizeBytes(long j) {
            this.a = j;
            return this;
        }

        public a setMaxCacheSizeBytes(long j) {
            this.b = j;
            return this;
        }
    }

    public d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static d getDefaultInstance() {
        return c;
    }

    public static a newBuilder() {
        return new a();
    }

    public long getCurrentCacheSizeBytes() {
        return this.a;
    }

    public long getMaxCacheSizeBytes() {
        return this.b;
    }
}
