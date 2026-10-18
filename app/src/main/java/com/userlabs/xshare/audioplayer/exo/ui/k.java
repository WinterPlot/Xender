package com.userlabs.xshare.audioplayer.exo.ui;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ XMpLyricsFragment b;

    public /* synthetic */ k(XMpLyricsFragment xMpLyricsFragment, int i) {
        this.a = i;
        this.b = xMpLyricsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        XMpLyricsFragment xMpLyricsFragment = this.b;
        switch (i) {
            case 0:
                xMpLyricsFragment.lambda$initSuggestionView$14(view);
                break;
            case 1:
                xMpLyricsFragment.lambda$initSuggestionView$15(view);
                break;
            case 2:
                xMpLyricsFragment.lambda$initEditLayer$13(view);
                break;
            case 3:
                xMpLyricsFragment.lambda$setViewsListener$8(view);
                break;
            case 4:
                xMpLyricsFragment.lambda$setViewsListener$9(view);
                break;
            default:
                xMpLyricsFragment.lambda$setViewsListener$10(view);
                break;
        }
    }
}
