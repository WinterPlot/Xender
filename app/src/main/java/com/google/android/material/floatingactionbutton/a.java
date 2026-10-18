package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
class a {
    private Animator a;

    public void cancelCurrent() {
        Animator animator = this.a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void clear() {
        this.a = null;
    }

    public void onNextAnimationStart(Animator animator) {
        cancelCurrent();
        this.a = animator;
    }
}
