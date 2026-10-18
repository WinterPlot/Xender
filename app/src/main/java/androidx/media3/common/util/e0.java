package androidx.media3.common.util;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final e0 c = new e0(-1, -1);
    public static final e0 d = new e0(0, 0);
    private static final String e = n0.intToStringMaxRadix(0);
    private static final String f = n0.intToStringMaxRadix(1);
    private final int a;
    private final int b;

    public e0(int i, int i2) {
        com.google.common.base.m.checkArgument((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public static e0 fromBundle(Bundle bundle) {
        return new e0(bundle.getInt(e, -1), bundle.getInt(f, -1));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.a == e0Var.a && this.b == e0Var.b) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.a;
    }

    public int hashCode() {
        int i = this.b;
        int i2 = this.a;
        return ((i2 >>> 16) | (i2 << 16)) ^ i;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putInt(f, this.b);
        return bundle;
    }

    public String toString() {
        return this.a + "x" + this.b;
    }
}
