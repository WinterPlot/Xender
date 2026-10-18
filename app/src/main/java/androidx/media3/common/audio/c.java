package androidx.media3.common.audio;

import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ e a;

    public /* synthetic */ c(e eVar) {
        this.a = eVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.a.handlePlatformAudioFocusChange(i);
    }
}
