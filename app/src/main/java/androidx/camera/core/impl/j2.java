package androidx.camera.core.impl;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class j2 {
    private final boolean a;
    private final Set<Class<? extends i2>> b;
    private final Set<Class<? extends i2>> c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        private boolean a = true;
        private Set<Class<? extends i2>> b;
        private Set<Class<? extends i2>> c;

        public j2 build() {
            return new j2(this.a, this.b, this.c);
        }

        public b forceDisableQuirks(Set<Class<? extends i2>> set) {
            this.c = new HashSet(set);
            return this;
        }

        public b forceEnableQuirks(Set<Class<? extends i2>> set) {
            this.b = new HashSet(set);
            return this;
        }

        public b setEnabledWhenDeviceHasQuirk(boolean z) {
            this.a = z;
            return this;
        }
    }

    private j2(boolean z, Set<Class<? extends i2>> set, Set<Class<? extends i2>> set2) {
        this.a = z;
        this.b = set == null ? Collections.EMPTY_SET : new HashSet<>(set);
        this.c = set2 == null ? Collections.EMPTY_SET : new HashSet<>(set2);
    }

    public static j2 withAllQuirksDisabled() {
        return new b().setEnabledWhenDeviceHasQuirk(false).build();
    }

    public static j2 withDefaultBehavior() {
        return new b().setEnabledWhenDeviceHasQuirk(true).build();
    }

    public static j2 withQuirksForceDisabled(Set<Class<? extends i2>> set) {
        return new b().forceDisableQuirks(set).build();
    }

    public static j2 withQuirksForceEnabled(Set<Class<? extends i2>> set) {
        return new b().forceEnableQuirks(set).build();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j2)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        j2 j2Var = (j2) obj;
        return this.a == j2Var.a && Objects.equals(this.b, j2Var.b) && Objects.equals(this.c, j2Var.c);
    }

    public Set<Class<? extends i2>> getForceDisabledQuirks() {
        return DesugarCollections.unmodifiableSet(this.c);
    }

    public Set<Class<? extends i2>> getForceEnabledQuirks() {
        return DesugarCollections.unmodifiableSet(this.b);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }

    public boolean isEnabledWhenDeviceHasQuirk() {
        return this.a;
    }

    public boolean shouldEnableQuirk(Class<? extends i2> cls, boolean z) {
        if (this.b.contains(cls)) {
            return true;
        }
        return !this.c.contains(cls) && this.a && z;
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.c + '}';
    }
}
