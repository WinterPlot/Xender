package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
class z extends y {
    private static boolean g = true;
    private static boolean h = true;
    private static boolean i = true;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private a() {
        }

        public static void setAnimationMatrix(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        public static void transformMatrixToGlobal(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        public static void transformMatrixToLocal(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // androidx.transition.y
    public void setAnimationMatrix(View view, Matrix matrix) {
        if (g) {
            try {
                a.setAnimationMatrix(view, matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }

    @Override // androidx.transition.y
    public void transformMatrixToGlobal(View view, Matrix matrix) {
        if (h) {
            try {
                a.transformMatrixToGlobal(view, matrix);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    @Override // androidx.transition.y
    public void transformMatrixToLocal(View view, Matrix matrix) {
        if (i) {
            try {
                a.transformMatrixToLocal(view, matrix);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }
}
