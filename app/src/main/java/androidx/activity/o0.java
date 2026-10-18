package androidx.activity;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    public static final k0 get(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
            k0 k0Var = tag instanceof k0 ? (k0) tag : null;
            if (k0Var != null) {
                return k0Var;
            }
            Object parentOrViewTreeDisjointParent = androidx.core.viewtree.a.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, k0 k0Var) {
        view.getClass();
        k0Var.getClass();
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, k0Var);
    }
}
