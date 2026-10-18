package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class g0 implements g {
    @Override // androidx.media3.common.util.g
    public p createHandler(Looper looper, Handler.Callback callback) {
        return new h0(new Handler(looper, callback));
    }

    @Override // androidx.media3.common.util.g
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // androidx.media3.common.util.g
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // androidx.media3.common.util.g
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // androidx.media3.common.util.g
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // androidx.media3.common.util.g
    public void onThreadBlocked() {
    }
}
