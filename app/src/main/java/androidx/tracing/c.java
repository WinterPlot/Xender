package androidx.tracing;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    private static final AtomicLong a = new AtomicLong(42);

    public static final AtomicLong getId() {
        return a;
    }

    public static final long monotonicId() {
        return a.incrementAndGet();
    }
}
