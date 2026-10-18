package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
class x {
    private static final y a;
    static final Property<View, Float> b;
    static final Property<View, Rect> c;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new c0();
        } else {
            a = new b0();
        }
        b = new a(Float.class, "translationAlpha");
        c = new b(Rect.class, "clipBounds");
    }

    private x() {
    }

    public static void clearNonTransitionAlpha(View view) {
        a.clearNonTransitionAlpha(view);
    }

    public static float getTransitionAlpha(View view) {
        return a.getTransitionAlpha(view);
    }

    public static void saveNonTransitionAlpha(View view) {
        a.saveNonTransitionAlpha(view);
    }

    public static void setAnimationMatrix(View view, Matrix matrix) {
        a.setAnimationMatrix(view, matrix);
    }

    public static void setLeftTopRightBottom(View view, int i, int i2, int i3, int i4) {
        a.setLeftTopRightBottom(view, i, i2, i3, i4);
    }

    public static void setTransitionAlpha(View view, float f) {
        a.setTransitionAlpha(view, f);
    }

    public static void setTransitionVisibility(View view, int i) {
        a.setTransitionVisibility(view, i);
    }

    public static void transformMatrixToGlobal(View view, Matrix matrix) {
        a.transformMatrixToGlobal(view, matrix);
    }

    public static void transformMatrixToLocal(View view, Matrix matrix) {
        a.transformMatrixToLocal(view, matrix);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(x.getTransitionAlpha(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            x.setTransitionAlpha(view, f.floatValue());
        }
    }
}
