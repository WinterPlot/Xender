package androidx.core.util;

import androidx.camera.core.impl.y2;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class e<F, S> {
    public final F a;
    public final S b;

    public e(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public static <A, B> e<A, B> create(A a, B b) {
        return new e<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d.equals(eVar.a, this.a) && d.equals(eVar.b, this.b);
    }

    public int hashCode() {
        F f = this.a;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.a);
        sb.append(" ");
        return y2.A(sb, this.b, "}");
    }
}
