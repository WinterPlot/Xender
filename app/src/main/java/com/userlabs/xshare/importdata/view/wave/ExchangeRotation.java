package com.userlabs.xshare.importdata.view.wave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.userlabs.xshare.importdata.R;
import com.userlabs.xshare.views.BufferView;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class ExchangeRotation extends BufferView {
    private int d;
    private Paint e;
    private float f;
    private float g;
    private int h;
    protected int i;
    protected int j;
    private Paint k;
    private float l;
    private float m;
    private boolean p;
    RectF v;

    public ExchangeRotation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = 90.0f;
        this.p = true;
        this.v = new RectF();
        initAttrs(context, attributeSet);
        initVariable();
    }

    private void drawRoate(Canvas canvas) {
        canvas.drawArc(this.v, this.m, 18.0f, false, this.e);
        float f = this.m + 3.0f;
        this.m = f;
        if (f >= 360.0f) {
            this.m = 0.0f;
        }
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        this.h = Color.argb(76, 255, 255, 255);
        this.d = Color.argb(76, 0, 0, 0);
        this.g = context.getResources().getDimension(R.dimen.ex_dp_6);
    }

    private void initVariable() {
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setColor(this.d);
        Paint paint2 = this.e;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.e.setStrokeWidth(this.g);
        this.e.setStrokeCap(Paint.Cap.SQUARE);
        Paint paint3 = new Paint();
        this.k = paint3;
        paint3.setColor(this.h);
        this.k.setAntiAlias(true);
        this.k.setStyle(style);
        this.k.setStrokeWidth(this.g);
    }

    @Override // com.userlabs.xshare.views.BufferView
    public void drawBufferCanvas(Canvas canvas) {
        super.drawBufferCanvas(canvas);
        canvas.drawCircle(this.i, this.j, this.f, this.k);
        if (this.p) {
            drawRoate(canvas);
            postInvalidate();
        }
    }

    @Override // com.userlabs.xshare.views.BufferView
    public String getKey() {
        return "ExchangeRotation";
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.g;
        float f2 = (i / 2.0f) - f;
        this.l = f2;
        this.f = (f / 2.0f) + f2;
        this.i = getWidth() / 2;
        int height = getHeight() / 2;
        this.j = height;
        RectF rectF = this.v;
        int i5 = this.i;
        float f3 = this.f;
        rectF.left = i5 - f3;
        rectF.top = height - f3;
        rectF.right = i5 + f3;
        rectF.bottom = height + f3;
    }

    public void stopDrawRoate() {
        this.p = false;
    }
}
