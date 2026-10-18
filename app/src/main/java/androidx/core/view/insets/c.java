package androidx.core.view.insets;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                dVar.lambda$animateInsetsAmount$1(valueAnimator);
                break;
            default:
                dVar.lambda$animateAlpha$0(valueAnimator);
                break;
        }
    }
}
