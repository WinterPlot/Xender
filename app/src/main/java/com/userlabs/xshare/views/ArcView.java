package com.userlabs.xshare.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.userlabs.xshare.core.utils.s;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class ArcView extends View {
    static boolean g = false;
    private Paint a;
    private RectF b;
    private Context c;
    int d;
    float e;
    private MODE f;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum MODE {
        TOP_LEFT,
        BOTTOM_RIGHT,
        TOP_RIGHT
    }

    public ArcView(Context context, AttributeSet attributeSet, int i, float f) {
        super(context, attributeSet);
        this.f = MODE.BOTTOM_RIGHT;
        this.c = context;
        this.d = i;
        this.e = f;
        String language = Locale.getDefault().getLanguage();
        if (language.equalsIgnoreCase("fa") || language.equalsIgnoreCase("ur") || language.equalsIgnoreCase("he") || language.equalsIgnoreCase("iw") || language.equalsIgnoreCase("ar")) {
            g = true;
        }
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setColor(-1);
        this.a.setStrokeWidth(6.0f);
        this.a.setPathEffect(new DashPathEffect(new float[]{10.0f, 5.0f}, 1.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.b;
        if (rectF != null) {
            boolean z = g;
            float f = this.e;
            if (z) {
                canvas.drawArc(rectF, f, -90.0f, false, this.a);
            } else {
                canvas.drawArc(rectF, f, 90.0f, false, this.a);
            }
        }
    }

    public void setMode(MODE mode) {
        this.f = mode;
    }

    public void setStartPoint(float[] fArr) {
        int i;
        int i2;
        if (this.f.equals(MODE.BOTTOM_RIGHT)) {
            RectF rectF = new RectF();
            this.b = rectF;
            if (g) {
                float f = fArr[0];
                rectF.left = f;
                i2 = this.d;
                rectF.right = f + (i2 * 2);
            } else {
                float f2 = fArr[0];
                i2 = this.d;
                rectF.left = f2 - (i2 * 2);
                rectF.right = f2;
            }
            rectF.top = (fArr[1] - (i2 * 2)) + fArr[2] + s.dip2px(this.c, 11.0f);
            this.b.bottom = fArr[1] + fArr[2] + s.dip2px(this.c, 11.0f);
        } else if (this.f.equals(MODE.TOP_LEFT)) {
            RectF rectF2 = new RectF();
            this.b = rectF2;
            if (g) {
                float f3 = fArr[0];
                rectF2.left = f3 - (this.d * 2);
                rectF2.right = f3;
            } else {
                float f4 = fArr[0];
                rectF2.left = f4;
                rectF2.right = f4 + (this.d * 2);
            }
            rectF2.top = (fArr[1] - s.dip2px(this.c, 15.0f)) - s.dip2px(this.c, 18.0f);
            this.b.bottom = ((fArr[1] + (this.d * 2)) - s.dip2px(this.c, 15.0f)) - s.dip2px(this.c, 18.0f);
        } else if (this.f.equals(MODE.TOP_RIGHT)) {
            RectF rectF3 = new RectF();
            this.b = rectF3;
            if (g) {
                float f5 = fArr[0];
                i = this.d;
                rectF3.left = f5 - (i * 2);
                rectF3.right = f5;
            } else {
                float f6 = fArr[0];
                i = this.d;
                rectF3.left = f6 - (i * 2);
                rectF3.right = f6;
            }
            rectF3.top = (fArr[1] - (i * 2)) + fArr[2] + s.dip2px(this.c, 85.0f);
            this.b.bottom = fArr[1] + fArr[2] + s.dip2px(this.c, 85.0f);
        }
        postInvalidate();
    }
}
