package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements androidx.core.view.o0, androidx.core.widget.p {
    private final d a;
    private final l b;
    private boolean c;

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        g0.checkAppCompatTheme(this, getContext());
        d dVar = new d(this);
        this.a = dVar;
        dVar.loadFromAttributes(attributeSet, i);
        l lVar = new l(this);
        this.b = lVar;
        lVar.loadFromAttributes(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.a;
        if (dVar != null) {
            dVar.applySupportBackgroundTint();
        }
        l lVar = this.b;
        if (lVar != null) {
            lVar.applySupportImageTint();
        }
    }

    @Override // androidx.core.view.o0
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.getSupportBackgroundTintList();
        }
        return null;
    }

    @Override // androidx.core.view.o0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.getSupportBackgroundTintMode();
        }
        return null;
    }

    @Override // androidx.core.widget.p
    public ColorStateList getSupportImageTintList() {
        l lVar = this.b;
        if (lVar != null) {
            return lVar.getSupportImageTintList();
        }
        return null;
    }

    @Override // androidx.core.widget.p
    public PorterDuff.Mode getSupportImageTintMode() {
        l lVar = this.b;
        if (lVar != null) {
            return lVar.getSupportImageTintMode();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.b.hasOverlappingRendering() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.a;
        if (dVar != null) {
            dVar.onSetBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d dVar = this.a;
        if (dVar != null) {
            dVar.onSetBackgroundResource(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        l lVar = this.b;
        if (lVar != null) {
            lVar.applySupportImageTint();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        l lVar = this.b;
        if (lVar != null && drawable != null && !this.c) {
            lVar.obtainLevelFromDrawable(drawable);
        }
        super.setImageDrawable(drawable);
        l lVar2 = this.b;
        if (lVar2 != null) {
            lVar2.applySupportImageTint();
            if (this.c) {
                return;
            }
            this.b.applyImageLevel();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        l lVar = this.b;
        if (lVar != null) {
            lVar.setImageResource(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        l lVar = this.b;
        if (lVar != null) {
            lVar.applySupportImageTint();
        }
    }

    @Override // androidx.core.view.o0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.a;
        if (dVar != null) {
            dVar.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.core.view.o0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.a;
        if (dVar != null) {
            dVar.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // androidx.core.widget.p
    public void setSupportImageTintList(ColorStateList colorStateList) {
        l lVar = this.b;
        if (lVar != null) {
            lVar.setSupportImageTintList(colorStateList);
        }
    }

    @Override // androidx.core.widget.p
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        l lVar = this.b;
        if (lVar != null) {
            lVar.setSupportImageTintMode(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }
}
