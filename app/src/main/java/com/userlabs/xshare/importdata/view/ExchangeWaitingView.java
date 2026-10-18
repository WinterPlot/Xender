package com.userlabs.xshare.importdata.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.userlabs.xshare.importdata.R;
import com.userlabs.xshare.views.BufferView;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class ExchangeWaitingView extends BufferView {
    private int d;
    private Paint e;
    private Paint f;
    private float g;
    private float h;
    private int i;
    protected int j;
    protected int k;
    private float l;
    private Matrix m;
    Shader p;
    RectF v;
    int w;
    boolean x;

    public ExchangeWaitingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = new RectF();
        this.w = 0;
        this.x = false;
        initAttrs(context, attributeSet);
        initVariable();
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        this.d = Color.rgb(255, 255, 255);
        this.i = Color.argb(76, 255, 255, 255);
        this.h = getResources().getDimensionPixelOffset(R.dimen.ex_dp_10);
        this.m = new Matrix();
    }

    private void initVariable() {
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setColor(this.d);
        Paint paint2 = this.e;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.e.setStrokeWidth(this.h);
        this.e.setStrokeCap(Paint.Cap.SQUARE);
        Paint paint3 = new Paint();
        this.f = paint3;
        paint3.setAlpha(255);
        this.f.setColor(this.i);
        this.f.setAntiAlias(true);
        this.f.setStyle(style);
        this.f.setStrokeWidth(this.h);
    }

    @Override // com.userlabs.xshare.views.BufferView
    public void drawBufferCanvas(Canvas canvas) {
        super.drawBufferCanvas(canvas);
        if (!this.x) {
            canvas.drawCircle(this.j, this.k, this.g, this.f);
            return;
        }
        RectF rectF = this.v;
        int i = this.j;
        float f = this.g;
        rectF.left = i - f;
        int i2 = this.k;
        rectF.top = i2 - f;
        rectF.right = i + f;
        rectF.bottom = i2 + f;
        this.m.setRotate(this.w, i, i2);
        int i3 = 0;
        if (this.p == null) {
            SweepGradient sweepGradient = new SweepGradient(this.j, this.k, new int[]{0, -2130706433}, (float[]) null);
            this.p = sweepGradient;
            this.e.setShader(sweepGradient);
        }
        this.p.setLocalMatrix(this.m);
        int i4 = this.w + 5;
        this.w = i4;
        if (i4 >= 360) {
            this.w = 0;
        } else {
            i3 = i4;
        }
        canvas.drawArc(this.v, i3, 360.0f, false, this.e);
        if (this.x) {
            invalidate();
        }
    }

    @Override // com.userlabs.xshare.views.BufferView
    public String getKey() {
        return "ExchangeWaitingView";
    }

    public void initAll() {
        postInvalidate();
        stop();
        clearAnimation();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.h;
        float f2 = (i / 2.0f) - f;
        this.l = f2;
        this.g = (f / 2.0f) + f2;
        this.j = getWidth() / 2;
        this.k = getHeight() / 2;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != 0) {
            initAll();
        }
        super.setVisibility(i);
    }

    public void start() {
        this.x = true;
        postInvalidate();
    }

    public void stop() {
        this.x = false;
        postInvalidate();
    }
}
