package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {
    private final WeakReference<View> a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ e1 a;
        final /* synthetic */ View b;

        public a(e1 e1Var, View view) {
            this.a = e1Var;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.onAnimationCancel(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.onAnimationEnd(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.onAnimationStart(this.b);
        }
    }

    public d1(View view) {
        this.a = new WeakReference<>(view);
    }

    private void setListenerInternal(View view, e1 e1Var) {
        if (e1Var != null) {
            view.animate().setListener(new a(e1Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public d1 alpha(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public d1 alphaBy(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    public void cancel() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long getDuration() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public Interpolator getInterpolator() {
        View view = this.a.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long getStartDelay() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    public d1 rotation(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    public d1 rotationBy(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    public d1 rotationX(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    public d1 rotationXBy(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    public d1 rotationY(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    public d1 rotationYBy(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    public d1 scaleX(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public d1 scaleXBy(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    public d1 scaleY(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public d1 scaleYBy(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    public d1 setDuration(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public d1 setInterpolator(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public d1 setListener(e1 e1Var) {
        View view = this.a.get();
        if (view != null) {
            setListenerInternal(view, e1Var);
        }
        return this;
    }

    public d1 setStartDelay(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public d1 setUpdateListener(g1 g1Var) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(g1Var != null ? new c1(g1Var, view, 0) : null);
        }
        return this;
    }

    public void start() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public d1 translationX(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public d1 translationXBy(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    public d1 translationY(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public d1 translationYBy(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    public d1 translationZ(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationZ(f);
        }
        return this;
    }

    public d1 translationZBy(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationZBy(f);
        }
        return this;
    }

    public d1 withEndAction(Runnable runnable) {
        View view = this.a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    public d1 withLayer() {
        View view = this.a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    public d1 withStartAction(Runnable runnable) {
        View view = this.a.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    public d1 x(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    public d1 xBy(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    public d1 y(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    public d1 yBy(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    public d1 z(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().z(f);
        }
        return this;
    }

    public d1 zBy(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().zBy(f);
        }
        return this;
    }
}
