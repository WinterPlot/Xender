package androidx.camera.camera2.impl;

import android.graphics.Point;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public static final int area(Size size) {
        size.getClass();
        return size.getHeight() * size.getWidth();
    }

    public static final Size asLandscape(Size size) {
        size.getClass();
        return size.getWidth() >= size.getHeight() ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static final Size asPortrait(Size size) {
        size.getClass();
        return size.getWidth() <= size.getHeight() ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static final Size maxByArea(Size size, Size size2) {
        size.getClass();
        size2.getClass();
        return area(size) > area(size2) ? size : size2;
    }

    public static final Size minByArea(Size size, Size size2) {
        size.getClass();
        size2.getClass();
        return area(size) < area(size2) ? size : size2;
    }

    public static final Size toSize(Point point) {
        point.getClass();
        return new Size(point.x, point.y);
    }

    public static final int area(Point point) {
        point.getClass();
        return point.x * point.y;
    }
}
