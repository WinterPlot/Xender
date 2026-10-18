package com.google.android.material.listitem;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public interface e {
    int getSwipeMaxOvershoot();

    boolean isSwipeEnabled();

    void onSwipe(int i);

    <T extends View & d> void onSwipeStateChanged(int i, T t, int i2);

    void setSwipeEnabled(boolean z);
}
