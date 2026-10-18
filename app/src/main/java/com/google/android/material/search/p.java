package com.google.android.material.search;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n.f b;

    public /* synthetic */ p(n.f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        n.f fVar = this.b;
        switch (i) {
            case 0:
                fVar.lambda$getToolbarAlphaAnimator$1(valueAnimator);
                break;
            case 1:
                fVar.lambda$getBackgroundAlphaAnimator$0(valueAnimator);
                break;
            default:
                fVar.lambda$getDummyTextViewWidthAnimator$2(valueAnimator);
                break;
        }
    }
}
