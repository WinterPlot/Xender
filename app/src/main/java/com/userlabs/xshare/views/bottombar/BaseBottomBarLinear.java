package com.userlabs.xshare.views.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import com.userlabs.xshare.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class BaseBottomBarLinear extends LinearLayout {
    private AnimatorSet a;
    private AnimatorSet b;
    private int c;
    private final int d;
    private final int e;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseBottomBarLinear.this.consumePendingAnim();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseBottomBarLinear.this.setVisibility(8);
            BaseBottomBarLinear.this.clearAnimation();
            BaseBottomBarLinear.this.consumePendingAnim();
        }
    }

    public BaseBottomBarLinear(Context context) {
        super(context);
        this.c = 0;
        this.d = 1;
        this.e = 2;
    }

    private void cancelDismissAnim() {
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    private void cancelShowAnim() {
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void consumePendingAnim() {
        int i = this.c;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.c = 0;
            showWithAnim();
        } else if (i == 2) {
            this.c = 0;
            dismissWithAnim();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    public void dismissWithAnim() {
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null || !animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.a;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                this.c = 2;
                this.a.cancel();
                return;
            }
            if (getVisibility() != 0) {
                return;
            }
            if (this.b == null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, getContext().getResources().getDimensionPixelOffset(R.dimen.x_dp_54));
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.b = animatorSet3;
                animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                this.b.setDuration(200L);
                this.b.setInterpolator(new AccelerateInterpolator());
            }
            this.b.removeAllListeners();
            this.b.addListener(new b());
            this.b.start();
        }
    }

    public void dismissWithoutAnim() {
        this.c = 0;
        cancelShowAnim();
        cancelDismissAnim();
        setVisibility(8);
        clearAnimation();
    }

    public void showWithAnim(long j) {
        AnimatorSet animatorSet = this.a;
        if (animatorSet == null || !animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.b;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                this.c = 1;
                this.b.cancel();
                return;
            }
            if (getVisibility() == 0) {
                return;
            }
            setVisibility(0);
            if (this.a == null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", getContext().getResources().getDimensionPixelOffset(R.dimen.x_dp_54), 0.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setStartDelay(j);
                objectAnimatorOfFloat2.setStartDelay(j);
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.a = animatorSet3;
                animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                this.a.setDuration(200L);
                this.a.setInterpolator(new AccelerateInterpolator());
            }
            this.a.removeAllListeners();
            this.a.addListener(new a());
            this.a.start();
        }
    }

    public BaseBottomBarLinear(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.d = 1;
        this.e = 2;
    }

    public void showWithAnim() {
        showWithAnim(0L);
    }
}
