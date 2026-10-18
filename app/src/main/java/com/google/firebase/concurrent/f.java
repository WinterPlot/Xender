package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements i.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ f(h hVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = hVar;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.i.c
    public final ScheduledFuture addCompleter(i.b bVar) {
        switch (this.a) {
            case 0:
                return this.b.lambda$scheduleAtFixedRate$8(this.c, this.d, this.e, this.f, bVar);
            default:
                return this.b.lambda$scheduleWithFixedDelay$11(this.c, this.d, this.e, this.f, bVar);
        }
    }
}
