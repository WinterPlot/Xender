package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class xm {
    private final AtomicInteger a = new AtomicInteger();

    public final int zza() {
        return this.a.get();
    }

    public final void zzb() {
        this.a.incrementAndGet();
    }
}
