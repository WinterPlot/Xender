package androidx.navigation.internal;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private final AtomicInteger a;

    public a(int i) {
        this.a = new AtomicInteger(i);
    }

    public final int decrementAndGet$navigation_runtime_release() {
        return this.a.decrementAndGet();
    }

    public final int get$navigation_runtime_release() {
        return this.a.get();
    }

    public final int incrementAndGet$navigation_runtime_release() {
        return this.a.incrementAndGet();
    }
}
