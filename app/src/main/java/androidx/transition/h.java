package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class h {
    private Context a;
    private int b;
    private ViewGroup c;
    private View d;
    private Runnable e;
    private Runnable f;

    public h(ViewGroup viewGroup, View view) {
        this.b = -1;
        this.c = viewGroup;
        this.d = view;
    }

    public static h getCurrentScene(ViewGroup viewGroup) {
        return (h) viewGroup.getTag(R.id.transition_current_scene);
    }

    public static h getSceneForLayout(ViewGroup viewGroup, int i, Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(R.id.transition_scene_layoutid_cache);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(R.id.transition_scene_layoutid_cache, sparseArray);
        }
        h hVar = (h) sparseArray.get(i);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(viewGroup, i, context);
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    public static void setCurrentScene(ViewGroup viewGroup, h hVar) {
        viewGroup.setTag(R.id.transition_current_scene, hVar);
    }

    public void enter() {
        if (this.b > 0 || this.d != null) {
            getSceneRoot().removeAllViews();
            if (this.b > 0) {
                LayoutInflater.from(this.a).inflate(this.b, this.c);
            } else {
                this.c.addView(this.d);
            }
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        setCurrentScene(this.c, this);
    }

    public void exit() {
        Runnable runnable;
        if (getCurrentScene(this.c) != this || (runnable = this.f) == null) {
            return;
        }
        runnable.run();
    }

    public ViewGroup getSceneRoot() {
        return this.c;
    }

    public boolean isCreatedFromLayoutResource() {
        return this.b > 0;
    }

    public void setEnterAction(Runnable runnable) {
        this.e = runnable;
    }

    public void setExitAction(Runnable runnable) {
        this.f = runnable;
    }

    private h(ViewGroup viewGroup, int i, Context context) {
        this.a = context;
        this.c = viewGroup;
        this.b = i;
    }

    public h(ViewGroup viewGroup) {
        this.b = -1;
        this.c = viewGroup;
    }
}
