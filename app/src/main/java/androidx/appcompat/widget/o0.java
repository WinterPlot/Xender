package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.t0;
import androidx.core.view.w0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class o0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static o0 k;
    private static o0 l;
    private final View a;
    private final CharSequence b;
    private final int c;
    private final Runnable d;
    private final Runnable e;
    private int f;
    private int g;
    private p0 h;
    private boolean i;
    private boolean j;

    private o0(View view, CharSequence charSequence) {
        final int i = 0;
        this.d = new Runnable(this) { // from class: androidx.appcompat.widget.n0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                o0 o0Var = this.b;
                switch (i2) {
                    case 0:
                        o0Var.lambda$new$0();
                        break;
                    default:
                        o0Var.hide();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.e = new Runnable(this) { // from class: androidx.appcompat.widget.n0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                o0 o0Var = this.b;
                switch (i3) {
                    case 0:
                        o0Var.lambda$new$0();
                        break;
                    default:
                        o0Var.hide();
                        break;
                }
            }
        };
        this.a = view;
        this.b = charSequence;
        this.c = w0.getScaledHoverSlop(ViewConfiguration.get(view.getContext()));
        forceNextChangeSignificant();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void cancelPendingShow() {
        this.a.removeCallbacks(this.d);
    }

    private void forceNextChangeSignificant() {
        this.j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        show(false);
    }

    private void scheduleShow() {
        this.a.postDelayed(this.d, ViewConfiguration.getLongPressTimeout());
    }

    private static void setPendingHandler(o0 o0Var) {
        o0 o0Var2 = k;
        if (o0Var2 != null) {
            o0Var2.cancelPendingShow();
        }
        k = o0Var;
        if (o0Var != null) {
            o0Var.scheduleShow();
        }
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        o0 o0Var = k;
        if (o0Var != null && o0Var.a == view) {
            setPendingHandler(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new o0(view, charSequence);
            return;
        }
        o0 o0Var2 = l;
        if (o0Var2 != null && o0Var2.a == view) {
            o0Var2.hide();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean updateAnchorPos(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.j && Math.abs(x - this.f) <= this.c && Math.abs(y - this.g) <= this.c) {
            return false;
        }
        this.f = x;
        this.g = y;
        this.j = false;
        return true;
    }

    public void hide() {
        if (l == this) {
            l = null;
            p0 p0Var = this.h;
            if (p0Var != null) {
                p0Var.hide();
                this.h = null;
                forceNextChangeSignificant();
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            setPendingHandler(null);
        }
        this.a.removeCallbacks(this.e);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.h != null && this.i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                forceNextChangeSignificant();
                hide();
            }
        } else if (this.a.isEnabled() && this.h == null && updateAnchorPos(motionEvent)) {
            setPendingHandler(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.g = view.getHeight() / 2;
        show(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        hide();
    }

    public void show(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (this.a.isAttachedToWindow()) {
            setPendingHandler(null);
            o0 o0Var = l;
            if (o0Var != null) {
                o0Var.hide();
            }
            l = this;
            this.i = z;
            p0 p0Var = new p0(this.a.getContext());
            this.h = p0Var;
            p0Var.show(this.a, this.f, this.g, this.i, this.b);
            this.a.addOnAttachStateChangeListener(this);
            if (this.i) {
                j2 = 2500;
            } else {
                if ((t0.getWindowSystemUiVisibility(this.a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            this.a.removeCallbacks(this.e);
            this.a.postDelayed(this.e, j2);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
