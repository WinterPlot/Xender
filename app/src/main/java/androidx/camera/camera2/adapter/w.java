package androidx.camera.camera2.adapter;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.m0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements m0 {
    private final boolean a;
    private final int b;
    private final Range<Integer> c;
    private final Rational d;

    public w(boolean z, int i, Range<Integer> range, Rational rational) {
        range.getClass();
        rational.getClass();
        this.a = z;
        this.b = i;
        this.c = range;
        this.d = rational;
    }

    private final boolean component1() {
        return this.a;
    }

    private final int component2() {
        return this.b;
    }

    private final Range<Integer> component3() {
        return this.c;
    }

    private final Rational component4() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ w copy$default(w wVar, boolean z, int i, Range range, Rational rational, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = wVar.a;
        }
        if ((i2 & 2) != 0) {
            i = wVar.b;
        }
        if ((i2 & 4) != 0) {
            range = wVar.c;
        }
        if ((i2 & 8) != 0) {
            rational = wVar.d;
        }
        return wVar.copy(z, i, range, rational);
    }

    public final w copy(boolean z, int i, Range<Integer> range, Rational rational) {
        range.getClass();
        rational.getClass();
        return new w(z, i, range, rational);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a == wVar.a && this.b == wVar.b && kotlin.jvm.internal.y.areEqual(this.c, wVar.c) && kotlin.jvm.internal.y.areEqual(this.d, wVar.d);
    }

    @Override // androidx.camera.core.m0
    public int getExposureCompensationIndex() {
        return this.b;
    }

    @Override // androidx.camera.core.m0
    public Range<Integer> getExposureCompensationRange() {
        return this.c;
    }

    @Override // androidx.camera.core.m0
    public Rational getExposureCompensationStep() {
        return this.d;
    }

    public int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((((this.a ? 1231 : 1237) * 31) + this.b) * 31)) * 31);
    }

    @Override // androidx.camera.core.m0
    public boolean isExposureCompensationSupported() {
        return this.a;
    }

    public String toString() {
        return "EvCompValue(supported=" + this.a + ", index=" + this.b + ", range=" + this.c + ", step=" + this.d + ')';
    }

    public final w updateIndex$camera_camera2(int i) {
        return copy$default(this, false, i, null, null, 13, null);
    }
}
