package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c e = new c(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private a() {
        }

        public static Insets of(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    private c(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static c add(c cVar, c cVar2) {
        return of(cVar.a + cVar2.a, cVar.b + cVar2.b, cVar.c + cVar2.c, cVar.d + cVar2.d);
    }

    public static c max(c cVar, c cVar2) {
        return of(Math.max(cVar.a, cVar2.a), Math.max(cVar.b, cVar2.b), Math.max(cVar.c, cVar2.c), Math.max(cVar.d, cVar2.d));
    }

    public static c min(c cVar, c cVar2) {
        return of(Math.min(cVar.a, cVar2.a), Math.min(cVar.b, cVar2.b), Math.min(cVar.c, cVar2.c), Math.min(cVar.d, cVar2.d));
    }

    public static c of(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new c(i, i2, i3, i4);
    }

    public static c subtract(c cVar, c cVar2) {
        return of(cVar.a - cVar2.a, cVar.b - cVar2.b, cVar.c - cVar2.c, cVar.d - cVar2.d);
    }

    public static c toCompatInsets(Insets insets) {
        return of(insets.left, insets.top, insets.right, insets.bottom);
    }

    @Deprecated
    public static c wrap(Insets insets) {
        return toCompatInsets(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.a == cVar.a && this.c == cVar.c && this.b == cVar.b;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public Insets toPlatformInsets() {
        return a.of(this.a, this.b, this.c, this.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return defpackage.a.q(sb, this.d, '}');
    }

    public static c of(Rect rect) {
        return of(rect.left, rect.top, rect.right, rect.bottom);
    }
}
