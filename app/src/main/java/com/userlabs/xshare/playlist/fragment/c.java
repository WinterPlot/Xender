package com.userlabs.xshare.playlist.fragment;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PLEditPlaylistFragment b;

    public /* synthetic */ c(PLEditPlaylistFragment pLEditPlaylistFragment, int i) {
        this.a = i;
        this.b = pLEditPlaylistFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        PLEditPlaylistFragment pLEditPlaylistFragment = this.b;
        switch (i) {
            case 0:
                pLEditPlaylistFragment.lambda$onViewCreated$1(view);
                break;
            case 1:
                pLEditPlaylistFragment.lambda$onViewCreated$2(view);
                break;
            default:
                pLEditPlaylistFragment.lambda$initToolbar$6(view);
                break;
        }
    }
}
