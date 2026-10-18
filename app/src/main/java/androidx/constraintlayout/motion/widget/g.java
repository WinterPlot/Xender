package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
abstract class g extends e {
    protected static final float SELECTION_SLOPE = 20.0f;
    int mCurveFit = e.UNSET;

    public abstract void calcPosition(int i, int i2, float f, float f2, float f3, float f4);

    public abstract float getPositionX();

    public abstract float getPositionY();

    public abstract boolean intersects(int i, int i2, RectF rectF, RectF rectF2, float f, float f2);

    public abstract void positionAttributes(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr);

    @Override // androidx.constraintlayout.motion.widget.e
    public void getAttributeNames(HashSet<String> hashSet) {
    }
}
