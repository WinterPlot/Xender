package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class d {
    private static boolean a;
    private static final Class<?> b = getClassForName("libcore.io.Memory");
    private static final boolean c;

    static {
        c = (a || getClassForName("org.robolectric.Robolectric") == null) ? false : true;
    }

    private d() {
    }

    private static <T> Class<T> getClassForName(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> getMemoryClass() {
        return b;
    }

    public static boolean isOnAndroidDevice() {
        if (a) {
            return true;
        }
        return (b == null || c) ? false : true;
    }
}
