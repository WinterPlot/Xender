package com.userlabs.xshare.behavior;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private final View a;

    public b(View view) {
        this.a = view;
        requestAlpha(0.0f);
    }

    public void requestAlpha(float f) {
        this.a.setAlpha(f);
    }
}
