package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class u {
    p c;
    boolean a = false;
    boolean b = false;
    RectF d = new RectF();
    final Path e = new Path();

    public static u create(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new w(view) : new v(view);
    }

    private boolean isMaskBoundsValid() {
        RectF rectF = this.d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    private void updateShapePath() {
        if (!isMaskBoundsValid() || this.c == null) {
            return;
        }
        q.getInstance().calculatePath(this.c, 1.0f, this.d, this.e);
    }

    public abstract void invalidateClippingMethod(View view);

    public boolean isForceCompatClippingEnabled() {
        return this.a;
    }

    public void maybeClip(Canvas canvas, com.google.android.material.canvas.a.InterfaceC0569a interfaceC0569a) {
        if (!shouldUseCompatClipping() || this.e.isEmpty()) {
            interfaceC0569a.run(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.e);
        interfaceC0569a.run(canvas);
        canvas.restore();
    }

    public void onMaskChanged(View view, RectF rectF) {
        this.d = rectF;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    public void onShapeAppearanceChanged(View view, p pVar) {
        this.c = pVar;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    public void setForceCompatClippingEnabled(View view, boolean z) {
        if (z != this.a) {
            this.a = z;
            invalidateClippingMethod(view);
        }
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(View view, boolean z) {
        this.b = z;
        invalidateClippingMethod(view);
    }

    public abstract boolean shouldUseCompatClipping();
}
