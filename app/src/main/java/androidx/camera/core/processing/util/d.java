package androidx.camera.core.processing.util;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        public abstract d build();

        public abstract a setEglExtensions(String str);

        public abstract a setEglVersion(String str);

        public abstract a setGlExtensions(String str);

        public abstract a setGlVersion(String str);
    }

    public static a builder() {
        return new androidx.camera.core.processing.util.a.b().setGlVersion("0.0").setEglVersion("0.0").setGlExtensions("").setEglExtensions("");
    }

    public abstract String getEglExtensions();

    public abstract String getEglVersion();

    public abstract String getGlExtensions();

    public abstract String getGlVersion();
}
