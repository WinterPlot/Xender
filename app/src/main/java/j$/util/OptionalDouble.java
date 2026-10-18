package j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public final class OptionalDouble {
    public static final OptionalDouble c = new OptionalDouble();
    public final boolean a;
    public final double b;

    public OptionalDouble() {
        this.a = false;
        this.b = Double.NaN;
    }

    public static OptionalDouble empty() {
        return c;
    }

    public static OptionalDouble of(double d) {
        return new OptionalDouble(d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalDouble)) {
            return false;
        }
        OptionalDouble optionalDouble = (OptionalDouble) obj;
        boolean z = optionalDouble.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return Double.compare(this.b, optionalDouble.b) == 0;
        }
        return z2 == z;
    }

    public double getAsDouble() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public boolean isPresent() {
        return this.a;
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.b + "]";
    }

    public OptionalDouble(double d) {
        this.a = true;
        this.b = d;
    }
}
