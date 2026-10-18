package androidx.media3.common;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final e0 d = new e0(1.0f);
    private static final String e = androidx.media3.common.util.n0.intToStringMaxRadix(0);
    private static final String f = androidx.media3.common.util.n0.intToStringMaxRadix(1);
    public final float a;
    public final float b;
    private final int c;

    public e0(float f2, float f3) {
        com.google.common.base.m.checkArgument(f2 > 0.0f);
        com.google.common.base.m.checkArgument(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public static e0 fromBundle(Bundle bundle) {
        return new e0(bundle.getFloat(e, 1.0f), bundle.getFloat(f, 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            e0 e0Var = (e0) obj;
            if (this.a == e0Var.a && this.b == e0Var.b) {
                return true;
            }
        }
        return false;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j) {
        return j * ((long) this.c);
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(e, this.a);
        bundle.putFloat(f, this.b);
        return bundle;
    }

    public String toString() {
        return androidx.media3.common.util.n0.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.a), Float.valueOf(this.b));
    }

    public e0 withPitch(float f2) {
        return new e0(this.a, f2);
    }

    public e0 withSpeed(float f2) {
        return new e0(f2, this.b);
    }

    public e0(float f2) {
        this(f2, 1.0f);
    }
}
