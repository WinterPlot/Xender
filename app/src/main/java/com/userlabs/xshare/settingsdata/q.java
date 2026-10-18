package com.userlabs.xshare.settingsdata;

import android.content.Context;
import com.userlabs.xshare.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class q extends a {
    public q(Context context) {
        setItemType(21);
        setTitle(context.getString(R.string.x_settings_music_play_keep_playing));
        setChecked(com.userlabs.xshare.audioplayer.settings.d.isHeadphoneOutContinue());
    }

    @Override // com.userlabs.xshare.settingsdata.a
    public void itemCheckChange(Context context, boolean z) {
        com.userlabs.xshare.audioplayer.settings.d.setHeadphoneOutContinue(z);
    }

    @Override // com.userlabs.xshare.settingsdata.a
    public void itemClick(Context context) {
    }
}
