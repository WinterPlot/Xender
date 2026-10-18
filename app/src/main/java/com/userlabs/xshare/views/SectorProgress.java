package com.userlabs.xshare.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.userlabs.xshare.core.utils.s;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class SectorProgress extends BufferView {
    private int d;
    private int e;
    private Paint f;
    private RectF g;
    private int h;
    private float i;
    int j;
    int k;
    private int l;

    public SectorProgress(Context context) {
        super(context);
        this.d = -1;
        this.f = new Paint();
        this.g = new RectF();
        this.h = 360;
        initColor(context, null);
    }

    private void initColor(Context context, AttributeSet attributeSet) {
        this.e = s.dip2px(context, 4.0f);
        this.f.setColor(this.d);
        this.f.setAntiAlias(true);
    }

    @Override // com.userlabs.xshare.views.BufferView
    public void drawBufferCanvas(Canvas canvas) {
        super.drawBufferCanvas(canvas);
        this.f.setStrokeWidth(this.e);
        this.f.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(this.j, this.k, this.i, this.f);
        this.f.setStyle(Paint.Style.FILL);
        canvas.drawArc(this.g, 270.0f, this.l, true, this.f);
    }

    @Override // com.userlabs.xshare.views.BufferView
    public String getKey() {
        return "SectorProgress";
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.j = getWidth() / 2;
        this.k = getHeight() / 2;
        float f = this.j;
        int i5 = this.e;
        this.i = f - (i5 / 2.0f);
        RectF rectF = this.g;
        rectF.left = i5 - 1;
        rectF.top = i5 - 1;
        rectF.right = (i - i5) + 1;
        rectF.bottom = (i2 - i5) + 1;
    }

    public void setProgress(int i) {
        this.l = (int) (i * 3.6f);
        postInvalidate();
    }

    public SectorProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = new Paint();
        this.g = new RectF();
        this.h = 360;
        initColor(context, attributeSet);
    }
}
