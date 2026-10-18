package com.userlabs.xshare.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class RevealView extends FrameLayout {
    private Context a;
    private Drawable b;
    private final Paint c;
    private int d;
    private float e;
    private ObjectAnimator f;
    private final Rect g;
    private int h;
    private int i;
    private int j;

    public RevealView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.c = paint;
        this.g = new Rect();
        this.i = 0;
        this.j = 0;
        setWillNotDraw(false);
        this.a = context;
        this.h = -1;
        this.d = -1;
        this.b = new ColorDrawable(0);
        paint.setColor(this.d);
    }

    private float getRadius() {
        return this.e;
    }

    public void dismiss(Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "radius", this.e, 0.0f);
        this.f = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f.setDuration(300L);
        this.f.start();
        this.f.addListener(animatorListener);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.b.draw(canvas);
        canvas.drawCircle(this.i, this.j, this.e, this.c);
        super.draw(canvas);
    }

    public void getLocation(View view) {
        view.getLocationInWindow(new int[2]);
        setPointXY((view.getWidth() / 2) + view.getLeft(), (view.getHeight() / 2) + view.getTop());
    }

    public int getPaintColor() {
        return this.d;
    }

    public boolean isShowing() {
        return getRadius() > 0.0f;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g.set(this.i, this.j, i, i2);
        this.b.setBounds(this.g);
    }

    public void setPaintColor(int i) {
        this.d = i;
        this.c.setColor(i);
        invalidate();
    }

    public void setPointXY(int i, int i2) {
        this.i = i;
        this.j = i2;
    }

    public void setRadius(float f) {
        this.e = f;
        invalidate();
    }

    public void show(RevealView revealView, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        int width = getWidth();
        int height = getHeight();
        setPointXY(width / 2, height / 2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(revealView, "radius", 0.0f, (float) (Math.sqrt(Math.pow(height, 2.0d) + Math.pow(width, 2.0d)) / 2.0d));
        this.f = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f.setDuration(300L);
        this.f.start();
        this.f.addListener(animatorListener);
    }
}
