package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class c implements b, a {
    private final e a;
    private final int b;
    private final TimeUnit c;
    private CountDownLatch e;
    private final Object d = new Object();
    private boolean f = false;

    public c(e eVar, int i, TimeUnit timeUnit) {
        this.a = eVar;
        this.b = i;
        this.c = timeUnit;
    }

    public boolean isCallbackReceived() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void logEvent(String str, Bundle bundle) {
        synchronized (this.d) {
            try {
                com.google.firebase.crashlytics.internal.f.getLogger().v("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.e = new CountDownLatch(1);
                this.f = false;
                this.a.logEvent(str, bundle);
                com.google.firebase.crashlytics.internal.f.getLogger().v("Awaiting app exception callback from Analytics...");
                try {
                    if (this.e.await(this.b, this.c)) {
                        this.f = true;
                        com.google.firebase.crashlytics.internal.f.getLogger().v("App exception callback received from Analytics listener.");
                    } else {
                        com.google.firebase.crashlytics.internal.f.getLogger().w("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    com.google.firebase.crashlytics.internal.f.getLogger().e("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void onEvent(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
