package j$.util;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends RuntimeException {
    public static void a(Object obj, String str) {
        throw new g("Unsupported " + str + " :" + obj);
    }
}
