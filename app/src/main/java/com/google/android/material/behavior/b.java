package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class b extends e {
    @Override // com.google.android.material.behavior.e
    public <V extends View> int getSize(V v, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // com.google.android.material.behavior.e
    public int getTargetTranslation() {
        return 0;
    }

    @Override // com.google.android.material.behavior.e
    public int getViewEdge() {
        return 1;
    }

    @Override // com.google.android.material.behavior.e
    public <V extends View> ViewPropertyAnimator getViewTranslationAnimator(V v, int i) {
        return v.animate().translationY(i);
    }

    @Override // com.google.android.material.behavior.e
    public <V extends View> void setAdditionalHiddenOffset(V v, int i, int i2) {
        v.setTranslationY(i + i2);
    }

    @Override // com.google.android.material.behavior.e
    public <V extends View> void setViewTranslation(V v, int i) {
        v.setTranslationY(i);
    }
}
