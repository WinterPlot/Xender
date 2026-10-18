package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.util.Size;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final Rect a;
    private final Size b;
    private final Size c;

    public b(Rect rect, Size size, Size size2) {
        rect.getClass();
        size.getClass();
        size2.getClass();
        this.a = rect;
        this.b = size;
        this.c = size2;
    }

    public static /* synthetic */ b copy$default(b bVar, Rect rect, Size size, Size size2, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = bVar.a;
        }
        if ((i & 2) != 0) {
            size = bVar.b;
        }
        if ((i & 4) != 0) {
            size2 = bVar.c;
        }
        return bVar.copy(rect, size, size2);
    }

    public final Rect component1() {
        return this.a;
    }

    public final Size component2() {
        return this.b;
    }

    public final Size component3() {
        return this.c;
    }

    public final b copy(Rect rect, Size size, Size size2) {
        rect.getClass();
        size.getClass();
        size2.getClass();
        return new b(rect, size, size2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return y.areEqual(this.a, bVar.a) && y.areEqual(this.b, bVar.b) && y.areEqual(this.c, bVar.c);
    }

    public final Size getChildSizeToScale() {
        return this.b;
    }

    public final Rect getCropRectBeforeScaling() {
        return this.a;
    }

    public final Size getOriginalSelectedChildSize() {
        return this.c;
    }

    public int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.a + ", childSizeToScale=" + this.b + ", originalSelectedChildSize=" + this.c + ')';
    }
}
