package androidx.work.impl.model;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    private final String a;
    private final Long b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z) {
        this(str, Long.valueOf(z ? 1L : 0L));
        str.getClass();
    }

    public static /* synthetic */ d copy$default(d dVar, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.a;
        }
        if ((i & 2) != 0) {
            l = dVar.b;
        }
        return dVar.copy(str, l);
    }

    public final String component1() {
        return this.a;
    }

    public final Long component2() {
        return this.b;
    }

    public final d copy(String str, Long l) {
        str.getClass();
        return new d(str, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.y.areEqual(this.a, dVar.a) && kotlin.jvm.internal.y.areEqual(this.b, dVar.b);
    }

    public final String getKey() {
        return this.a;
    }

    public final Long getValue() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }

    public d(String str, Long l) {
        str.getClass();
        this.a = str;
        this.b = l;
    }
}
