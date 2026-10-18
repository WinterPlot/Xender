package com.userlabs.xshare.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.userlabs.xshare.core.utils.s;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class RatioDistributionView extends View {
    private Paint a;
    private Path b;
    private RectF c;
    private float[] d;
    private int[] e;
    private float f;

    public RatioDistributionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new float[]{0.3f, 0.4f, 0.3f, 0.0f};
        this.e = new int[]{-65536, -16711936, -16776961, -256};
        this.f = s.dip2px(4.0f);
        init();
    }

    private void init() {
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int[] iArr;
        super.onDraw(canvas);
        float[] fArr = this.d;
        if (fArr == null || fArr.length == 0 || (iArr = this.e) == null || iArr.length == 0 || iArr.length != fArr.length) {
            return;
        }
        this.c.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.b.reset();
        Path path = this.b;
        RectF rectF = this.c;
        float f = this.f;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.b);
        int i = 0;
        float f2 = 0.0f;
        for (float f3 : this.d) {
            f2 += f3;
        }
        RectF rectF2 = this.c;
        float f4 = rectF2.left;
        float fWidth = rectF2.width();
        float f5 = f4;
        while (true) {
            float[] fArr2 = this.d;
            if (i >= fArr2.length) {
                canvas.restore();
                return;
            }
            float f6 = (fArr2[i] / f2) * fWidth;
            this.a.setColor(this.e[i]);
            RectF rectF3 = this.c;
            float f7 = f5 + f6;
            canvas.drawRect(f5, rectF3.top, f7, rectF3.bottom, this.a);
            i++;
            f5 = f7;
        }
    }

    public void setAttr(float[] fArr, int[] iArr, float f) {
        this.d = fArr;
        this.e = iArr;
        this.f = f;
        invalidate();
    }

    public void setColors(int[] iArr) {
        this.e = iArr;
        invalidate();
    }

    public void setCornerRadius(float f) {
        this.f = f;
        invalidate();
    }

    public void setRatios(float[] fArr) {
        this.d = fArr;
        invalidate();
    }

    public RatioDistributionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RatioDistributionView(Context context) {
        this(context, null);
    }
}
