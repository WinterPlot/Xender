package androidx.activity;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public static final b0 get(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.report_drawn);
            b0 b0Var = tag instanceof b0 ? (b0) tag : null;
            if (b0Var != null) {
                return b0Var;
            }
            Object parentOrViewTreeDisjointParent = androidx.core.viewtree.a.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, b0 b0Var) {
        view.getClass();
        b0Var.getClass();
        view.setTag(R.id.report_drawn, b0Var);
    }
}
