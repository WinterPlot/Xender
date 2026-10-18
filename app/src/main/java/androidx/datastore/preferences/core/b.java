package androidx.datastore.preferences.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final AtomicBoolean a;

    public b(boolean z) {
        this.a = new AtomicBoolean(z);
    }

    public final boolean get() {
        return this.a.get();
    }

    public final void set(boolean z) {
        this.a.set(z);
    }
}
