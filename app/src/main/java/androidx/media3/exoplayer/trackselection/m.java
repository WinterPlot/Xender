package androidx.media3.exoplayer.trackselection;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final int a;
    private final l[] b;
    private int c;

    public m(l... lVarArr) {
        this.b = lVarArr;
        this.a = lVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((m) obj).b);
    }

    public l get(int i) {
        return this.b[i];
    }

    public l[] getAll() {
        return (l[]) this.b.clone();
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = 527 + Arrays.hashCode(this.b);
        this.c = iHashCode;
        return iHashCode;
    }
}
