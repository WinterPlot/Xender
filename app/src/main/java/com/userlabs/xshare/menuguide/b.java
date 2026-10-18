package com.userlabs.xshare.menuguide;

import android.app.Activity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public String a = "BaseMenuGuideItem";
    private int b;

    public b(int i) {
        this.b = i;
    }

    public void addItem(List<b> list) {
        if (needAdd()) {
            list.add(this);
        }
    }

    public abstract void click(Activity activity);

    public int getIconResId() {
        return this.b;
    }

    public abstract boolean needAdd();
}
