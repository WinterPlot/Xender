package com.xd.webserver.response.factory;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    private final int a;
    private final int b;
    private final AtomicInteger c = new AtomicInteger(0);

    public a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int getType() {
        return this.a;
    }

    public int threadCounterDecrement() {
        return this.c.decrementAndGet();
    }

    public boolean threadCounterIncrementAndCheck() {
        return this.c.incrementAndGet() <= this.b;
    }
}
