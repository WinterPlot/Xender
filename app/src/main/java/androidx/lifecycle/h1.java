package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {
    public static final e1 get(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            e1 e1Var = tag instanceof e1 ? (e1) tag : null;
            if (e1Var != null) {
                return e1Var;
            }
            Object parentOrViewTreeDisjointParent = androidx.core.viewtree.a.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, e1 e1Var) {
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, e1Var);
    }
}
