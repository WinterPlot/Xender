package androidx.activity;

import android.app.Notification;
import android.hardware.camera2.MultiResolutionImageReader;
import android.os.Build;
import android.window.BackEvent;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ int a() {
        int i = Build.VERSION.SDK_INT;
        return i < 36 ? i * 100000 : Build.VERSION.SDK_INT_FULL;
    }

    public static /* synthetic */ Notification.ProgressStyle b() {
        return new Notification.ProgressStyle();
    }

    public static /* synthetic */ MultiResolutionImageReader c(Set set, int i, int i2, long j) {
        return new MultiResolutionImageReader(set, i, i2, j);
    }

    public static /* synthetic */ BackEvent d(float f, float f2, float f3, int i, long j) {
        return new BackEvent(f, f2, f3, i, j);
    }
}
