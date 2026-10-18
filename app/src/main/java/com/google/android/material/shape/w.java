package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
class w extends u {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (w.this.e.isEmpty()) {
                return;
            }
            outline.setPath(w.this.e);
        }
    }

    public w(View view) {
        initMaskOutlineProvider(view);
    }

    private void initMaskOutlineProvider(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // com.google.android.material.shape.u
    public void invalidateClippingMethod(View view) {
        view.setClipToOutline(!shouldUseCompatClipping());
        if (shouldUseCompatClipping()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.u
    public boolean shouldUseCompatClipping() {
        return this.a;
    }
}
