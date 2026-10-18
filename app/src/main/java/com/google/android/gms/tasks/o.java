package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class o<T> implements p<T> {
    private final CountDownLatch a = new CountDownLatch(1);

    private o() {
    }

    @Override // com.google.android.gms.tasks.p, com.google.android.gms.tasks.d
    public final void onCanceled() {
        this.a.countDown();
    }

    @Override // com.google.android.gms.tasks.p, com.google.android.gms.tasks.f
    public final void onFailure(Exception exc) {
        this.a.countDown();
    }

    @Override // com.google.android.gms.tasks.p, com.google.android.gms.tasks.g
    public final void onSuccess(T t) {
        this.a.countDown();
    }

    public final void zza() throws InterruptedException {
        this.a.await();
    }

    public final boolean zzb(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.a.await(j, timeUnit);
    }

    public /* synthetic */ o(byte[] bArr) {
    }
}
