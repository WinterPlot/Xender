package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class d implements androidx.work.z {
    private final Handler a = androidx.core.os.g.createAsync(Looper.getMainLooper());

    @Override // androidx.work.z
    public void cancel(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    public Handler getHandler() {
        return this.a;
    }

    @Override // androidx.work.z
    public void scheduleWithDelay(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
