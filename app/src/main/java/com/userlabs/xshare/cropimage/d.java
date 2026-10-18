package com.userlabs.xshare.cropimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
abstract class d extends AppCompatImageView {
    protected Matrix d;
    protected Matrix e;
    private final Matrix f;
    private final float[] g;
    protected final f h;
    int i;
    int j;
    float k;
    int l;
    int m;
    int p;
    int v;
    protected Handler w;
    private Runnable x;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements Runnable {
        final /* synthetic */ f a;
        final /* synthetic */ boolean b;

        public a(f fVar, boolean z) {
            this.a = fVar;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.setImageRotateBitmapResetBase(this.a, this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class b implements Runnable {
        final /* synthetic */ float a;
        final /* synthetic */ long b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;
        final /* synthetic */ float e;
        final /* synthetic */ float f;

        public b(float f, long j, float f2, float f3, float f4, float f5) {
            this.a = f;
            this.b = j;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = f5;
        }

        @Override // java.lang.Runnable
        public void run() {
            float fMin = Math.min(this.a, System.currentTimeMillis() - this.b);
            d.this.zoomTo((this.d * fMin) + this.c, this.e, this.f);
            if (fMin < this.a) {
                d.this.w.post(this);
            }
        }
    }

    public d(Context context) {
        super(context);
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = new Matrix();
        this.g = new float[9];
        this.h = new f(null);
        this.i = -1;
        this.j = -1;
        this.w = new Handler();
        this.x = null;
        init();
    }

    private void getProperBaseMatrix(f fVar, Matrix matrix) {
        float width = getWidth();
        float height = getHeight();
        float width2 = fVar.getWidth();
        float height2 = fVar.getHeight();
        fVar.getRotation();
        matrix.reset();
        float fMin = Math.min(Math.min(width / width2, 2.0f), Math.min(height / height2, 2.0f));
        matrix.postConcat(fVar.getRotateMatrix());
        matrix.postScale(fMin, fMin);
        matrix.postTranslate((width - (width2 * fMin)) / 2.0f, (height - (height2 * fMin)) / 2.0f);
    }

    private void init() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void setImageBitmap(Bitmap bitmap, int i) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
        }
        this.h.setBitmap(bitmap);
        this.h.setRotation(i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    public void center(boolean z, boolean z2) {
        float height;
        if (this.h.getBitmap() == null) {
            return;
        }
        Matrix imageViewMatrix = getImageViewMatrix();
        float f = 0.0f;
        RectF rectF = new RectF(0.0f, 0.0f, this.h.getBitmap().getWidth(), this.h.getBitmap().getHeight());
        imageViewMatrix.mapRect(rectF);
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        if (z2) {
            float height2 = getHeight();
            float f2 = rectF.top;
            if (fHeight < height2) {
                height = ((height2 - fHeight) / 2.0f) - f2;
            } else if (f2 > 0.0f) {
                height = -f2;
            } else if (rectF.bottom < height2) {
                height = getHeight() - rectF.bottom;
            } else {
                height = 0.0f;
            }
        } else {
            height = 0.0f;
        }
        if (z) {
            float width = getWidth();
            float f3 = rectF.left;
            if (fWidth < width) {
                f = ((width - fWidth) / 2.0f) - f3;
            } else if (f3 > 0.0f) {
                f = -f3;
            } else {
                float f4 = rectF.right;
                if (f4 < width) {
                    f = width - f4;
                }
            }
        }
        postTranslate(f, height);
        setImageMatrix(getImageViewMatrix());
    }

    public Matrix getImageViewMatrix() {
        this.f.set(this.d);
        this.f.postConcat(this.e);
        return this.f;
    }

    public float getScale() {
        return getScale(this.e);
    }

    public float getValue(Matrix matrix, int i) {
        matrix.getValues(this.g);
        return this.g[i];
    }

    public float maxZoom() {
        if (this.h.getBitmap() == null) {
            return 1.0f;
        }
        return Math.max(this.h.getWidth() / this.i, this.h.getHeight() / this.j) * 4.0f;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || getScale() <= 1.0f) {
            return super.onKeyDown(i, keyEvent);
        }
        zoomTo(1.0f);
        return true;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.l = i;
        this.m = i3;
        this.p = i2;
        this.v = i4;
        this.i = i3 - i;
        this.j = i4 - i2;
        Runnable runnable = this.x;
        if (runnable != null) {
            this.x = null;
            runnable.run();
        }
        if (this.h.getBitmap() != null) {
            getProperBaseMatrix(this.h, this.d);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public void panBy(float f, float f2) {
        postTranslate(f, f2);
        setImageMatrix(getImageViewMatrix());
    }

    public void postTranslate(float f, float f2) {
        this.e.postTranslate(f, f2);
    }

    public void setImageBitmapResetBase(Bitmap bitmap, boolean z) {
        setImageRotateBitmapResetBase(new f(bitmap), z);
    }

    public void setImageRotateBitmapResetBase(f fVar, boolean z) {
        if (getWidth() <= 0) {
            this.x = new a(fVar, z);
            return;
        }
        Bitmap bitmap = fVar.getBitmap();
        Matrix matrix = this.d;
        if (bitmap != null) {
            getProperBaseMatrix(fVar, matrix);
            setImageBitmap(fVar.getBitmap(), fVar.getRotation());
        } else {
            matrix.reset();
            setImageBitmap(null);
        }
        if (z) {
            this.e.reset();
        }
        setImageMatrix(getImageViewMatrix());
        this.k = maxZoom();
    }

    public void zoomTo(float f, float f2, float f3, float f4) {
        float scale = (f - getScale()) / f4;
        float scale2 = getScale();
        this.w.post(new b(f4, System.currentTimeMillis(), scale2, scale, f2, f3));
    }

    public float getScale(Matrix matrix) {
        return getValue(matrix, 0);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap, 0);
    }

    public void zoomTo(float f, float f2, float f3) {
        float f4 = this.k;
        if (f > f4) {
            f = f4;
        }
        float scale = f / getScale();
        this.e.postScale(scale, scale, f2, f3);
        setImageMatrix(getImageViewMatrix());
        center(true, true);
    }

    public void zoomTo(float f) {
        zoomTo(f, getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = new Matrix();
        this.g = new float[9];
        this.h = new f(null);
        this.i = -1;
        this.j = -1;
        this.w = new Handler();
        this.x = null;
        init();
    }
}
