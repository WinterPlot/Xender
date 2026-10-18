package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface j0 {
    long getDurationUs();

    a getSeekPoints(long j);

    boolean isEstimated();

    boolean isSeekable();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public final k0 a;
        public final k0 b;

        public a(k0 k0Var, k0 k0Var2) {
            this.a = (k0) com.google.common.base.m.checkNotNull(k0Var);
            this.b = (k0) com.google.common.base.m.checkNotNull(k0Var2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.a);
            if (this.a.equals(this.b)) {
                str = "";
            } else {
                str = ", " + this.b;
            }
            return androidx.camera.camera2.pipe.w.t(sb, str, "]");
        }

        public a(k0 k0Var) {
            this(k0Var, k0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    /* JADX INFO: loaded from: classes3.dex */
    public static class b implements j0 {
        private final long a;
        private final a b;

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? k0.c : new k0(0L, j2));
        }

        @Override // androidx.media3.extractor.j0
        public long getDurationUs() {
            return this.a;
        }

        @Override // androidx.media3.extractor.j0
        public a getSeekPoints(long j) {
            return this.b;
        }

        @Override // androidx.media3.extractor.j0
        public boolean isEstimated() {
            return false;
        }

        @Override // androidx.media3.extractor.j0
        public boolean isSeekable() {
            return false;
        }

        public b(long j) {
            this(j, 0L);
        }
    }
}
