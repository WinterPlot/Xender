package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {
    public static final x get(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            x xVar = tag instanceof x ? (x) tag : null;
            if (xVar != null) {
                return xVar;
            }
            Object parentOrViewTreeDisjointParent = androidx.core.viewtree.a.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, x xVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, xVar);
    }
}
