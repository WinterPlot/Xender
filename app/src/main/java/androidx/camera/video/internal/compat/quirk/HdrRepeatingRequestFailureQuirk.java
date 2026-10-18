package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.i2;
import androidx.camera.core.l0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class HdrRepeatingRequestFailureQuirk implements i2 {
    private static boolean isSamsungS25Ultra() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "pa3q".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean load() {
        return isSamsungS25Ultra();
    }

    public boolean workaroundBySurfaceProcessing(l0 l0Var) {
        return isSamsungS25Ultra() && (l0Var != l0.d);
    }
}
