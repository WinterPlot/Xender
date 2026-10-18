package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    private n() {
    }

    @Deprecated
    public static o getFactory(LayoutInflater layoutInflater) {
        layoutInflater.getFactory();
        return null;
    }

    @Deprecated
    public static void setFactory(LayoutInflater layoutInflater, o oVar) {
        layoutInflater.setFactory2(new a(oVar));
    }

    public static void setFactory2(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a implements LayoutInflater.Factory2 {
        public a(o oVar) {
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            throw null;
        }

        public String toString() {
            return getClass().getName().concat("{null}");
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            throw null;
        }
    }
}
