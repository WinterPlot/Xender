package androidx.media3.common;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    private static final HashSet<String> a = new HashSet<>();
    private static String b = "media3.common";

    private y() {
    }

    public static synchronized void registerModule(String str) {
        if (a.add(str)) {
            b += ", " + str;
        }
    }

    public static synchronized String registeredModules() {
        return b;
    }
}
