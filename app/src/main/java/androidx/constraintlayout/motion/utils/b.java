package androidx.constraintlayout.motion.utils;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;

    public void getState(View view) {
        this.b = view.getLeft();
        this.c = view.getTop();
        this.d = view.getRight();
        this.e = view.getBottom();
        this.a = view.getRotation();
    }

    public int height() {
        return this.e - this.c;
    }

    public int width() {
        return this.d - this.b;
    }
}
