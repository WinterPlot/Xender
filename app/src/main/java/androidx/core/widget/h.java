package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class h extends a {
    private final ListView z;

    public h(ListView listView) {
        super(listView);
        this.z = listView;
    }

    @Override // androidx.core.widget.a
    public boolean canTargetScrollHorizontally(int i) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean canTargetScrollVertically(int i) {
        ListView listView = this.z;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void scrollTargetBy(int i, int i2) {
        this.z.scrollListBy(i2);
    }
}
