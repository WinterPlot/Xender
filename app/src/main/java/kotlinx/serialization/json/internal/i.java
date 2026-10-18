package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class i {
    private final kotlin.collections.k<char[]> a = new kotlin.collections.k<>();
    private int b;

    public final void releaseImpl(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            try {
                if (this.b + cArr.length < g.a) {
                    this.b += cArr.length;
                    this.a.addLast(cArr);
                }
                kotlin.y yVar = kotlin.y.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final char[] take(int i) {
        char[] cArrRemoveLastOrNull;
        synchronized (this) {
            cArrRemoveLastOrNull = this.a.removeLastOrNull();
            if (cArrRemoveLastOrNull != null) {
                this.b -= cArrRemoveLastOrNull.length;
            } else {
                cArrRemoveLastOrNull = null;
            }
        }
        return cArrRemoveLastOrNull == null ? new char[i] : cArrRemoveLastOrNull;
    }
}
