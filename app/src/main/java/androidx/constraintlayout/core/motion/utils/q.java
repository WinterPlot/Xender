package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class q {
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;

    public void getState(MotionWidget motionWidget) {
        this.b = motionWidget.getLeft();
        this.c = motionWidget.getTop();
        this.d = motionWidget.getRight();
        this.e = motionWidget.getBottom();
        this.a = (int) motionWidget.getRotationZ();
    }

    public int height() {
        return this.e - this.c;
    }

    public int width() {
        return this.d - this.b;
    }
}
