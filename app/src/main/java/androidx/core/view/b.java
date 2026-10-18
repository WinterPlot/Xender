package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    private final Context a;
    private a b;
    private InterfaceC0131b c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onSubUiVisibilityChanged(boolean z);
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface InterfaceC0131b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public b(Context context) {
        this.a = context;
    }

    public Context getContext() {
        return this.a;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.c == null || !overridesItemVisibility()) {
            return;
        }
        this.c.onActionProviderVisibilityChanged(isVisible());
    }

    public void reset() {
        this.c = null;
        this.b = null;
    }

    public void setSubUiVisibilityListener(a aVar) {
        this.b = aVar;
    }

    public void setVisibilityListener(InterfaceC0131b interfaceC0131b) {
        if (this.c != null && interfaceC0131b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.c = interfaceC0131b;
    }

    public void subUiVisibilityChanged(boolean z) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.onSubUiVisibilityChanged(z);
        }
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }
}
