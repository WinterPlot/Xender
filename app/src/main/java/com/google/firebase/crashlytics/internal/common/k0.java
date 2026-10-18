package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 {
    private final AtomicInteger a = new AtomicInteger();
    private final AtomicInteger b = new AtomicInteger();

    public int getDroppedOnDemandExceptions() {
        return this.b.get();
    }

    public int getRecordedOnDemandExceptions() {
        return this.a.get();
    }

    public void incrementDroppedOnDemandExceptions() {
        this.b.getAndIncrement();
    }

    public void incrementRecordedOnDemandExceptions() {
        this.a.getAndIncrement();
    }

    public void resetDroppedOnDemandExceptions() {
        this.b.set(0);
    }
}
