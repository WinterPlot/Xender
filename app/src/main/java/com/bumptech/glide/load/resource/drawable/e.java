package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.s;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class e extends c<Drawable> {
    private e(Drawable drawable) {
        super(drawable);
    }

    public static s<Drawable> newInstance(Drawable drawable) {
        if (drawable != null) {
            return new e(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.resource.drawable.c, com.bumptech.glide.load.engine.s
    public Class<Drawable> getResourceClass() {
        return this.a.getClass();
    }

    @Override // com.bumptech.glide.load.resource.drawable.c, com.bumptech.glide.load.engine.s
    public int getSize() {
        return Math.max(1, this.a.getIntrinsicHeight() * this.a.getIntrinsicWidth() * 4);
    }

    @Override // com.bumptech.glide.load.resource.drawable.c, com.bumptech.glide.load.engine.s
    public void recycle() {
    }
}
