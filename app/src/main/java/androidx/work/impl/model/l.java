package androidx.work.impl.model;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public final String a;
    private final int b;
    public final int c;

    public l(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public static /* synthetic */ l copy$default(l lVar, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = lVar.a;
        }
        if ((i3 & 2) != 0) {
            i = lVar.b;
        }
        if ((i3 & 4) != 0) {
            i2 = lVar.c;
        }
        return lVar.copy(str, i, i2);
    }

    public final String component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final l copy(String str, int i, int i2) {
        str.getClass();
        return new l(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.y.areEqual(this.a, lVar.a) && this.b == lVar.b && this.c == lVar.c;
    }

    public final int getGeneration() {
        return this.b;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return defpackage.a.q(sb, this.c, ')');
    }
}
