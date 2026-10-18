package androidx.camera.core.impl;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class m extends m1 {
    private final Object a;

    public m(Object obj) {
        if (obj != null) {
            this.a = obj;
        } else {
            com.google.gson.internal.a.j("Null value");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            return this.a.equals(((m1) obj).getValue());
        }
        return false;
    }

    @Override // androidx.camera.core.impl.m1
    public Object getValue() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return y2.A(new StringBuilder("Identifier{value="), this.a, "}");
    }
}
