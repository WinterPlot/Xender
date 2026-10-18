package kotlin;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Comparable<h> {
    public static final a e = new a(null);
    public static final h f = i.get();
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public h(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = versionOf(i, i2, i3);
    }

    private final int versionOf(int i, int i2, int i3) {
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(h hVar) {
        hVar.getClass();
        return this.d - hVar.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h hVar = obj instanceof h ? (h) obj : null;
        return hVar != null && this.d == hVar.d;
    }

    public final int getMajor() {
        return this.a;
    }

    public final int getMinor() {
        return this.b;
    }

    public final int getPatch() {
        return this.c;
    }

    public int hashCode() {
        return this.d;
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4 = this.a;
        if (i4 > i) {
            return true;
        }
        if (i4 != i) {
            return false;
        }
        int i5 = this.b;
        if (i5 <= i2) {
            return i5 == i2 && this.c >= i3;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.r rVar) {
            this();
        }

        private a() {
        }
    }

    public h(int i, int i2) {
        this(i, i2, 0);
    }

    public final boolean isAtLeast(int i, int i2) {
        int i3 = this.a;
        if (i3 <= i) {
            return i3 == i && this.b >= i2;
        }
        return true;
    }
}
