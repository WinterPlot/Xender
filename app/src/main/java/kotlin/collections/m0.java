package kotlin.collections;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0<T> {
    private final int a;
    private final T b;

    public m0(int i, T t) {
        this.a = i;
        this.b = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m0 copy$default(m0 m0Var, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = m0Var.a;
        }
        if ((i2 & 2) != 0) {
            obj = m0Var.b;
        }
        return m0Var.copy(i, obj);
    }

    public final int component1() {
        return this.a;
    }

    public final T component2() {
        return this.b;
    }

    public final m0<T> copy(int i, T t) {
        return new m0<>(i, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.a == m0Var.a && kotlin.jvm.internal.y.areEqual(this.b, m0Var.b);
    }

    public final int getIndex() {
        return this.a;
    }

    public final T getValue() {
        return this.b;
    }

    public int hashCode() {
        int i = this.a * 31;
        T t = this.b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
