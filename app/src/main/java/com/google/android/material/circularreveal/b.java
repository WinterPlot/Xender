package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class b {
    private final a a;
    private final View b;
    private final Path c;
    private final Paint d;
    private final Paint e;
    private c.e f;
    private Drawable g;
    private Paint h;
    private boolean i;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.a = aVar;
        View view = (View) aVar;
        this.b = view;
        view.setWillNotDraw(false);
        this.c = new Path();
        this.d = new Paint(7);
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(0);
    }

    private void drawDebugCircle(Canvas canvas, int i, float f) {
        this.h.setColor(i);
        this.h.setStrokeWidth(f);
        c.e eVar = this.f;
        canvas.drawCircle(eVar.a, eVar.b, eVar.c - (f / 2.0f), this.h);
    }

    private void drawDebugMode(Canvas canvas) {
        this.a.actualDraw(canvas);
        if (shouldDrawScrim()) {
            c.e eVar = this.f;
            canvas.drawCircle(eVar.a, eVar.b, eVar.c, this.e);
        }
        if (shouldDrawCircularReveal()) {
            drawDebugCircle(canvas, -16777216, 10.0f);
            drawDebugCircle(canvas, -65536, 5.0f);
        }
        drawOverlayDrawable(canvas);
    }

    private void drawOverlayDrawable(Canvas canvas) {
        if (shouldDrawOverlayDrawable()) {
            Rect bounds = this.g.getBounds();
            float fWidth = this.f.a - (bounds.width() / 2.0f);
            float fHeight = this.f.b - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    private float getDistanceToFurthestCorner(c.e eVar) {
        return com.google.android.material.math.a.distanceToFurthestCorner(eVar.a, eVar.b, 0.0f, 0.0f, this.b.getWidth(), this.b.getHeight());
    }

    private void invalidateRevealInfo() {
        this.b.invalidate();
    }

    private boolean shouldDrawCircularReveal() {
        c.e eVar = this.f;
        return !(eVar == null || eVar.isInvalid());
    }

    private boolean shouldDrawOverlayDrawable() {
        return (this.i || this.g == null || this.f == null) ? false : true;
    }

    private boolean shouldDrawScrim() {
        return (this.i || Color.alpha(this.e.getColor()) == 0) ? false : true;
    }

    public void draw(Canvas canvas) {
        Canvas canvas2;
        boolean zShouldDrawCircularReveal = shouldDrawCircularReveal();
        a aVar = this.a;
        if (zShouldDrawCircularReveal) {
            aVar.actualDraw(canvas);
            if (shouldDrawScrim()) {
                canvas.drawRect(0.0f, 0.0f, this.b.getWidth(), this.b.getHeight(), this.e);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            aVar.actualDraw(canvas2);
            if (shouldDrawScrim()) {
                canvas2.drawRect(0.0f, 0.0f, this.b.getWidth(), this.b.getHeight(), this.e);
            }
        }
        drawOverlayDrawable(canvas2);
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.g;
    }

    public int getCircularRevealScrimColor() {
        return this.e.getColor();
    }

    public c.e getRevealInfo() {
        c.e eVar = this.f;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar);
        if (eVar2.isInvalid()) {
            eVar2.c = getDistanceToFurthestCorner(eVar2);
        }
        return eVar2;
    }

    public boolean isOpaque() {
        return this.a.actualIsOpaque() && !shouldDrawCircularReveal();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.g = drawable;
        this.b.invalidate();
    }

    public void setCircularRevealScrimColor(int i) {
        this.e.setColor(i);
        this.b.invalidate();
    }

    public void setRevealInfo(c.e eVar) {
        if (eVar == null) {
            this.f = null;
        } else {
            c.e eVar2 = this.f;
            if (eVar2 == null) {
                this.f = new c.e(eVar);
            } else {
                eVar2.set(eVar);
            }
            if (com.google.android.material.math.a.geq(eVar.c, getDistanceToFurthestCorner(eVar), 1.0E-4f)) {
                this.f.c = Float.MAX_VALUE;
            }
        }
        invalidateRevealInfo();
    }

    public void buildCircularRevealCache() {
    }

    public void destroyCircularRevealCache() {
    }
}
