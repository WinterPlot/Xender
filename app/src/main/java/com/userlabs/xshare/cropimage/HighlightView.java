package com.userlabs.xshare.cropimage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
class HighlightView {
    View a;
    boolean b;
    boolean c;
    Rect e;
    private RectF f;
    RectF g;
    Matrix h;
    private float j;
    private ModifyMode d = ModifyMode.None;
    private boolean i = false;
    private boolean k = false;
    private final Paint l = new Paint();
    private final Paint m = new Paint();
    private final Paint n = new Paint();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum ModifyMode {
        None,
        Move,
        Grow
    }

    public HighlightView(View view) {
        this.a = view;
    }

    private Rect computeLayout() {
        RectF rectF = this.g;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.h.mapRect(rectF2);
        return new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom));
    }

    public void draw(Canvas canvas) {
        if (this.c) {
            return;
        }
        Path path = new Path();
        if (!hasFocus()) {
            this.n.setColor(-16777216);
            canvas.drawRect(this.e, this.n);
            return;
        }
        Rect rect = new Rect();
        this.a.getDrawingRect(rect);
        if (this.k) {
            canvas.save();
            float fWidth = this.e.width();
            float fHeight = this.e.height();
            Rect rect2 = this.e;
            float f = fWidth / 2.0f;
            path.addCircle(rect2.left + f, (fHeight / 2.0f) + rect2.top, f, Path.Direction.CW);
            this.n.setColor(-1112874);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawRect(rect, hasFocus() ? this.l : this.m);
            canvas.restore();
        } else {
            Rect rect3 = new Rect(rect.left, rect.top, rect.right, this.e.top);
            if (rect3.width() > 0 && rect3.height() > 0) {
                canvas.drawRect(rect3, hasFocus() ? this.l : this.m);
            }
            Rect rect4 = new Rect(rect.left, this.e.bottom, rect.right, rect.bottom);
            if (rect4.width() > 0 && rect4.height() > 0) {
                canvas.drawRect(rect4, hasFocus() ? this.l : this.m);
            }
            Rect rect5 = new Rect(rect.left, rect3.bottom, this.e.left, rect4.top);
            if (rect5.width() > 0 && rect5.height() > 0) {
                canvas.drawRect(rect5, hasFocus() ? this.l : this.m);
            }
            Rect rect6 = new Rect(this.e.right, rect3.bottom, rect.right, rect4.top);
            if (rect6.width() > 0 && rect6.height() > 0) {
                canvas.drawRect(rect6, hasFocus() ? this.l : this.m);
            }
            path.addRect(new RectF(this.e), Path.Direction.CW);
            this.n.setColor(-1);
        }
        canvas.drawPath(path, this.n);
    }

    public Rect getCropRect() {
        RectF rectF = this.g;
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public int getHit(float f, float f2) {
        Rect rectComputeLayout = computeLayout();
        if (this.k) {
            float fCenterX = f - rectComputeLayout.centerX();
            float fCenterY = f2 - rectComputeLayout.centerY();
            int iSqrt = (int) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
            int iWidth = this.e.width() / 2;
            if (Math.abs(iSqrt - iWidth) > 20.0f) {
                return iSqrt < iWidth ? 32 : 1;
            }
            if (Math.abs(fCenterY) > Math.abs(fCenterX)) {
                return fCenterY < 0.0f ? 8 : 16;
            }
            return fCenterX < 0.0f ? 2 : 4;
        }
        boolean z = false;
        boolean z2 = f2 >= ((float) rectComputeLayout.top) - 20.0f && f2 < ((float) rectComputeLayout.bottom) + 20.0f;
        int i = rectComputeLayout.left;
        if (f >= i - 20.0f && f < rectComputeLayout.right + 20.0f) {
            z = true;
        }
        int i2 = (Math.abs(((float) i) - f) >= 20.0f || !z2) ? 1 : 3;
        if (Math.abs(rectComputeLayout.right - f) < 20.0f && z2) {
            i2 |= 4;
        }
        if (Math.abs(rectComputeLayout.top - f2) < 20.0f && z) {
            i2 |= 8;
        }
        if (Math.abs(rectComputeLayout.bottom - f2) < 20.0f && z) {
            i2 |= 16;
        }
        if (i2 == 1 && rectComputeLayout.contains((int) f, (int) f2)) {
            return 32;
        }
        return i2;
    }

    public void growBy(float f, float f2) {
        if (this.i) {
            if (f != 0.0f) {
                f2 = f / this.j;
            } else if (f2 != 0.0f) {
                f = this.j * f2;
            }
        }
        RectF rectF = new RectF(this.g);
        if (f > 0.0f) {
            if ((f * 2.0f) + rectF.width() > this.f.width()) {
                f = (this.f.width() - rectF.width()) / 2.0f;
                if (this.i) {
                    f2 = f / this.j;
                }
            }
        }
        if (f2 > 0.0f) {
            if ((f2 * 2.0f) + rectF.height() > this.f.height()) {
                f2 = (this.f.height() - rectF.height()) / 2.0f;
                if (this.i) {
                    f = this.j * f2;
                }
            }
        }
        rectF.inset(-f, -f2);
        if (rectF.width() < 25.0f) {
            rectF.inset((-(25.0f - rectF.width())) / 2.0f, 0.0f);
        }
        float f3 = this.i ? 25.0f / this.j : 25.0f;
        if (rectF.height() < f3) {
            rectF.inset(0.0f, (-(f3 - rectF.height())) / 2.0f);
        }
        float f4 = rectF.left;
        RectF rectF2 = this.f;
        float f5 = rectF2.left;
        if (f4 < f5) {
            rectF.offset(f5 - f4, 0.0f);
        } else {
            float f6 = rectF.right;
            float f7 = rectF2.right;
            if (f6 > f7) {
                rectF.offset(-(f6 - f7), 0.0f);
            }
        }
        float f8 = rectF.top;
        RectF rectF3 = this.f;
        float f9 = rectF3.top;
        if (f8 < f9) {
            rectF.offset(0.0f, f9 - f8);
        } else {
            float f10 = rectF.bottom;
            float f11 = rectF3.bottom;
            if (f10 > f11) {
                rectF.offset(0.0f, -(f10 - f11));
            }
        }
        this.g.set(rectF);
        this.e = computeLayout();
        this.a.invalidate();
    }

    public void handleMotion(int i, float f, float f2) {
        Rect rectComputeLayout = computeLayout();
        if (i == 1) {
            return;
        }
        if (i == 32) {
            moveBy((this.g.width() / rectComputeLayout.width()) * f, (this.g.height() / rectComputeLayout.height()) * f2);
            return;
        }
        if ((i & 6) == 0) {
            f = 0.0f;
        }
        if ((i & 24) == 0) {
            f2 = 0.0f;
        }
        growBy(((i & 2) != 0 ? -1 : 1) * (this.g.width() / rectComputeLayout.width()) * f, ((i & 8) != 0 ? -1 : 1) * (this.g.height() / rectComputeLayout.height()) * f2);
    }

    public boolean hasFocus() {
        return this.b;
    }

    public void invalidate() {
        this.e = computeLayout();
    }

    public void moveBy(float f, float f2) {
        Rect rect = new Rect(this.e);
        this.g.offset(f, f2);
        RectF rectF = this.g;
        rectF.offset(Math.max(0.0f, this.f.left - rectF.left), Math.max(0.0f, this.f.top - this.g.top));
        RectF rectF2 = this.g;
        rectF2.offset(Math.min(0.0f, this.f.right - rectF2.right), Math.min(0.0f, this.f.bottom - this.g.bottom));
        Rect rectComputeLayout = computeLayout();
        this.e = rectComputeLayout;
        rect.union(rectComputeLayout);
        rect.inset(-10, -10);
        this.a.invalidate(rect);
    }

    public void setFocus(boolean z) {
        this.b = z;
    }

    public void setHidden(boolean z) {
        this.c = z;
    }

    public void setMode(ModifyMode modifyMode) {
        if (modifyMode != this.d) {
            this.d = modifyMode;
            this.a.invalidate();
        }
    }

    public void setup(Matrix matrix, Rect rect, RectF rectF, boolean z, boolean z2) {
        if (z) {
            z2 = true;
        }
        this.h = new Matrix(matrix);
        this.g = rectF;
        this.f = new RectF(rect);
        this.i = z2;
        this.k = z;
        this.j = this.g.width() / this.g.height();
        this.e = computeLayout();
        this.l.setARGB(125, 50, 50, 50);
        this.m.setARGB(125, 50, 50, 50);
        this.n.setStrokeWidth(3.0f);
        this.n.setStyle(Paint.Style.STROKE);
        this.n.setAntiAlias(true);
        this.d = ModifyMode.None;
        init();
    }

    private void init() {
    }
}
