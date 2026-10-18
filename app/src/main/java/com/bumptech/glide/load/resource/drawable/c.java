package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.o;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.util.k;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c<T extends Drawable> implements s<T>, o {
    protected final T a;

    public c(T t) {
        this.a = (T) k.checkNotNull(t);
    }

    @Override // com.bumptech.glide.load.engine.s
    public final T get() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        return constantState == null ? this.a : (T) constantState.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.s
    public abstract /* synthetic */ Class getResourceClass();

    @Override // com.bumptech.glide.load.engine.s
    public abstract /* synthetic */ int getSize();

    @Override // com.bumptech.glide.load.engine.o
    public void initialize() {
        T t = this.a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof com.bumptech.glide.load.resource.gif.c) {
            ((com.bumptech.glide.load.resource.gif.c) t).getFirstFrame().prepareToDraw();
        }
    }

    @Override // com.bumptech.glide.load.engine.s
    public abstract /* synthetic */ void recycle();
}
