package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final AtomicInteger a;

    public c(int i) {
        this.a = new AtomicInteger(i);
    }

    public final int decrementAndGet() {
        return this.a.decrementAndGet();
    }

    public final int get() {
        return this.a.get();
    }

    public final int getAndIncrement() {
        return this.a.getAndIncrement();
    }

    public final int incrementAndGet() {
        return this.a.incrementAndGet();
    }

    public /* synthetic */ c(int i, int i2, r rVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
