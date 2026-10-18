package androidx.camera.core.processing.util;

import androidx.camera.camera2.pipe.w;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class a extends d {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends d.a {
        private String a;
        private String b;
        private String c;
        private String d;

        @Override // androidx.camera.core.processing.util.d.a
        public d build() {
            String strConcat = this.a == null ? " glVersion" : "";
            if (this.b == null) {
                strConcat = strConcat.concat(" eglVersion");
            }
            if (this.c == null) {
                strConcat = strConcat.concat(" glExtensions");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" eglExtensions");
            }
            if (strConcat.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d);
            }
            j0.g("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // androidx.camera.core.processing.util.d.a
        public d.a setEglExtensions(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            com.google.gson.internal.a.j("Null eglExtensions");
            return null;
        }

        @Override // androidx.camera.core.processing.util.d.a
        public d.a setEglVersion(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            com.google.gson.internal.a.j("Null eglVersion");
            return null;
        }

        @Override // androidx.camera.core.processing.util.d.a
        public d.a setGlExtensions(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            com.google.gson.internal.a.j("Null glExtensions");
            return null;
        }

        @Override // androidx.camera.core.processing.util.d.a
        public d.a setGlVersion(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            com.google.gson.internal.a.j("Null glVersion");
            return null;
        }
    }

    private a(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.a.equals(dVar.getGlVersion()) && this.b.equals(dVar.getEglVersion()) && this.c.equals(dVar.getGlExtensions()) && this.d.equals(dVar.getEglExtensions())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.util.d
    public String getEglExtensions() {
        return this.d;
    }

    @Override // androidx.camera.core.processing.util.d
    public String getEglVersion() {
        return this.b;
    }

    @Override // androidx.camera.core.processing.util.d
    public String getGlExtensions() {
        return this.c;
    }

    @Override // androidx.camera.core.processing.util.d
    public String getGlVersion() {
        return this.a;
    }

    public int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return w.t(sb, this.d, "}");
    }
}
