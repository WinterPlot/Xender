package com.userlabs.xshare.views.swbtn;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements Cloneable {
    private float j;
    private Rect m;
    private Drawable a = null;
    private Drawable b = null;
    private Drawable c = null;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = -1;
    private int i = -1;
    private float k = -1.0f;
    private float l = 0.0f;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        static int a = Color.parseColor("#E3E3E3");
        static int b = Color.parseColor("#FFBCCEF7");
        static int c = Color.parseColor("#FFFFFF");
        static int d = Color.parseColor("#fafafa");
        static int e = 2;
        static int f = 999;
        static float g = 2.0f;
        static int h = 0;
    }

    /* JADX INFO: renamed from: com.userlabs.xshare.views.swbtn.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class C0379b {
        static int a = 24;
    }

    private b() {
    }

    public static b getDefault(float f) {
        b bVar = new b();
        bVar.j = f;
        bVar.setThumbMarginInPixel(bVar.getDefaultThumbMarginInPixel());
        int i = a.h;
        bVar.m = new Rect(i, i, i, i);
        return bVar;
    }

    public int getDefaultThumbMarginInPixel() {
        return (int) (a.e * this.j);
    }

    public Rect getInsetBounds() {
        return this.m;
    }

    public int getInsetX() {
        return getShrinkX() / 2;
    }

    public int getInsetY() {
        return getShrinkY() / 2;
    }

    public float getMeasureFactor() {
        float f = this.l;
        if (f > 0.0f) {
            return f;
        }
        float f2 = a.g;
        this.l = f2;
        return f2;
    }

    public Drawable getOffDrawable() {
        return this.b;
    }

    public Drawable getOnDrawable() {
        return this.a;
    }

    public float getRadius() {
        float f = this.k;
        return f < 0.0f ? a.f : f;
    }

    public int getShrinkX() {
        Rect rect = this.m;
        return rect.left + rect.right;
    }

    public int getShrinkY() {
        Rect rect = this.m;
        return rect.top + rect.bottom;
    }

    public Drawable getThumbDrawable() {
        return this.c;
    }

    public int getThumbHeight() {
        int intrinsicHeight;
        int i = this.i;
        if (i >= 0) {
            return i;
        }
        Drawable drawable = this.c;
        if (drawable != null && (intrinsicHeight = drawable.getIntrinsicHeight()) > 0) {
            return intrinsicHeight;
        }
        float f = this.j;
        if (f > 0.0f) {
            return (int) (C0379b.a * f);
        }
        b0.i("density must be a positive number");
        return 0;
    }

    public int getThumbMarginBottom() {
        return this.e;
    }

    public int getThumbMarginLeft() {
        return this.f;
    }

    public int getThumbMarginRight() {
        return this.g;
    }

    public int getThumbMarginTop() {
        return this.d;
    }

    public int getThumbWidth() {
        int intrinsicWidth;
        int i = this.h;
        if (i >= 0) {
            return i;
        }
        Drawable drawable = this.c;
        if (drawable != null && (intrinsicWidth = drawable.getIntrinsicWidth()) > 0) {
            return intrinsicWidth;
        }
        float f = this.j;
        if (f > 0.0f) {
            return (int) (C0379b.a * f);
        }
        b0.i("density must be a positive number");
        return 0;
    }

    public boolean needShrink() {
        Rect rect = this.m;
        return ((rect.left + rect.right) + rect.top) + rect.bottom != 0;
    }

    public void setInsetBottom(int i) {
        if (i > 0) {
            i = -i;
        }
        this.m.bottom = i;
    }

    public void setInsetBounds(int i, int i2, int i3, int i4) {
        setInsetLeft(i);
        setInsetTop(i2);
        setInsetRight(i3);
        setInsetBottom(i4);
    }

    public void setInsetLeft(int i) {
        if (i > 0) {
            i = -i;
        }
        this.m.left = i;
    }

    public void setInsetRight(int i) {
        if (i > 0) {
            i = -i;
        }
        this.m.right = i;
    }

    public void setInsetTop(int i) {
        if (i > 0) {
            i = -i;
        }
        this.m.top = i;
    }

    public void setMeasureFactor(float f) {
        if (f <= 0.0f) {
            this.l = a.g;
        }
        this.l = f;
    }

    public void setOffDrawable(Drawable drawable) {
        if (drawable != null) {
            this.b = drawable;
        } else {
            b0.i("off drawable can not be null");
        }
    }

    public void setOnDrawable(Drawable drawable) {
        if (drawable != null) {
            this.a = drawable;
        } else {
            b0.i("on drawable can not be null");
        }
    }

    public void setRadius(float f) {
        this.k = f;
    }

    public void setThumbDrawable(Drawable drawable) {
        if (drawable != null) {
            this.c = drawable;
        } else {
            b0.i("thumb drawable can not be null");
        }
    }

    public void setThumbMarginInPixel(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public void setThumbWidthAndHeightInPixel(int i, int i2) {
        if (i > 0) {
            this.h = i;
        }
        if (i2 > 0) {
            this.i = i2;
        }
    }

    public void setThumbMarginInPixel(int i) {
        setThumbMarginInPixel(i, i, i, i);
    }
}
