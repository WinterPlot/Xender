package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class m implements ValueAnimator.AnimatorUpdateListener {
    private final a a;
    private final View[] b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onAnimationUpdate(ValueAnimator valueAnimator, View view);
    }

    public m(a aVar, Collection<View> collection) {
        this.a = aVar;
        this.b = (View[]) collection.toArray(new View[0]);
    }

    public static m alphaListener(View... viewArr) {
        return new m(new l(3), viewArr);
    }

    public static m scaleListener(View... viewArr) {
        return new m(new l(1), viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setAlpha(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setScale(ValueAnimator valueAnimator, View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationX(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationY(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static m translationXListener(View... viewArr) {
        return new m(new l(0), viewArr);
    }

    public static m translationYListener(View... viewArr) {
        return new m(new l(2), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.b) {
            this.a.onAnimationUpdate(valueAnimator, view);
        }
    }

    public static m alphaListener(Collection<View> collection) {
        return new m(new l(3), collection);
    }

    public static m scaleListener(Collection<View> collection) {
        return new m(new l(1), collection);
    }

    public static m translationXListener(Collection<View> collection) {
        return new m(new l(0), collection);
    }

    public static m translationYListener(Collection<View> collection) {
        return new m(new l(2), collection);
    }

    public m(a aVar, View... viewArr) {
        this.a = aVar;
        this.b = viewArr;
    }
}
