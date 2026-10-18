package androidx.camera.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public static final l0 c = new l0(0, 0);
    public static final l0 d = new l0(1, 8);
    public static final l0 e = new l0(2, 10);
    public static final l0 f = new l0(3, 10);
    public static final l0 g = new l0(4, 10);
    public static final l0 h = new l0(5, 10);
    public static final l0 i = new l0(6, 10);
    public static final l0 j = new l0(6, 8);
    private final int a;
    private final int b;

    public l0(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    private static String getEncodingLabel(int i2) {
        switch (i2) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            if (this.a == l0Var.getEncoding() && this.b == l0Var.getBitDepth()) {
                return true;
            }
        }
        return false;
    }

    public int getBitDepth() {
        return this.b;
    }

    public int getEncoding() {
        return this.a;
    }

    public int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public boolean is10BitHdr() {
        return isFullySpecified() && getEncoding() != 1 && getBitDepth() == 10;
    }

    public boolean isFullySpecified() {
        return (getEncoding() == 0 || getEncoding() == 2 || getBitDepth() == 0) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        sb.append(getEncodingLabel(this.a));
        sb.append(", bitDepth=");
        return defpackage.a.s(sb, "}", this.b);
    }
}
