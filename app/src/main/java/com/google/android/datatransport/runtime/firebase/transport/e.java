package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    private static final e c = new a().build();
    private final long a;
    private final long b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private long a = 0;
        private long b = 0;

        public e build() {
            return new e(this.a, this.b);
        }

        public a setEndMs(long j) {
            this.b = j;
            return this;
        }

        public a setStartMs(long j) {
            this.a = j;
            return this;
        }
    }

    public e(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static e getDefaultInstance() {
        return c;
    }

    public static a newBuilder() {
        return new a();
    }

    public long getEndMs() {
        return this.b;
    }

    public long getStartMs() {
        return this.a;
    }
}
