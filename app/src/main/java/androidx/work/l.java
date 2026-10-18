package androidx.work;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    private static final String a;

    static {
        String strTagWithPrefix = p.tagWithPrefix("InputMerger");
        strTagWithPrefix.getClass();
        a = strTagWithPrefix;
    }

    public static final j fromClassName(String str) {
        str.getClass();
        try {
            Object objNewInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            return (j) objNewInstance;
        } catch (Exception e) {
            p.get().error(a, "Trouble instantiating " + str, e);
            return null;
        }
    }
}
