package com.userlabs.xshare.playlist.fragment;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PLTabAllAudioFragment b;

    public /* synthetic */ i(PLTabAllAudioFragment pLTabAllAudioFragment, int i) {
        this.a = i;
        this.b = pLTabAllAudioFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        PLTabAllAudioFragment pLTabAllAudioFragment = this.b;
        switch (i) {
            case 0:
                pLTabAllAudioFragment.lambda$addSearchLayout$5(view);
                break;
            default:
                pLTabAllAudioFragment.lambda$addSwitchLayout$6(view);
                break;
        }
    }
}
