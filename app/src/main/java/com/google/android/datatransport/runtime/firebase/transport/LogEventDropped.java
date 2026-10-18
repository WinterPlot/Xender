package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class LogEventDropped {
    private static final LogEventDropped c = new a().build();
    private final long a;
    private final Reason b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum Reason implements com.google.firebase.encoders.proto.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private long a = 0;
        private Reason b = Reason.REASON_UNKNOWN;

        public LogEventDropped build() {
            return new LogEventDropped(this.a, this.b);
        }

        public a setEventsDroppedCount(long j) {
            this.a = j;
            return this;
        }

        public a setReason(Reason reason) {
            this.b = reason;
            return this;
        }
    }

    public LogEventDropped(long j, Reason reason) {
        this.a = j;
        this.b = reason;
    }

    public static LogEventDropped getDefaultInstance() {
        return c;
    }

    public static a newBuilder() {
        return new a();
    }

    public long getEventsDroppedCount() {
        return this.a;
    }

    public Reason getReason() {
        return this.b;
    }
}
