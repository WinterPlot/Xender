package androidx.navigation;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class x {
    private final e1<Object> a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final Object e;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private e1<Object> a;
        private boolean b;
        private Object c;
        private boolean d;
        private boolean e;

        public final x build() {
            e1<Object> e1VarInferFromValueType = this.a;
            if (e1VarInferFromValueType == null) {
                e1VarInferFromValueType = e1.c.inferFromValueType(this.c);
                e1VarInferFromValueType.getClass();
            }
            return new x(e1VarInferFromValueType, this.b, this.c, this.d, this.e);
        }

        public final a setDefaultValue(Object obj) {
            this.c = obj;
            this.d = true;
            return this;
        }

        public final a setIsNullable(boolean z) {
            this.b = z;
            return this;
        }

        public final <T> a setType(e1<T> e1Var) {
            e1Var.getClass();
            this.a = e1Var;
            return this;
        }

        public final a setUnknownDefaultValuePresent$navigation_common_release(boolean z) {
            this.e = z;
            return this;
        }
    }

    public x(e1<Object> e1Var, boolean z, Object obj, boolean z2, boolean z3) {
        e1Var.getClass();
        if (!e1Var.isNullableAllowed() && z) {
            androidx.media3.extractor.mp3.d.d(e1Var.getName(), " does not allow nullable values");
            throw null;
        }
        if (!z && z2 && obj == null) {
            androidx.media3.extractor.mp3.d.h("Argument with type ", e1Var.getName(), " has null value but is not nullable.");
            throw null;
        }
        this.a = e1Var;
        this.b = z;
        this.e = obj;
        this.c = z2 || z3;
        this.d = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.b != xVar.b || this.c != xVar.c || !kotlin.jvm.internal.y.areEqual(this.a, xVar.a)) {
                return false;
            }
            Object obj2 = this.e;
            Object obj3 = xVar.e;
            if (obj2 != null) {
                return kotlin.jvm.internal.y.areEqual(obj2, obj3);
            }
            if (obj3 == null) {
                return true;
            }
        }
        return false;
    }

    public final Object getDefaultValue() {
        return this.e;
    }

    public final e1<Object> getType() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean isDefaultValuePresent() {
        return this.c;
    }

    public final boolean isDefaultValueUnknown$navigation_common_release() {
        return this.d;
    }

    public final boolean isNullable() {
        return this.b;
    }

    public final void putDefaultValue(String str, Bundle bundle) {
        Object obj;
        str.getClass();
        bundle.getClass();
        if (!this.c || (obj = this.e) == null) {
            return;
        }
        this.a.put(bundle, str, obj);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(kotlin.jvm.internal.f0.getOrCreateKotlinClass(x.class).getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.e);
        }
        return sb.toString();
    }

    public final boolean verify(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        if (!this.b) {
            Bundle bundleM930constructorimpl = androidx.savedstate.c.m930constructorimpl(bundle);
            if (androidx.savedstate.c.m931containsimpl(bundleM930constructorimpl, str) && androidx.savedstate.c.m1009isNullimpl(bundleM930constructorimpl, str)) {
                return false;
            }
        }
        try {
            this.a.get(bundle, str);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
