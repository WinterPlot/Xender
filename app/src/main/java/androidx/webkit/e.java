package androidx.webkit;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import okhttp3.b0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private final List<b> a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private boolean g;
    private int h;
    private boolean i;

    private e(List<b> list, String str, String str2, String str3, String str4, String str5, boolean z, int i, boolean z2) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = i;
        this.i = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.g == eVar.g && this.h == eVar.h && this.i == eVar.i && Objects.equals(this.a, eVar.a) && Objects.equals(this.b, eVar.b) && Objects.equals(this.c, eVar.c) && Objects.equals(this.d, eVar.d) && Objects.equals(this.e, eVar.e) && Objects.equals(this.f, eVar.f);
    }

    public String getArchitecture() {
        return this.e;
    }

    public int getBitness() {
        return this.h;
    }

    public List<b> getBrandVersionList() {
        return this.a;
    }

    public String getFullVersion() {
        return this.b;
    }

    public String getModel() {
        return this.f;
    }

    public String getPlatform() {
        return this.c;
    }

    public String getPlatformVersion() {
        return this.d;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), Integer.valueOf(this.h), Boolean.valueOf(this.i));
    }

    public boolean isMobile() {
        return this.g;
    }

    public boolean isWow64() {
        return this.i;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        private final String a;
        private final String b;
        private final String c;

        private b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && Objects.equals(this.c, bVar.c);
        }

        public String getBrand() {
            return this.a;
        }

        public String getFullVersion() {
            return this.c;
        }

        public String getMajorVersion() {
            return this.b;
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b, this.c);
        }

        public String toString() {
            return this.a + "," + this.b + "," + this.c;
        }

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static final class a {
            private String a;
            private String b;
            private String c;

            public a(b bVar) {
                this.a = bVar.getBrand();
                this.b = bVar.getMajorVersion();
                this.c = bVar.getFullVersion();
            }

            public b build() {
                String str;
                String str2;
                String str3 = this.a;
                if (str3 != null && !str3.trim().isEmpty() && (str = this.b) != null && !str.trim().isEmpty() && (str2 = this.c) != null && !str2.trim().isEmpty()) {
                    return new b(this.a, this.b, this.c);
                }
                j0.g("Brand name, major version and full version should not be null or blank.");
                return null;
            }

            public a setBrand(String str) {
                if (str.trim().isEmpty()) {
                    b0.i("Brand should not be blank.");
                    return null;
                }
                this.a = str;
                return this;
            }

            public a setFullVersion(String str) {
                if (str.trim().isEmpty()) {
                    b0.i("FullVersion should not be blank.");
                    return null;
                }
                this.c = str;
                return this;
            }

            public a setMajorVersion(String str) {
                if (str.trim().isEmpty()) {
                    b0.i("MajorVersion should not be blank.");
                    return null;
                }
                this.b = str;
                return this;
            }

            public a() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c {
        private List<b> a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private boolean g;
        private int h;
        private boolean i;

        public c(e eVar) {
            this.a = new ArrayList();
            this.g = true;
            this.h = 0;
            this.i = false;
            this.a = eVar.getBrandVersionList();
            this.b = eVar.getFullVersion();
            this.c = eVar.getPlatform();
            this.d = eVar.getPlatformVersion();
            this.e = eVar.getArchitecture();
            this.f = eVar.getModel();
            this.g = eVar.isMobile();
            this.h = eVar.getBitness();
            this.i = eVar.isWow64();
        }

        public e build() {
            return new e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public c setArchitecture(String str) {
            this.e = str;
            return this;
        }

        public c setBitness(int i) {
            this.h = i;
            return this;
        }

        public c setBrandVersionList(List<b> list) {
            this.a = list;
            return this;
        }

        public c setFullVersion(String str) {
            if (str == null) {
                this.b = null;
                return this;
            }
            if (str.trim().isEmpty()) {
                b0.i("Full version should not be blank.");
                return null;
            }
            this.b = str;
            return this;
        }

        public c setMobile(boolean z) {
            this.g = z;
            return this;
        }

        public c setModel(String str) {
            this.f = str;
            return this;
        }

        public c setPlatform(String str) {
            if (str == null) {
                this.c = null;
                return this;
            }
            if (str.trim().isEmpty()) {
                b0.i("Platform should not be blank.");
                return null;
            }
            this.c = str;
            return this;
        }

        public c setPlatformVersion(String str) {
            this.d = str;
            return this;
        }

        public c setWow64(boolean z) {
            this.i = z;
            return this;
        }

        public c() {
            this.a = new ArrayList();
            this.g = true;
            this.h = 0;
            this.i = false;
        }
    }
}
