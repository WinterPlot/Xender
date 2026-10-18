package com.google.android.material.listitem;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.k;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
class c {
    private c() {
    }

    public static boolean isRightAligned(View view) {
        int i;
        if (!(view.getLayoutParams() instanceof FrameLayout.LayoutParams) || (i = ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity) == -1) {
            i = 8388613;
        }
        return (k.getAbsoluteGravity(i, view.getLayoutDirection()) & 7) == 5;
    }
}
