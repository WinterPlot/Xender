package com.userlabs.xshare.views.piechart;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import com.userlabs.xshare.views.piechart.a;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Chart<T extends a<? extends b<? extends d>>> extends ViewGroup implements ValueAnimator.AnimatorUpdateListener {
    protected float a;
    protected float b;
    protected float c;
    protected float d;
    protected T e;
    protected Canvas f;
    protected Paint g;
    protected boolean h;
    protected RectF i;
    private boolean j;
    protected Bitmap k;
    protected Paint l;
    protected float m;
    protected float p;
    private ObjectAnimator v;
    private ObjectAnimator w;
    DecimalFormat x;

    public Chart(Context context) {
        super(context);
        this.a = 12.0f;
        this.b = 12.0f;
        this.c = 12.0f;
        this.d = 12.0f;
        this.e = null;
        this.h = true;
        this.i = new RectF();
        this.j = false;
        this.m = 1.0f;
        this.p = 1.0f;
        this.x = new DecimalFormat("0.00");
        init();
    }

    public void animateXY(int i, int i2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        this.v = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(i2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        this.w = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(i);
        if (i > i2) {
            this.w.addUpdateListener(this);
        } else {
            this.v.addUpdateListener(this);
        }
        this.w.start();
        this.v.start();
    }

    public PointF getCenterOffsets() {
        return new PointF(this.i.centerX(), this.i.centerY());
    }

    public String getPercentOfTotal(float f) {
        float yValueSum = (f / this.e.getYValueSum()) * 100.0f;
        if (f == 0.0f) {
            return "0.00%";
        }
        return this.x.format(yValueSum) + "%";
    }

    public void init() {
        setWillNotDraw(false);
        c.init(getContext().getResources());
        this.d = (int) c.convertDpToPixel(this.d);
        this.a = (int) c.convertDpToPixel(this.a);
        this.c = (int) c.convertDpToPixel(this.c);
        this.b = (int) c.convertDpToPixel(this.b);
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.l = new Paint(4);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.j) {
            this.j = true;
        }
        if (this.k == null || this.f == null) {
            this.k = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
            this.f = new Canvas(this.k);
        }
        this.k.eraseColor(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        prepareContentRect();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        prepareContentRect();
        prepare();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public abstract void prepare();

    public void prepareContentRect() {
        this.i.set(this.a, this.b, getWidth() - this.c, getHeight() - this.d);
    }

    public void setData(T t) {
        if (t == null) {
            Log.e("MPChart", "Cannot set data for chart. Provided data object is null.");
            return;
        }
        this.h = false;
        this.j = false;
        this.e = t;
        prepare();
        Log.i("MPChart", "Data is set.");
    }

    public void calcMinMax(boolean z) {
    }

    public void setPhaseX(float f) {
    }

    public void setPhaseY(float f) {
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 12.0f;
        this.b = 12.0f;
        this.c = 12.0f;
        this.d = 12.0f;
        this.e = null;
        this.h = true;
        this.i = new RectF();
        this.j = false;
        this.m = 1.0f;
        this.p = 1.0f;
        this.x = new DecimalFormat("0.00");
        init();
    }

    public Chart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 12.0f;
        this.b = 12.0f;
        this.c = 12.0f;
        this.d = 12.0f;
        this.e = null;
        this.h = true;
        this.i = new RectF();
        this.j = false;
        this.m = 1.0f;
        this.p = 1.0f;
        this.x = new DecimalFormat("0.00");
        init();
    }
}
