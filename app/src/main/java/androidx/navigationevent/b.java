package androidx.navigationevent;

import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final a f = new a(null);
    private final int a;
    private final float b;
    private final float c;
    private final float d;
    private final long e;

    public /* synthetic */ b(int i, float f2, float f3, float f4, long j, int i2, r rVar) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0.0f : f3, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 0L : j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.c == bVar.c && this.d == bVar.d && this.b == bVar.b && this.a == bVar.a && this.e == bVar.e;
        }
        return false;
    }

    public final long getFrameTimeMillis() {
        return this.e;
    }

    public final float getProgress() {
        return this.b;
    }

    public final int getSwipeEdge() {
        return this.a;
    }

    public final float getTouchX() {
        return this.c;
    }

    public final float getTouchY() {
        return this.d;
    }

    public int hashCode() {
        int iFloatToIntBits = (((Float.floatToIntBits(this.b) + ((Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31)) * 31)) * 31) + this.a) * 31;
        long j = this.e;
        return iFloatToIntBits + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        private a() {
        }
    }

    public b(int i) {
        this(i, 0.0f, 0.0f, 0.0f, 0L, 30, null);
    }

    public b(int i, float f2) {
        this(i, f2, 0.0f, 0.0f, 0L, 28, null);
    }

    public b(int i, float f2, float f3) {
        this(i, f2, f3, 0.0f, 0L, 24, null);
    }

    public b(int i, float f2, float f3, float f4) {
        this(i, f2, f3, f4, 0L, 16, null);
    }

    public b(int i, float f2, float f3, float f4, long j) {
        this.a = i;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
    }

    public b() {
        this(0, 0.0f, 0.0f, 0.0f, 0L, 31, null);
    }
}
