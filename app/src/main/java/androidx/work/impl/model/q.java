package androidx.work.impl.model;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {
    private final String a;
    private final int b;

    public q(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public static /* synthetic */ q copy$default(q qVar, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = qVar.a;
        }
        if ((i2 & 2) != 0) {
            i = qVar.b;
        }
        return qVar.copy(str, i);
    }

    public final String component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final q copy(String str, int i) {
        str.getClass();
        return new q(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.y.areEqual(this.a, qVar.a) && this.b == qVar.b;
    }

    public final int getGeneration() {
        return this.b;
    }

    public final String getWorkSpecId() {
        return this.a;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return defpackage.a.q(sb, this.b, ')');
    }
}
