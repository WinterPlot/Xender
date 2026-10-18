package com.userlabs.xshare.views.drag;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.userlabs.xshare.core.utils.s;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDragFloatLayout extends FrameLayout {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final int f;

    public BaseDragFloatLayout(Context context) {
        super(context);
        addChildrenViews(context);
        this.f = s.dip2px(5.0f);
    }

    private boolean isDragEvent() {
        if (this.a) {
            return true;
        }
        return (getX() == ((float) this.f) || getX() == ((float) ((this.e - getWidth()) - this.f))) ? false : true;
    }

    private void moveHide(int i) {
        if (i >= this.e / 2) {
            animate().setInterpolator(new DecelerateInterpolator()).setDuration(500L).xBy(((this.e - getWidth()) - getX()) - this.f).start();
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "x", getX(), this.f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
    }

    public abstract void addChildrenViews(Context context);

    public int getInitDragMarginPx() {
        return this.f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            setPressed(true);
            this.a = false;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.b = rawX;
            this.c = rawY;
            if (getParent() != null) {
                ViewGroup viewGroup = (ViewGroup) getParent();
                this.d = viewGroup.getHeight();
                this.e = viewGroup.getWidth();
            }
        } else if (action != 1) {
            if (action == 2) {
                if (this.d <= 0.2d || this.e <= 0.2d) {
                    this.a = false;
                } else {
                    this.a = true;
                    int i = rawX - this.b;
                    int i2 = rawY - this.c;
                    if (((int) Math.sqrt((i2 * i2) + (i * i))) <= 10) {
                        this.a = false;
                    } else {
                        float x = getX() + i;
                        float y = getY() + i2;
                        if (x < 0.0f) {
                            x = 0.0f;
                        } else if (x > this.e - getWidth()) {
                            x = this.e - getWidth();
                        }
                        if (getY() < 0.0f) {
                            y = 0.0f;
                        } else {
                            float y2 = getY() + getHeight();
                            int i3 = this.d;
                            if (y2 > i3) {
                                y = i3 - getHeight();
                            }
                        }
                        setX(x);
                        if (y > this.d - getHeight()) {
                            y = this.d - getHeight();
                        }
                        setY(y);
                        this.b = rawX;
                        this.c = rawY;
                    }
                }
            }
        } else if (isDragEvent()) {
            setPressed(false);
            moveHide(rawX);
        }
        return isDragEvent() || super.onTouchEvent(motionEvent);
    }

    public BaseDragFloatLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addChildrenViews(context);
        this.f = s.dip2px(5.0f);
    }
}
