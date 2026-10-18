package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ c(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                ((e) oVar).lambda$getAlphaAnimator$3(valueAnimator);
                break;
            case 1:
                ((e) oVar).lambda$getScaleAnimator$4(valueAnimator);
                break;
            default:
                ((k) oVar).lambda$getAlphaAnimator$6(valueAnimator);
                break;
        }
    }
}
