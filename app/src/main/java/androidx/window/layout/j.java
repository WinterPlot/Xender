package androidx.window.layout;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface j extends e {
    @Override // androidx.window.layout.e
    /* synthetic */ Rect getBounds();

    a getOcclusionType();

    b getOrientation();

    c getState();

    boolean isSeparating();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public static final C0293a b = new C0293a(null);
        public static final a c = new a("NONE");
        public static final a d = new a("FULL");
        private final String a;

        private a(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }

        /* JADX INFO: renamed from: androidx.window.layout.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static final class C0293a {
            public /* synthetic */ C0293a(kotlin.jvm.internal.r rVar) {
                this();
            }

            private C0293a() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        public static final a b = new a(null);
        public static final b c = new b("VERTICAL");
        public static final b d = new b("HORIZONTAL");
        private final String a;

        private b(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.r rVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c {
        public static final a b = new a(null);
        public static final c c = new c("FLAT");
        public static final c d = new c("HALF_OPENED");
        private final String a;

        private c(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.r rVar) {
                this();
            }

            private a() {
            }
        }
    }
}
