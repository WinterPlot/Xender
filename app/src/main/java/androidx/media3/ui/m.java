package androidx.media3.ui;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((o) obj).lambda$new$0(valueAnimator);
                break;
            case 1:
                ((o) obj).lambda$new$1(valueAnimator);
                break;
            case 2:
                ((o) obj).lambda$new$2(valueAnimator);
                break;
            case 3:
                ((o) obj).lambda$new$3(valueAnimator);
                break;
            default:
                ((DefaultTimeBar) obj).lambda$new$1(valueAnimator);
                break;
        }
    }
}
