package com.userlabs.xshare.audioplayer.exo.model;

import com.userlabs.xshare.audioplayer.lyrics.e;
import com.userlabs.xshare.audioplayer.lyrics.g;
import com.userlabs.xshare.audioplayer.lyrics.p;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements e, g {
    public final /* synthetic */ int a;
    public final /* synthetic */ XMpLyricsFragmentViewModel b;

    public /* synthetic */ a(XMpLyricsFragmentViewModel xMpLyricsFragmentViewModel, int i) {
        this.a = i;
        this.b = xMpLyricsFragmentViewModel;
    }

    @Override // com.userlabs.xshare.audioplayer.lyrics.e
    public void onCallback(boolean z) {
        this.b.lambda$connectLyrics$2(z);
    }

    @Override // com.userlabs.xshare.audioplayer.lyrics.g
    public void onResult(p pVar) {
        int i = this.a;
        XMpLyricsFragmentViewModel xMpLyricsFragmentViewModel = this.b;
        switch (i) {
            case 1:
                xMpLyricsFragmentViewModel.lambda$ensureLoadPendingLyrics$0(pVar);
                break;
            default:
                xMpLyricsFragmentViewModel.lambda$ensureLoadPendingLyrics$1(pVar);
                break;
        }
    }
}
