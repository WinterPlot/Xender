package com.userlabs.xshare.views.pathgallery;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    private int a;

    public f(int i) {
        this.a = i;
    }

    public static f createRootItem() {
        return new f(0);
    }

    public static f createSearchItem() {
        return new f(8);
    }

    public int getType() {
        return this.a;
    }

    public String getTypeDisplayName() {
        return "root";
    }

    public boolean isRootType() {
        return this.a == 0;
    }

    public boolean upIsHome() {
        return true;
    }
}
