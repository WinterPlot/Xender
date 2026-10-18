package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onCloseMenu(g gVar, boolean z);

        boolean onOpenSubMenu(g gVar);
    }

    boolean collapseItemActionView(g gVar, j jVar);

    boolean expandItemActionView(g gVar, j jVar);

    boolean flagActionItems();

    int getId();

    o getMenuView(ViewGroup viewGroup);

    void initForMenu(Context context, g gVar);

    void onCloseMenu(g gVar, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(s sVar);

    void setCallback(a aVar);

    void updateMenuView(boolean z);
}
