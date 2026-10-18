package kotlin.text;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private final String a;
    private final kotlin.ranges.l b;

    public m(String str, kotlin.ranges.l lVar) {
        str.getClass();
        lVar.getClass();
        this.a = str;
        this.b = lVar;
    }

    public static /* synthetic */ m copy$default(m mVar, String str, kotlin.ranges.l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mVar.a;
        }
        if ((i & 2) != 0) {
            lVar = mVar.b;
        }
        return mVar.copy(str, lVar);
    }

    public final String component1() {
        return this.a;
    }

    public final kotlin.ranges.l component2() {
        return this.b;
    }

    public final m copy(String str, kotlin.ranges.l lVar) {
        str.getClass();
        lVar.getClass();
        return new m(str, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.y.areEqual(this.a, mVar.a) && kotlin.jvm.internal.y.areEqual(this.b, mVar.b);
    }

    public final kotlin.ranges.l getRange() {
        return this.b;
    }

    public final String getValue() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
