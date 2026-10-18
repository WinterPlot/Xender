package androidx.graphics.shapes;

import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final a c;
    public static final c d;
    private final float a;
    private final float b;

    static {
        r rVar = null;
        c = new a(rVar);
        float f = 0.0f;
        d = new c(f, f, 3, rVar);
    }

    public /* synthetic */ c(float f, float f2, int i, r rVar) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    public final float getRadius() {
        return this.a;
    }

    public final float getSmoothing() {
        return this.b;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        private a() {
        }
    }

    public c(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        this(0.0f, 0.0f, 3, null);
    }
}
