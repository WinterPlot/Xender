package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class h implements ValueAnimator.AnimatorUpdateListener {
    private final View a;
    private final View b;
    private final float[] c = new float[2];

    public h(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        i.calculateFadeOutAndInAlphas(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c);
        View view = this.a;
        if (view != null) {
            view.setAlpha(this.c[0]);
        }
        View view2 = this.b;
        if (view2 != null) {
            view2.setAlpha(this.c[1]);
        }
    }
}
