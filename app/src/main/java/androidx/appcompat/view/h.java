package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.d1;
import androidx.core.view.e1;
import androidx.core.view.f1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class h {
    private Interpolator c;
    e1 d;
    private boolean e;
    private long b = -1;
    private final f1 f = new a();
    final ArrayList<d1> a = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends f1 {
        private boolean a = false;
        private int b = 0;

        public a() {
        }

        @Override // androidx.core.view.f1, androidx.core.view.e1
        public void onAnimationEnd(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == h.this.a.size()) {
                e1 e1Var = h.this.d;
                if (e1Var != null) {
                    e1Var.onAnimationEnd(null);
                }
                onEnd();
            }
        }

        @Override // androidx.core.view.f1, androidx.core.view.e1
        public void onAnimationStart(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            e1 e1Var = h.this.d;
            if (e1Var != null) {
                e1Var.onAnimationStart(null);
            }
        }

        public void onEnd() {
            this.b = 0;
            this.a = false;
            h.this.onAnimationsEnded();
        }
    }

    public void cancel() {
        if (this.e) {
            ArrayList<d1> arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                d1 d1Var = arrayList.get(i);
                i++;
                d1Var.cancel();
            }
            this.e = false;
        }
    }

    public void onAnimationsEnded() {
        this.e = false;
    }

    public h play(d1 d1Var) {
        if (!this.e) {
            this.a.add(d1Var);
        }
        return this;
    }

    public h playSequentially(d1 d1Var, d1 d1Var2) {
        this.a.add(d1Var);
        d1Var2.setStartDelay(d1Var.getDuration());
        this.a.add(d1Var2);
        return this;
    }

    public h setDuration(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public h setInterpolator(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public h setListener(e1 e1Var) {
        if (!this.e) {
            this.d = e1Var;
        }
        return this;
    }

    public void start() {
        if (this.e) {
            return;
        }
        ArrayList<d1> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            d1 d1Var = arrayList.get(i);
            i++;
            d1 d1Var2 = d1Var;
            long j = this.b;
            if (j >= 0) {
                d1Var2.setDuration(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                d1Var2.setInterpolator(interpolator);
            }
            if (this.d != null) {
                d1Var2.setListener(this.f);
            }
            d1Var2.start();
        }
        this.e = true;
    }
}
