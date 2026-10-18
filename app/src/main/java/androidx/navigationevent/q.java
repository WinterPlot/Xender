package androidx.navigationevent;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final d get(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            d dVar = tag instanceof d ? (d) tag : null;
            if (dVar != null) {
                return dVar;
            }
            Object parentOrViewTreeDisjointParent = androidx.core.viewtree.a.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, d dVar) {
        view.getClass();
        view.setTag(R.id.view_tree_navigation_event_dispatcher_owner, dVar);
    }
}
