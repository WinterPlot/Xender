package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class u1 {
    private final a a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.camera.core.u1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static abstract class AbstractC0090a {
            public abstract a build();

            public abstract AbstractC0090a setCropRect(Rect rect);

            public abstract AbstractC0090a setResolution(Size size);

            public abstract AbstractC0090a setRotationDegrees(int i);
        }

        public abstract Rect getCropRect();

        public abstract Size getResolution();

        public abstract int getRotationDegrees();
    }

    public u1(Size size, Rect rect, int i) {
        this.a = new i.b().setResolution(size).setCropRect(rect).setRotationDegrees(i).build();
    }

    public boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public Rect getCropRect() {
        return this.a.getCropRect();
    }

    public Size getResolution() {
        return this.a.getResolution();
    }

    public int getRotationDegrees() {
        return this.a.getRotationDegrees();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
