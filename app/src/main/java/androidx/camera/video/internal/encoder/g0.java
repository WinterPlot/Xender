package androidx.camera.video.internal.encoder;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class g0 implements h0 {
    @Override // androidx.camera.video.internal.encoder.h0
    public long realtimeUs() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // androidx.camera.video.internal.encoder.h0
    public long uptimeUs() {
        return System.nanoTime() / 1000;
    }
}
