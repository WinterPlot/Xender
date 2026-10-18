package androidx.work.impl.utils;

import android.os.PowerManager;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
final class c0 {
    public static final c0 a = new c0();
    private static final WeakHashMap<PowerManager.WakeLock, String> b = new WeakHashMap<>();

    private c0() {
    }

    public final WeakHashMap<PowerManager.WakeLock, String> getWakeLocks() {
        return b;
    }
}
