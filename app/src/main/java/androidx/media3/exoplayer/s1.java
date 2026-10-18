package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {
    public static final s1 c = new s1(0, false);
    public final int a;
    public final boolean b;

    public s1(boolean z) {
        this.a = 0;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s1.class == obj.getClass()) {
            s1 s1Var = (s1) obj;
            if (this.a == s1Var.a && this.b == s1Var.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }

    public s1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
