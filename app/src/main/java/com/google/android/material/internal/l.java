package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements m.a {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i) {
        this.a = i;
    }

    @Override // com.google.android.material.internal.m.a
    public final void onAnimationUpdate(ValueAnimator valueAnimator, View view) {
        switch (this.a) {
            case 0:
                m.setTranslationX(valueAnimator, view);
                break;
            case 1:
                m.setScale(valueAnimator, view);
                break;
            case 2:
                m.setTranslationY(valueAnimator, view);
                break;
            default:
                m.setAlpha(valueAnimator, view);
                break;
        }
    }
}
