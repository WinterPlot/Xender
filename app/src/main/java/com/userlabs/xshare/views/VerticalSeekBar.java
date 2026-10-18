package com.userlabs.xshare.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSeekBar;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class VerticalSeekBar extends AppCompatSeekBar {
    private boolean b;

    public VerticalSeekBar(Context context) {
        super(context);
        this.b = false;
    }

    private boolean isWithinThumb(MotionEvent motionEvent) {
        float progress = getProgress();
        float f = getResources().getDisplayMetrics().density;
        float height = getHeight();
        float y = motionEvent.getY();
        float max = getMax();
        float f2 = f * 25.0f;
        return progress >= max - ((float) ((int) (((y + f2) * max) / height))) && progress <= max - ((float) ((int) (((y - f2) * max) / height)));
    }

    public boolean ismIsMovingThumb() {
        return this.b;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.rotate(-90.0f);
        canvas.translate(-getHeight(), 0.0f);
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i2, i, i4, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r0 != 3) goto L23;
     */
    @Override // android.widget.AbsSeekBar, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.b) {
                        int max = getMax();
                        setProgress(max - ((int) ((motionEvent.getY() * max) / getHeight())));
                        return true;
                    }
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            this.b = false;
            return true;
        }
        if (isWithinThumb(motionEvent)) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.b = true;
            return true;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        super.setProgress(i);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
    }
}
