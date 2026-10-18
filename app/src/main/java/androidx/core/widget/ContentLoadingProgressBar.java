package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    long a;
    boolean b;
    boolean c;
    boolean d;
    private final Runnable e;
    private final Runnable f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = -1L;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = new e(this, 0);
        this.f = new e(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideOnUiThread() {
        this.d = true;
        removeCallbacks(this.f);
        this.c = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.a;
        long j2 = jCurrentTimeMillis - j;
        if (j2 >= 500 || j == -1) {
            setVisibility(8);
        } else {
            if (this.b) {
                return;
            }
            postDelayed(this.e, 500 - j2);
            this.b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.b = false;
        this.a = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        this.c = false;
        if (this.d) {
            return;
        }
        this.a = System.currentTimeMillis();
        setVisibility(0);
    }

    private void removeCallbacks() {
        removeCallbacks(this.e);
        removeCallbacks(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOnUiThread() {
        this.a = -1L;
        this.d = false;
        removeCallbacks(this.e);
        this.b = false;
        if (this.c) {
            return;
        }
        postDelayed(this.f, 500L);
        this.c = true;
    }

    public void hide() {
        post(new e(this, 3));
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    public void show() {
        post(new e(this, 2));
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }
}
