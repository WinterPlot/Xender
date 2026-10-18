package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends Drawable implements Drawable.Callback {
    private int a;
    private long b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private g i;
    private Drawable j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private boolean p;
    private int v;

    public h(Drawable drawable, Drawable drawable2) {
        this(null);
        drawable = drawable == null ? f.a : drawable;
        this.j = drawable;
        drawable.setCallback(this);
        g gVar = this.i;
        gVar.b = drawable.getChangingConfigurations() | gVar.b;
        drawable2 = drawable2 == null ? f.a : drawable2;
        this.k = drawable2;
        drawable2.setCallback(this);
        this.i.b |= drawable2.getChangingConfigurations();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        int i2 = this.a;
        int i3 = 0;
        if (i2 == 1) {
            this.b = SystemClock.uptimeMillis();
            this.a = 2;
            z = false;
        } else if (i2 == 2 && this.b >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.b) / this.e;
            z = fUptimeMillis >= 1.0f;
            if (z) {
                this.a = 0;
            }
            this.f = (int) ((this.c * Math.min(fUptimeMillis, 1.0f)) + 0.0f);
        } else {
            z = true;
        }
        int i4 = this.f;
        boolean z2 = this.g;
        Drawable drawable = this.j;
        Drawable drawable2 = this.k;
        if (!z) {
            if (z2) {
                drawable.setAlpha(this.d - i4);
                i3 = 1;
            }
            drawable.draw(canvas);
            if (i3 != 0) {
                drawable.setAlpha(this.d);
            }
            if (i4 > 0) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.d);
            }
            invalidateSelf();
            return;
        }
        if (z2) {
            if (i4 == 0) {
            }
            i = this.d;
            if (i4 == i) {
                drawable2.setAlpha(i);
                drawable2.draw(canvas);
            }
        }
        i3 = i4;
        drawable.draw(canvas);
        i4 = i3;
        i = this.d;
        if (i4 == i) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        g gVar = this.i;
        return gVar.b | changingConfigurations | gVar.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!zaa()) {
            return null;
        }
        this.i.a = getChangingConfigurations();
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.j.getIntrinsicHeight(), this.k.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.j.getIntrinsicWidth(), this.k.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.p) {
            this.v = Drawable.resolveOpacity(this.j.getOpacity(), this.k.getOpacity());
            this.p = true;
        }
        return this.v;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (this.h || super.mutate() != this) {
            return this;
        }
        if (!zaa()) {
            j0.g("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            return null;
        }
        this.j.mutate();
        this.k.mutate();
        this.h = true;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.j.setBounds(rect);
        this.k.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f == this.d) {
            this.f = i;
        }
        this.d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        this.k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean zaa() {
        if (!this.l) {
            boolean z = false;
            if (this.j.getConstantState() != null && this.k.getConstantState() != null) {
                z = true;
            }
            this.m = z;
            this.l = true;
        }
        return this.m;
    }

    public final Drawable zab() {
        return this.k;
    }

    public final void zac(int i) {
        this.c = this.d;
        this.f = 0;
        this.e = 250;
        this.a = 1;
        invalidateSelf();
    }

    public h(g gVar) {
        this.a = 0;
        this.d = 255;
        this.f = 0;
        this.g = true;
        this.i = new g(gVar);
    }
}
