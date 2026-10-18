package com.userlabs.xshare.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Region;
import android.util.AttributeSet;
import com.userlabs.xshare.R;
import com.userlabs.xshare.core.utils.s;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class CaptureBgView extends BufferView {
    private Paint d;
    private int e;
    private int f;
    private float g;
    private float h;
    private float i;
    private float j;

    public CaptureBgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initDrawTools(context, attributeSet);
    }

    private void initDrawTools(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CaptureBgView);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CaptureBgView_cb_rect_size, s.dip2px(280.0f));
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CaptureBgView_cb_rect_top_margin, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        this.d.setColor(Color.argb(127, 0, 0, 0));
        setWillNotDraw(false);
    }

    @Override // com.userlabs.xshare.views.BufferView
    public void drawBufferCanvas(Canvas canvas) {
        super.drawBufferCanvas(canvas);
        canvas.clipRect(this.g, this.h, this.i, this.j, Region.Op.DIFFERENCE);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
    }

    @Override // com.userlabs.xshare.views.BufferView
    public String getKey() {
        return "CaptureBgView";
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.e;
        float f = (i - i5) / 2.0f;
        this.g = f;
        int i6 = this.f;
        float f2 = i6 > 0 ? i6 : (i2 - i5) / 2.0f;
        this.h = f2;
        this.i = f + i5;
        this.j = f2 + i5;
    }

    public CaptureBgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CaptureBgView(Context context) {
        this(context, null);
    }
}
