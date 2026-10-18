package com.apm.insight.j;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Runnable {
    private Handler a;
    private final long b = 0;
    private final long c;

    public a(Handler handler, long j) {
        this.a = handler;
        this.c = j;
    }

    public final void a(long j) {
        Handler handler = this.a;
        if (j > 0) {
            handler.postDelayed(this, j);
        } else {
            handler.post(this);
        }
    }

    public final long b() {
        return this.c;
    }

    public final void a() {
        this.a.post(this);
    }
}
