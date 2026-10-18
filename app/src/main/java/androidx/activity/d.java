package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static final a f = new a(null);
    private final float a;
    private final float b;
    private final float c;
    private final int d;
    private final long e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        backEvent.getClass();
    }

    public final long getFrameTimeMillis() {
        return this.e;
    }

    public final float getProgress() {
        return this.c;
    }

    public final int getSwipeEdge() {
        return this.d;
    }

    public final float getTouchX() {
        return this.a;
    }

    public final float getTouchY() {
        return this.b;
    }

    public final BackEvent toBackEvent() {
        if (Build.VERSION.SDK_INT >= 36) {
            c.c();
            return b.d(this.a, this.b, this.c, this.d, this.e);
        }
        c.c();
        return c.b(this.a, this.b, this.c, this.d);
    }

    public final androidx.navigationevent.b toNavigationEvent() {
        float f2 = this.a;
        float f3 = this.b;
        return new androidx.navigationevent.b(this.d, this.c, f2, f3, this.e);
    }

    public String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        private a() {
        }
    }

    public d(float f2, float f3, float f4, int i, long j) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = i;
        this.e = j;
    }

    public /* synthetic */ d(float f2, float f3, float f4, int i, long j, int i2, r rVar) {
        this(f2, f3, f4, i, (i2 & 16) != 0 ? 0L : j);
    }

    public d(float f2, float f3, float f4, int i) {
        this(f2, f3, f4, i, 0L, 16, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(androidx.navigationevent.b bVar) {
        this(bVar.getTouchX(), bVar.getTouchY(), bVar.getProgress(), bVar.getSwipeEdge(), bVar.getFrameTimeMillis());
        bVar.getClass();
    }
}
