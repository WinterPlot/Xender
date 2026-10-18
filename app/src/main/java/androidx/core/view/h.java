package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private final DisplayCutout a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private a() {
        }

        public static DisplayCutout createDisplayCutout(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> getBoundingRects(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int getSafeInsetBottom(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int getSafeInsetLeft(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int getSafeInsetRight(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int getSafeInsetTop(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        private b() {
        }

        public static DisplayCutout createDisplayCutout(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c {
        private c() {
        }

        public static DisplayCutout createDisplayCutout(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        public static Insets getWaterfallInsets(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class d {
        private d() {
        }

        public static Path getCutoutPath(DisplayCutout displayCutout) {
            return displayCutout.getCutoutPath();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class e {
        private e() {
        }

        public static DisplayCutout createDisplayCutout(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2, Path path) {
            DisplayCutout.Builder waterfallInsets = new DisplayCutout.Builder().setSafeInsets(insets).setWaterfallInsets(insets2);
            if (rect != null) {
                waterfallInsets.setBoundingRectLeft(rect);
            }
            if (rect2 != null) {
                waterfallInsets.setBoundingRectTop(rect2);
            }
            if (rect3 != null) {
                waterfallInsets.setBoundingRectRight(rect3);
            }
            if (rect4 != null) {
                waterfallInsets.setBoundingRectBottom(rect4);
            }
            if (path != null) {
                waterfallInsets.setCutoutPath(path);
            }
            return waterfallInsets.build();
        }
    }

    public h(Rect rect, List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? a.createDisplayCutout(rect, list) : null);
    }

    private static DisplayCutout constructDisplayCutout(androidx.core.graphics.c cVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, androidx.core.graphics.c cVar2, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return e.createDisplayCutout(cVar.toPlatformInsets(), rect, rect2, rect3, rect4, cVar2.toPlatformInsets(), path);
        }
        if (i >= 30) {
            return c.createDisplayCutout(cVar.toPlatformInsets(), rect, rect2, rect3, rect4, cVar2.toPlatformInsets());
        }
        if (i >= 29) {
            return b.createDisplayCutout(cVar.toPlatformInsets(), rect, rect2, rect3, rect4);
        }
        if (i < 28) {
            return null;
        }
        Rect rect5 = new Rect(cVar.a, cVar.b, cVar.c, cVar.d);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return a.createDisplayCutout(rect5, arrayList);
    }

    public static h wrap(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new h(displayCutout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return androidx.core.util.d.equals(this.a, ((h) obj).a);
    }

    public List<Rect> getBoundingRects() {
        return Build.VERSION.SDK_INT >= 28 ? a.getBoundingRects(this.a) : Collections.EMPTY_LIST;
    }

    public Path getCutoutPath() {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.getCutoutPath(this.a);
        }
        return null;
    }

    public int getSafeInsetBottom() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.getSafeInsetBottom(this.a);
        }
        return 0;
    }

    public int getSafeInsetLeft() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.getSafeInsetLeft(this.a);
        }
        return 0;
    }

    public int getSafeInsetRight() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.getSafeInsetRight(this.a);
        }
        return 0;
    }

    public int getSafeInsetTop() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.getSafeInsetTop(this.a);
        }
        return 0;
    }

    public androidx.core.graphics.c getWaterfallInsets() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.c.toCompatInsets(c.getWaterfallInsets(this.a)) : androidx.core.graphics.c.e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }

    public DisplayCutout unwrap() {
        return this.a;
    }

    public h(androidx.core.graphics.c cVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, androidx.core.graphics.c cVar2) {
        this(constructDisplayCutout(cVar, rect, rect2, rect3, rect4, cVar2, null));
    }

    public h(androidx.core.graphics.c cVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, androidx.core.graphics.c cVar2, Path path) {
        this(constructDisplayCutout(cVar, rect, rect2, rect3, rect4, cVar2, path));
    }

    private h(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }
}
