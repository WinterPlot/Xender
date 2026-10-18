package androidx.camera.video;

import j$.util.Objects;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public static final b f;
    private static final e0 g;
    private static final h1 h;
    private final e0 a;
    private final int b;
    private final int c;
    private final int d;
    private final String e;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private int b;
        private int c;
        private e0 a = h1.f.getQUALITY_SELECTOR_UNSPECIFIED();
        private int d = -1;
        private String e = "video/*";

        public final h1 build() {
            return new h1(this.a, this.b, this.c, this.d, this.e);
        }

        public final a setAspectRatio(int i) {
            this.d = i;
            return this;
        }

        public final a setBitrate(int i) {
            this.c = i;
            return this;
        }

        public final a setEncodeFrameRate(int i) {
            this.b = i;
            return this;
        }

        public final a setMimeType(String str) {
            str.getClass();
            this.e = str;
            return this;
        }

        public final a setQualitySelector(e0 e0Var) {
            e0Var.getClass();
            this.a = e0Var;
            return this;
        }
    }

    static {
        b bVar = new b(null);
        f = bVar;
        e0 e0Var = e0.c;
        e0Var.getClass();
        g = e0Var;
        h = bVar.builder().build();
    }

    public /* synthetic */ h1(e0 e0Var, int i, int i2, int i3, String str, int i4, r rVar) {
        this((i4 & 1) != 0 ? g : e0Var, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3, (i4 & 16) != 0 ? "video/*" : str);
    }

    public static final a builder() {
        return f.builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return kotlin.jvm.internal.y.areEqual(this.a, h1Var.a) && this.b == h1Var.b && this.c == h1Var.c && this.d == h1Var.d && kotlin.jvm.internal.y.areEqual(this.e, h1Var.e);
    }

    public final int getAspectRatio() {
        return this.d;
    }

    public final int getBitrate() {
        return this.c;
    }

    public final int getEncodeFrameRate() {
        return this.b;
    }

    public final String getMimeType() {
        return this.e;
    }

    public final e0 getQualitySelector() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e);
    }

    public final a toBuilder() {
        return new a().setQualitySelector(this.a).setEncodeFrameRate(this.b).setBitrate(this.c).setAspectRatio(this.d).setMimeType(this.e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.a);
        sb.append(", encodeFrameRate=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", aspectRatio=");
        sb.append(this.d);
        sb.append(", mimeType=");
        return defpackage.a.r(sb, this.e, '}');
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        public /* synthetic */ b(r rVar) {
            this();
        }

        public final a builder() {
            return new a();
        }

        public final h1 getDEFAULT() {
            return h1.h;
        }

        public final e0 getQUALITY_SELECTOR_UNSPECIFIED() {
            return h1.g;
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(e0 e0Var) {
        this(e0Var, 0, 0, 0, null, 30, null);
        e0Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(e0 e0Var, int i) {
        this(e0Var, i, 0, 0, null, 28, null);
        e0Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(e0 e0Var, int i, int i2) {
        this(e0Var, i, i2, 0, null, 24, null);
        e0Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(e0 e0Var, int i, int i2, int i3) {
        this(e0Var, i, i2, i3, null, 16, null);
        e0Var.getClass();
    }

    public h1(e0 e0Var, int i, int i2, int i3, String str) {
        e0Var.getClass();
        str.getClass();
        this.a = e0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public h1() {
        this(null, 0, 0, 0, null, 31, null);
    }
}
