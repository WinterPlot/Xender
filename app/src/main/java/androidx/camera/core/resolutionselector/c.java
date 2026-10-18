package androidx.camera.core.resolutionselector;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final androidx.camera.core.resolutionselector.a a;
    private final d b;
    private final b c;
    private final int d;

    public c(androidx.camera.core.resolutionselector.a aVar, d dVar, b bVar, int i) {
        this.a = aVar;
        this.b = dVar;
        this.c = bVar;
        this.d = i;
    }

    public int getAllowedResolutionMode() {
        return this.d;
    }

    public androidx.camera.core.resolutionselector.a getAspectRatioStrategy() {
        return this.a;
    }

    public b getResolutionFilter() {
        return this.c;
    }

    public d getResolutionStrategy() {
        return this.b;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private androidx.camera.core.resolutionselector.a a;
        private d b;
        private b c;
        private int d;

        private a(c cVar) {
            this.a = androidx.camera.core.resolutionselector.a.c;
            this.b = null;
            this.c = null;
            this.d = 0;
            this.a = cVar.getAspectRatioStrategy();
            this.b = cVar.getResolutionStrategy();
            this.c = cVar.getResolutionFilter();
            this.d = cVar.getAllowedResolutionMode();
        }

        public static a fromResolutionSelector(c cVar) {
            return new a(cVar);
        }

        public c build() {
            return new c(this.a, this.b, this.c, this.d);
        }

        public a setAllowedResolutionMode(int i) {
            this.d = i;
            return this;
        }

        public a setAspectRatioStrategy(androidx.camera.core.resolutionselector.a aVar) {
            this.a = aVar;
            return this;
        }

        public a setResolutionFilter(b bVar) {
            this.c = bVar;
            return this;
        }

        public a setResolutionStrategy(d dVar) {
            this.b = dVar;
            return this;
        }

        public a() {
            this.a = androidx.camera.core.resolutionselector.a.c;
            this.b = null;
            this.c = null;
            this.d = 0;
        }
    }
}
