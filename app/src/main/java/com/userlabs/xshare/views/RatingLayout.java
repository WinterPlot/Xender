package com.userlabs.xshare.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.userlabs.xshare.a0;
import com.userlabs.xshare.core.R;
import com.userlabs.xshare.core.utils.s;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class RatingLayout extends LinearLayout {
    final int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public RatingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 5;
        this.c = -16711936;
        init(context, attributeSet);
        setGravity(17);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            this.b = context.getResources().getColor(R.color.primary);
            this.c = context.getResources().getColor(R.color.primary);
            this.d = a0.getSafeDimensionPixelSize(context, com.userlabs.xshare.R.dimen.x_dp_20, s.dip2px(20.0f));
            this.e = a0.getSafeDimensionPixelSize(context, com.userlabs.xshare.R.dimen.x_dp_5, s.dip2px(5.0f));
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.userlabs.xshare.R.styleable.RatingLayout, 0, 0);
        this.b = typedArrayObtainStyledAttributes.getColor(com.userlabs.xshare.R.styleable.RatingLayout_x_bg_color, this.b);
        this.c = typedArrayObtainStyledAttributes.getColor(com.userlabs.xshare.R.styleable.RatingLayout_stv_color, this.c);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.userlabs.xshare.R.styleable.RatingLayout_stv_size, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.userlabs.xshare.R.styleable.RatingLayout_stv_margin, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setBgColor(int i) {
        this.b = i;
    }

    public void setStars(float f) {
        if (getChildCount() > 0) {
            removeAllViews();
        }
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            float f2 = f - i;
            if (f2 > 0.0f) {
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                fArr[i] = f2;
            } else {
                fArr[i] = 0.0f;
            }
        }
        for (int i2 = 0; i2 < 5; i2++) {
            RatingView ratingView = new RatingView(getContext(), this.b, this.c);
            int i3 = this.d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
            layoutParams.rightMargin = this.e;
            ratingView.setPercent(fArr[i2]);
            addView(ratingView, layoutParams);
        }
    }

    public RatingLayout(Context context) {
        super(context);
        this.a = 5;
        this.c = -16711936;
    }

    public RatingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 5;
        this.c = -16711936;
        init(context, attributeSet);
        setGravity(17);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class RatingView extends View {
        private float a;
        private float b;
        private float c;
        private final int d;
        private Path e;
        private Paint f;
        private int g;
        private int h;
        private int i;
        private int j;

        public RatingView(Context context, int i, int i2) {
            super(context);
            this.d = 5;
            setLayerType(1, null);
            this.i = i;
            this.j = i2;
            Paint paint = new Paint();
            this.f = paint;
            paint.setAntiAlias(true);
            this.f.setStyle(Paint.Style.FILL);
            this.f.setStrokeWidth(3.0f);
        }

        private double angleToRadian(float f) {
            return ((double) (f / 180.0f)) * 3.141592653589793d;
        }

        private void drawStart(Canvas canvas) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getWidth(), null, 31);
            this.f.setStyle(Paint.Style.FILL);
            this.f.setColor(this.i);
            canvas.drawRect(new Rect(0, 0, (int) (this.g * this.a), this.h), this.f);
            canvas.translate(canvas.getWidth() / 2.0f, canvas.getWidth() / 2.0f);
            Point point = new Point();
            Point point2 = new Point();
            Path path = this.e;
            if (path == null) {
                path = new Path();
                this.e = path;
            }
            path.reset();
            this.f.setColor(this.j);
            for (int i = 0; i < 5; i++) {
                float f = i * 72.0f;
                float f2 = 18.0f + f;
                point.x = (int) (Math.cos(angleToRadian(f2)) * ((double) this.b));
                point.y = (int) (-(Math.sin(angleToRadian(f2)) * ((double) this.b)));
                float f3 = 54.0f + f;
                point2.x = (int) (Math.cos(angleToRadian(f3)) * ((double) this.c));
                point2.y = (int) (-(Math.sin(angleToRadian(f3)) * ((double) this.c)));
                if (i == 0) {
                    this.e.moveTo(point.x, point.y);
                }
                this.e.lineTo(point.x, point.y);
                this.e.lineTo(point2.x, point2.y);
            }
            this.e.close();
            this.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            canvas.drawPath(this.e, this.f);
            canvas.restoreToCount(iSaveLayer);
            this.f.setXfermode(null);
            canvas.translate(canvas.getWidth() / 2.0f, canvas.getWidth() / 2.0f);
            this.f.setStyle(Paint.Style.STROKE);
            canvas.drawPath(this.e, this.f);
        }

        private int handleMeasure(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == 1073741824) {
                return size;
            }
            if (mode == Integer.MIN_VALUE) {
                return Math.min(0, size);
            }
            return 0;
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            drawStart(canvas);
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setMeasuredDimension(handleMeasure(i), handleMeasure(i2));
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.g = i;
            this.h = i2;
            this.b = Math.min(i, i2) / 2.0f;
            this.c = (Math.min(i, i2) / 2.0f) * 0.5f;
        }

        public void setPercent(float f) {
            this.a = f;
            postInvalidate();
        }

        public RatingView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.d = 5;
        }

        public RatingView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.d = 5;
        }
    }
}
