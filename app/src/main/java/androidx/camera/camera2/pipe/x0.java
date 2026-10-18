package androidx.camera.camera2.pipe;

import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {
    private final String a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends x0 {
        public static final b b = new b();

        private b() {
            super("GRAPH_STARTED");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c extends x0 {
        public static final c b = new c();

        private c() {
            super("GRAPH_STARTING");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class d extends x0 {
        public static final d b = new d();

        private d() {
            super("GRAPH_STOPPED");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class e extends x0 {
        public static final e b = new e();

        private e() {
            super("GRAPH_STOPPING");
        }
    }

    public x0(String str) {
        str.getClass();
        this.a = str;
    }

    public String toString() {
        return this.a;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a extends x0 {
        private final int b;
        private final boolean c;

        private a(int i, boolean z) {
            super("GRAPH_ERROR");
            this.b = i;
            this.c = z;
        }

        /* JADX INFO: renamed from: getCameraError-v7Vf74A, reason: not valid java name */
        public final int m865getCameraErrorv7Vf74A() {
            return this.b;
        }

        public final boolean getWillAttemptRetry() {
            return this.c;
        }

        @Override // androidx.camera.camera2.pipe.x0
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("(cameraError=");
            sb.append((Object) p.m733toStringimpl(this.b));
            sb.append(", willAttemptRetry=");
            return defpackage.a.u(sb, this.c, ')');
        }

        public /* synthetic */ a(int i, boolean z, r rVar) {
            this(i, z);
        }
    }
}
