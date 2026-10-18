package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageButton;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((View) obj).setAlpha(0.0f);
                break;
            case 1:
                n.lambda$addDrawerArrowDrawableAnimatorIfNeeded$3((androidx.appcompat.graphics.drawable.d) obj, valueAnimator);
                break;
            case 2:
                n.lambda$addFadeThroughDrawableAnimatorIfNeeded$4((com.google.android.material.internal.g) obj, valueAnimator);
                break;
            case 3:
                n.lambda$addBackButtonAnimatorIfNeeded$2((ImageButton) obj, valueAnimator);
                break;
            default:
                ((n.g) obj).lambda$addTextFadeAnimatorIfNeeded$2(valueAnimator);
                break;
        }
    }
}
