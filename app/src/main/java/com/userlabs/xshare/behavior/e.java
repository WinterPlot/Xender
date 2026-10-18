package com.userlabs.xshare.behavior;

import android.view.View;
import android.view.ViewGroup;
import com.userlabs.xshare.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    private final ViewGroup a;

    public e(ViewGroup viewGroup) {
        this.a = viewGroup;
        requestAlpha(0.0f);
    }

    public void requestAlpha(float f) {
        this.a.setAlpha(1.0f - Math.min(1.0f, f * 5.0f));
        View viewFindViewById = this.a.findViewById(R.id.music_player_top_bar_back);
        if (viewFindViewById != null) {
            viewFindViewById.setClickable(this.a.getAlpha() == 1.0f);
        }
        View viewFindViewById2 = this.a.findViewById(R.id.music_player_top_bar_more);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setClickable(this.a.getAlpha() == 1.0f);
        }
    }
}
