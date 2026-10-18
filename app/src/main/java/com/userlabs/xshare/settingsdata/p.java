package com.userlabs.xshare.settingsdata;

import android.content.Context;
import com.userlabs.xshare.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class p extends a {
    public p(Context context) {
        setItemType(21);
        setTitle(context.getString(R.string.x_settings_music_play_simultaneous_playback));
        setChecked(com.userlabs.xshare.audioplayer.settings.d.isIgnoreAudioFocus());
    }

    @Override // com.userlabs.xshare.settingsdata.a
    public void itemCheckChange(Context context, boolean z) {
        com.userlabs.xshare.audioplayer.settings.d.setIgnoreAudioFocus(z);
    }

    @Override // com.userlabs.xshare.settingsdata.a
    public void itemClick(Context context) {
    }
}
