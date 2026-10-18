package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class g0 {
    public final String a;

    public g0(String str) {
        this.a = str;
    }

    public String toString() {
        return defpackage.a.r(new StringBuilder("<"), this.a, '>');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T unbox(Object obj) {
        if (obj == this) {
            return null;
        }
        return obj;
    }
}
