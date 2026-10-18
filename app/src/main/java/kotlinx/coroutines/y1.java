package kotlinx.coroutines;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class y1 extends f0 {
    public abstract y1 getImmediate();

    @Override // kotlinx.coroutines.f0
    public f0 limitedParallelism(int i, String str) {
        kotlinx.coroutines.internal.p.checkParallelism(i);
        return kotlinx.coroutines.internal.p.namedOrThis(this, str);
    }

    @Override // kotlinx.coroutines.f0
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        return l0.getClassSimpleName(this) + '@' + l0.getHexAddress(this);
    }

    public final String toStringInternalImpl() {
        y1 immediate;
        y1 main = v0.getMain();
        if (this == main) {
            return "Dispatchers.Main";
        }
        try {
            immediate = main.getImmediate();
        } catch (UnsupportedOperationException unused) {
            immediate = null;
        }
        if (this == immediate) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
