package com.google.android.datatransport.runtime.backends;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BackendResponse {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static BackendResponse fatalError() {
        return new b(Status.FATAL_ERROR, -1L);
    }

    public static BackendResponse invalidPayload() {
        return new b(Status.INVALID_PAYLOAD, -1L);
    }

    public static BackendResponse ok(long j) {
        return new b(Status.OK, j);
    }

    public static BackendResponse transientError() {
        return new b(Status.TRANSIENT_ERROR, -1L);
    }

    public abstract long getNextRequestWaitMillis();

    public abstract Status getStatus();
}
