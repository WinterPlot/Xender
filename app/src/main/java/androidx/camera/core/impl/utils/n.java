package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    private static volatile Handler a;

    private n() {
    }

    public static Handler getInstance() {
        if (a != null) {
            return a;
        }
        synchronized (n.class) {
            try {
                if (a == null) {
                    a = androidx.core.os.g.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }
}
