package com.google.firebase.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements i.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TimeUnit d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(h hVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = hVar;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.i.c
    public final ScheduledFuture addCompleter(i.b bVar) {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                long j = this.c;
                TimeUnit timeUnit = this.d;
                return this.b.lambda$schedule$2((Runnable) obj, j, timeUnit, bVar);
            default:
                long j2 = this.c;
                TimeUnit timeUnit2 = this.d;
                return this.b.lambda$schedule$5((Callable) obj, j2, timeUnit2, bVar);
        }
    }
}
