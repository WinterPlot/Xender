package androidx.window.layout;

import android.graphics.Rect;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {
    private final androidx.window.core.b a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(Rect rect) {
        this(new androidx.window.core.b(rect));
        rect.getClass();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !y.areEqual(s.class, obj.getClass())) {
            return false;
        }
        return y.areEqual(this.a, ((s) obj).a);
    }

    public final Rect getBounds() {
        return this.a.toRect();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + getBounds() + " }";
    }

    public s(androidx.window.core.b bVar) {
        bVar.getClass();
        this.a = bVar;
    }
}
