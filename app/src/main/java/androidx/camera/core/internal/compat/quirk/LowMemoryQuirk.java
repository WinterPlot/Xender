package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.i2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class LowMemoryQuirk implements i2 {
    private static final Set<String> b = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    public static boolean load() {
        return b.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
