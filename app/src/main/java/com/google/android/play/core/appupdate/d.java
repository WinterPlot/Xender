package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        public abstract d build();

        public abstract a setAllowAssetPackDeletion(boolean z);

        public abstract a setAppUpdateType(int i);
    }

    public static d defaultOptions(int i) {
        return newBuilder(i).build();
    }

    public static a newBuilder(int i) {
        a0 a0Var = new a0();
        a0Var.setAppUpdateType(i);
        a0Var.setAllowAssetPackDeletion(false);
        return a0Var;
    }

    public abstract boolean allowAssetPackDeletion();

    public abstract int appUpdateType();
}
