package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.m;
import androidx.constraintlayout.core.motion.utils.n;
import androidx.constraintlayout.core.state.f;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class MotionWidget implements n {
    public static final int FILL_PARENT = -1;
    public static final int GONE_UNSET = Integer.MIN_VALUE;
    private static final int INTERNAL_MATCH_CONSTRAINT = -3;
    private static final int INTERNAL_MATCH_PARENT = -1;
    private static final int INTERNAL_WRAP_CONTENT = -2;
    private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
    public static final int INVISIBLE = 0;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int MATCH_PARENT = -1;
    public static final int PARENT_ID = 0;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int UNSET = -1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 4;
    public static final int WRAP_CONTENT = -2;
    a mMotion;
    private float mProgress;
    b mPropertySet;
    float mTransitionPathRotate;
    f mWidgetFrame;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        public String a = null;
        public int b = 0;
        public String c = null;
        public int d = -1;
        public int e = 0;
        public float f = Float.NaN;
        public int g = -1;
        public float h = Float.NaN;
        public float i = Float.NaN;
        public int j = -1;
        public String k = null;
        public int l = -3;
        public int m = -1;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        public int a = 4;
        public int b = 0;
        public float c = 1.0f;
        public float d = Float.NaN;
    }

    public MotionWidget(f fVar) {
        this.mWidgetFrame = new f();
        this.mMotion = new a();
        this.mPropertySet = new b();
        this.mWidgetFrame = fVar;
    }

    public MotionWidget findViewById(int i) {
        return null;
    }

    public float getAlpha() {
        return this.mWidgetFrame.p;
    }

    public int getBottom() {
        return this.mWidgetFrame.e;
    }

    public androidx.constraintlayout.core.motion.a getCustomAttribute(String str) {
        return this.mWidgetFrame.getCustomAttribute(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.mWidgetFrame.getCustomAttributeNames();
    }

    public int getHeight() {
        f fVar = this.mWidgetFrame;
        return fVar.e - fVar.c;
    }

    @Override // androidx.constraintlayout.core.motion.utils.n
    public int getId(String str) {
        int iK = m.k(str);
        if (iK != -1) {
            return iK;
        }
        switch (str) {
            case "AnimateCircleAngleTo":
                return 606;
            case "QuantizeMotionPhase":
                return 602;
            case "QuantizeMotionSteps":
                return 610;
            case "PathRotate":
                return 601;
            case "QuantizeInterpolator":
                return 604;
            case "DrawPath":
                return 608;
            case "Stagger":
                return 600;
            case "PolarRelativeTo":
                return 609;
            case "QuantizeInterpolatorType":
                return 611;
            case "QuantizeInterpolatorID":
                return 612;
            case "TransitionEasing":
                return 603;
            case "AnimateRelativeTo":
                return 605;
            case "PathMotionArc":
                return 607;
            default:
                return -1;
        }
    }

    public int getLeft() {
        return this.mWidgetFrame.b;
    }

    public String getName() {
        return this.mWidgetFrame.getId();
    }

    public MotionWidget getParent() {
        return null;
    }

    public float getPivotX() {
        return this.mWidgetFrame.f;
    }

    public float getPivotY() {
        return this.mWidgetFrame.g;
    }

    public int getRight() {
        return this.mWidgetFrame.d;
    }

    public float getRotationX() {
        return this.mWidgetFrame.h;
    }

    public float getRotationY() {
        return this.mWidgetFrame.i;
    }

    public float getRotationZ() {
        return this.mWidgetFrame.j;
    }

    public float getScaleX() {
        return this.mWidgetFrame.n;
    }

    public float getScaleY() {
        return this.mWidgetFrame.o;
    }

    public int getTop() {
        return this.mWidgetFrame.c;
    }

    public float getTranslationX() {
        return this.mWidgetFrame.k;
    }

    public float getTranslationY() {
        return this.mWidgetFrame.l;
    }

    public float getTranslationZ() {
        return this.mWidgetFrame.m;
    }

    public float getValueAttributes(int i) {
        switch (i) {
            case MotionKeyTrigger.TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS /* 303 */:
                return this.mWidgetFrame.p;
            case MotionKeyTrigger.TYPE_POST_LAYOUT /* 304 */:
                return this.mWidgetFrame.k;
            case MotionKeyTrigger.TYPE_TRIGGER_SLACK /* 305 */:
                return this.mWidgetFrame.l;
            case MotionKeyTrigger.TYPE_TRIGGER_COLLISION_VIEW /* 306 */:
                return this.mWidgetFrame.m;
            case MotionKeyTrigger.TYPE_TRIGGER_COLLISION_ID /* 307 */:
            default:
                return Float.NaN;
            case MotionKeyTrigger.TYPE_TRIGGER_ID /* 308 */:
                return this.mWidgetFrame.h;
            case MotionKeyTrigger.TYPE_POSITIVE_CROSS /* 309 */:
                return this.mWidgetFrame.i;
            case MotionKeyTrigger.TYPE_NEGATIVE_CROSS /* 310 */:
                return this.mWidgetFrame.j;
            case MotionKeyTrigger.TYPE_TRIGGER_RECEIVER /* 311 */:
                return this.mWidgetFrame.n;
            case MotionKeyTrigger.TYPE_CROSS /* 312 */:
                return this.mWidgetFrame.o;
            case 313:
                return this.mWidgetFrame.f;
            case 314:
                return this.mWidgetFrame.g;
            case 315:
                return this.mProgress;
            case 316:
                return this.mTransitionPathRotate;
        }
    }

    public int getVisibility() {
        return this.mPropertySet.a;
    }

    public f getWidgetFrame() {
        return this.mWidgetFrame;
    }

    public int getWidth() {
        f fVar = this.mWidgetFrame;
        return fVar.d - fVar.b;
    }

    public int getX() {
        return this.mWidgetFrame.b;
    }

    public int getY() {
        return this.mWidgetFrame.c;
    }

    public void layout(int i, int i2, int i3, int i4) {
        setBounds(i, i2, i3, i4);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        f fVar = this.mWidgetFrame;
        if (fVar == null) {
            fVar = new f((ConstraintWidget) null);
            this.mWidgetFrame = fVar;
        }
        fVar.c = i2;
        fVar.b = i;
        fVar.d = i3;
        fVar.e = i4;
    }

    public void setCustomAttribute(String str, int i, float f) {
        this.mWidgetFrame.setCustomAttribute(str, i, f);
    }

    public void setInterpolatedValue(CustomAttribute customAttribute, float[] fArr) {
        this.mWidgetFrame.setCustomAttribute(customAttribute.b, 901, fArr[0]);
    }

    public void setPivotX(float f) {
        this.mWidgetFrame.f = f;
    }

    public void setPivotY(float f) {
        this.mWidgetFrame.g = f;
    }

    public void setRotationX(float f) {
        this.mWidgetFrame.h = f;
    }

    public void setRotationY(float f) {
        this.mWidgetFrame.i = f;
    }

    public void setRotationZ(float f) {
        this.mWidgetFrame.j = f;
    }

    public void setScaleX(float f) {
        this.mWidgetFrame.n = f;
    }

    public void setScaleY(float f) {
        this.mWidgetFrame.o = f;
    }

    public void setTranslationX(float f) {
        this.mWidgetFrame.k = f;
    }

    public void setTranslationY(float f) {
        this.mWidgetFrame.l = f;
    }

    public void setTranslationZ(float f) {
        this.mWidgetFrame.m = f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.n
    public boolean setValue(int i, String str) {
        if (i != 605) {
            return setValueMotion(i, str);
        }
        this.mMotion.a = str;
        return true;
    }

    public boolean setValueAttributes(int i, float f) {
        switch (i) {
            case MotionKeyTrigger.TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS /* 303 */:
                this.mWidgetFrame.p = f;
                return true;
            case MotionKeyTrigger.TYPE_POST_LAYOUT /* 304 */:
                this.mWidgetFrame.k = f;
                return true;
            case MotionKeyTrigger.TYPE_TRIGGER_SLACK /* 305 */:
                this.mWidgetFrame.l = f;
                return true;
            case MotionKeyTrigger.TYPE_TRIGGER_COLLISION_VIEW /* 306 */:
                this.mWidgetFrame.m = f;
                return true;
            case MotionKeyTrigger.TYPE_TRIGGER_COLLISION_ID /* 307 */:
            default:
                return false;
            case MotionKeyTrigger.TYPE_TRIGGER_ID /* 308 */:
                this.mWidgetFrame.h = f;
                return true;
            case MotionKeyTrigger.TYPE_POSITIVE_CROSS /* 309 */:
                this.mWidgetFrame.i = f;
                return true;
            case MotionKeyTrigger.TYPE_NEGATIVE_CROSS /* 310 */:
                this.mWidgetFrame.j = f;
                return true;
            case MotionKeyTrigger.TYPE_TRIGGER_RECEIVER /* 311 */:
                this.mWidgetFrame.n = f;
                return true;
            case MotionKeyTrigger.TYPE_CROSS /* 312 */:
                this.mWidgetFrame.o = f;
                return true;
            case 313:
                this.mWidgetFrame.f = f;
                return true;
            case 314:
                this.mWidgetFrame.g = f;
                return true;
            case 315:
                this.mProgress = f;
                return true;
            case 316:
                this.mTransitionPathRotate = f;
                return true;
        }
    }

    public boolean setValueMotion(int i, int i2) {
        switch (i) {
            case 606:
                this.mMotion.b = i2;
                return true;
            case 607:
                this.mMotion.d = i2;
                return true;
            case 608:
                this.mMotion.e = i2;
                return true;
            case 609:
                this.mMotion.g = i2;
                return true;
            case 610:
                this.mMotion.j = i2;
                return true;
            case 611:
                this.mMotion.l = i2;
                return true;
            case 612:
                this.mMotion.m = i2;
                return true;
            default:
                return false;
        }
    }

    public void setVisibility(int i) {
        this.mPropertySet.a = i;
    }

    public String toString() {
        return this.mWidgetFrame.b + ", " + this.mWidgetFrame.c + ", " + this.mWidgetFrame.d + ", " + this.mWidgetFrame.e;
    }

    public void updateMotion(n nVar) {
        if (this.mWidgetFrame.getMotionProperties() != null) {
            this.mWidgetFrame.getMotionProperties().applyDelta(nVar);
        }
    }

    public void setCustomAttribute(String str, int i, int i2) {
        this.mWidgetFrame.setCustomAttribute(str, i, i2);
    }

    public void setCustomAttribute(String str, int i, boolean z) {
        this.mWidgetFrame.setCustomAttribute(str, i, z);
    }

    public void setCustomAttribute(String str, int i, String str2) {
        this.mWidgetFrame.setCustomAttribute(str, i, str2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.n
    public boolean setValue(int i, int i2) {
        if (setValueAttributes(i, i2)) {
            return true;
        }
        return setValueMotion(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.n
    public boolean setValue(int i, float f) {
        if (setValueAttributes(i, f)) {
            return true;
        }
        return setValueMotion(i, f);
    }

    @Override // androidx.constraintlayout.core.motion.utils.n
    public boolean setValue(int i, boolean z) {
        return false;
    }

    public MotionWidget() {
        this.mWidgetFrame = new f();
        this.mMotion = new a();
        this.mPropertySet = new b();
    }

    public boolean setValueMotion(int i, String str) {
        if (i == 603) {
            this.mMotion.c = str;
            return true;
        }
        if (i != 604) {
            return false;
        }
        this.mMotion.k = str;
        return true;
    }

    public boolean setValueMotion(int i, float f) {
        switch (i) {
            case 600:
                this.mMotion.f = f;
                return true;
            case 601:
                this.mMotion.h = f;
                return true;
            case 602:
                this.mMotion.i = f;
                return true;
            default:
                return false;
        }
    }
}
