package androidx.window.layout;

import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {
    private final List<e> a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(List<? extends e> list) {
        list.getClass();
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !y.areEqual(r.class, obj.getClass())) {
            return false;
        }
        return y.areEqual(this.a, ((r) obj).a);
    }

    public final List<e> getDisplayFeatures() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return g0.joinToString$default(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
