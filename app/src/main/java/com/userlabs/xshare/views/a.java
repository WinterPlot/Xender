package com.userlabs.xshare.views;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ a(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                ((CenterRippleView.a) view).lambda$setValueAnimator$0(valueAnimator);
                break;
            case 1:
                ((ConnectSearchView.b) view).lambda$setValueAnimator$0(valueAnimator);
                break;
            default:
                ((LineRippleView.a) view).lambda$setValueAnimator$0(valueAnimator);
                break;
        }
    }
}
