package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.i2;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class SurfaceViewStretchedQuirk implements i2 {
    private static boolean isLenovoTablet() {
        return "LENOVO".equalsIgnoreCase(Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isOppoFoldable() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isSamsungFold2OrFold3() {
        if (!"SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            return false;
        }
        String str = Build.DEVICE;
        return "F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str);
    }

    public static boolean load() {
        if (Build.VERSION.SDK_INT < 33) {
            return isSamsungFold2OrFold3() || isOppoFoldable() || isLenovoTablet();
        }
        return false;
    }
}
