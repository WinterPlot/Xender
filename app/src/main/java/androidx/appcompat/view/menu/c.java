package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.q0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
abstract class c {
    final Context a;
    private q0<androidx.core.internal.view.b, MenuItem> b;
    private q0<Object, SubMenu> c;

    public c(Context context) {
        this.a = context;
    }

    public final MenuItem getMenuItemWrapper(MenuItem menuItem) {
        if (!(menuItem instanceof androidx.core.internal.view.b)) {
            return menuItem;
        }
        androidx.core.internal.view.b bVar = (androidx.core.internal.view.b) menuItem;
        q0<androidx.core.internal.view.b, MenuItem> q0Var = this.b;
        if (q0Var == null) {
            q0Var = new q0<>();
            this.b = q0Var;
        }
        MenuItem menuItem2 = q0Var.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k kVar = new k(this.a, bVar);
        this.b.put(bVar, kVar);
        return kVar;
    }

    public final void internalClear() {
        q0<androidx.core.internal.view.b, MenuItem> q0Var = this.b;
        if (q0Var != null) {
            q0Var.clear();
        }
        q0<Object, SubMenu> q0Var2 = this.c;
        if (q0Var2 != null) {
            q0Var2.clear();
        }
    }

    public final void internalRemoveGroup(int i) {
        if (this.b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.b.size()) {
            if (this.b.keyAt(i2).getGroupId() == i) {
                this.b.removeAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void internalRemoveItem(int i) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (this.b.keyAt(i2).getItemId() == i) {
                this.b.removeAt(i2);
                return;
            }
        }
    }

    public final SubMenu getSubMenuWrapper(SubMenu subMenu) {
        return subMenu;
    }
}
