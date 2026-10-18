package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class g extends Drawable.ConstantState {
    int a;
    int b;

    public g(g gVar) {
        if (gVar != null) {
            this.a = gVar.a;
            this.b = gVar.b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new h(this);
    }
}
