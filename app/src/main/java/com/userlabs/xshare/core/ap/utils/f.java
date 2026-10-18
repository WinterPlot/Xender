package com.userlabs.xshare.core.ap.utils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements g.a {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ CountDownLatch b;

    public /* synthetic */ f(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
        this.a = atomicBoolean;
        this.b = countDownLatch;
    }

    @Override // com.userlabs.xshare.core.ap.utils.g.a
    public final void onResult(boolean z) {
        g.lambda$connectByReflectAPIThrowExcWhenFailed$0(this.a, this.b, z);
    }
}
