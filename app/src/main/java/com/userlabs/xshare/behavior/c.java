package com.userlabs.xshare.behavior;

import android.view.View;
import android.view.ViewGroup;
import com.userlabs.xshare.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private final ViewGroup a;

    public c(ViewGroup viewGroup) {
        this.a = viewGroup;
        requestAlpha(0.0f);
    }

    public void requestAlpha(float f) {
        this.a.setAlpha(f);
        View viewFindViewById = this.a.findViewById(R.id.music_player_mini_bar_player);
        if (viewFindViewById != null) {
            viewFindViewById.setClickable(this.a.getAlpha() == 1.0f);
        }
        ViewGroup viewGroup = this.a;
        viewGroup.setClickable(viewGroup.getAlpha() == 1.0f);
    }
}
