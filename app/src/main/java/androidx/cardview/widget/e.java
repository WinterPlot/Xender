package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.camera.camera2.pipe.compat.r0;
import androidx.cardview.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class e extends Drawable {
    private static final double q = Math.cos(Math.toRadians(45.0d));
    private final int a;
    private Paint c;
    private Paint d;
    private final RectF e;
    private float f;
    private Path g;
    private float h;
    private float i;
    private float j;
    private ColorStateList k;
    private final int m;
    private final int n;
    private boolean l = true;
    private boolean o = true;
    private boolean p = false;
    private Paint b = new Paint(5);

    public e(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.m = resources.getColor(R.color.cardview_shadow_start_color);
        this.n = resources.getColor(R.color.cardview_shadow_end_color);
        this.a = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        setBackground(colorStateList);
        Paint paint = new Paint(5);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f = (int) (f + 0.5f);
        this.e = new RectF();
        Paint paint2 = new Paint(this.c);
        this.d = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    private void buildComponents(Rect rect) {
        float f = this.h;
        float f2 = 1.5f * f;
        this.e.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        buildShadowCorners();
    }

    private void buildShadowCorners() {
        float f = this.f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.i;
        rectF2.inset(-f2, -f2);
        Path path = this.g;
        if (path == null) {
            this.g = new Path();
        } else {
            path.reset();
        }
        this.g.setFillType(Path.FillType.EVEN_ODD);
        this.g.moveTo(-this.f, 0.0f);
        this.g.rLineTo(-this.i, 0.0f);
        this.g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.g.arcTo(rectF, 270.0f, -90.0f, false);
        this.g.close();
        float f3 = this.f;
        float f4 = f3 / (this.i + f3);
        Paint paint = this.c;
        float f5 = this.f + this.i;
        int i = this.m;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.n}, new float[]{0.0f, f4, 1.0f}, tileMode));
        Paint paint2 = this.d;
        float f6 = this.f;
        float f7 = this.i;
        float f8 = (-f6) + f7;
        float f9 = (-f6) - f7;
        int i2 = this.m;
        paint2.setShader(new LinearGradient(0.0f, f8, 0.0f, f9, new int[]{i2, i2, this.n}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.d.setAntiAlias(false);
    }

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - q) * ((double) f2)) + ((double) f));
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - q) * ((double) f2)) + ((double) (f * 1.5f)));
    }

    private void drawShadow(Canvas canvas) {
        Canvas canvas2;
        float f = this.f;
        float f2 = (-f) - this.i;
        float f3 = (this.j / 2.0f) + f + this.a;
        float f4 = 2.0f * f3;
        boolean z = this.e.width() - f4 > 0.0f;
        boolean z2 = this.e.height() - f4 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.g, this.c);
        if (z) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, f2, this.e.width() - f4, -this.f, this.d);
        } else {
            canvas2 = canvas;
        }
        canvas2.restoreToCount(iSave);
        int iSave2 = canvas2.save();
        RectF rectF2 = this.e;
        canvas2.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.g, this.c);
        if (z) {
            canvas2.drawRect(0.0f, f2, this.e.width() - f4, (-this.f) + this.i, this.d);
        }
        canvas2.restoreToCount(iSave2);
        int iSave3 = canvas2.save();
        RectF rectF3 = this.e;
        canvas2.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.g, this.c);
        if (z2) {
            canvas2.drawRect(0.0f, f2, this.e.height() - f4, -this.f, this.d);
        }
        canvas2.restoreToCount(iSave3);
        int iSave4 = canvas2.save();
        RectF rectF4 = this.e;
        canvas2.translate(rectF4.right - f3, rectF4.top + f3);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.g, this.c);
        if (z2) {
            canvas2.drawRect(0.0f, f2, this.e.height() - f4, -this.f, this.d);
        }
        canvas2.restoreToCount(iSave4);
    }

    private void setBackground(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.k = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.k.getDefaultColor()));
    }

    private void setShadowSize(float f, float f2) {
        if (f < 0.0f) {
            r0.i("Invalid shadow size ", f, ". Must be >= 0");
            return;
        }
        if (f2 < 0.0f) {
            r0.i("Invalid max shadow size ", f2, ". Must be >= 0");
            return;
        }
        float even = toEven(f);
        float even2 = toEven(f2);
        if (even > even2) {
            if (!this.p) {
                this.p = true;
            }
            even = even2;
        }
        if (this.j == even && this.h == even2) {
            return;
        }
        this.j = even;
        this.h = even2;
        this.i = (int) ((even * 1.5f) + this.a + 0.5f);
        this.l = true;
        invalidateSelf();
    }

    private int toEven(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.l) {
            buildComponents(getBounds());
            this.l = false;
        }
        canvas.translate(0.0f, this.j / 2.0f);
        drawShadow(canvas);
        canvas.translate(0.0f, (-this.j) / 2.0f);
        throw null;
    }

    public ColorStateList getColor() {
        return this.k;
    }

    public float getCornerRadius() {
        return this.f;
    }

    public void getMaxShadowAndCornerPadding(Rect rect) {
        getPadding(rect);
    }

    public float getMaxShadowSize() {
        return this.h;
    }

    public float getMinHeight() {
        float f = this.h;
        return (((this.h * 1.5f) + this.a) * 2.0f) + (Math.max(f, ((f * 1.5f) / 2.0f) + this.f + this.a) * 2.0f);
    }

    public float getMinWidth() {
        float f = this.h;
        return ((this.h + this.a) * 2.0f) + (Math.max(f, (f / 2.0f) + this.f + this.a) * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(calculateVerticalPadding(this.h, this.f, this.o));
        int iCeil2 = (int) Math.ceil(calculateHorizontalPadding(this.h, this.f, this.o));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    public float getShadowSize() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.b.getColor() == colorForState) {
            return false;
        }
        this.b.setColor(colorForState);
        this.l = true;
        invalidateSelf();
        return true;
    }

    public void setAddPaddingForCorners(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
        this.d.setAlpha(i);
    }

    public void setColor(ColorStateList colorStateList) {
        setBackground(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public void setCornerRadius(float f) {
        if (f < 0.0f) {
            r0.i("Invalid radius ", f, ". Must be >= 0");
            return;
        }
        float f2 = (int) (f + 0.5f);
        if (this.f == f2) {
            return;
        }
        this.f = f2;
        this.l = true;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f) {
        setShadowSize(this.j, f);
    }

    public void setShadowSize(float f) {
        setShadowSize(f, this.h);
    }
}
