package com.userlabs.xshare.playlist.fragment.viewmodel;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(Object obj, Comparable comparable, int i) {
        this.a = i;
        this.c = obj;
        this.b = comparable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        Comparable comparable = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((PLAudioSearchViewModel.a) obj).lambda$run$1((String) comparable);
                break;
            case 1:
                ((PLAllSongsSearchViewModel) obj).lambda$startSearch$3((String) comparable);
                break;
            case 2:
                ((PLEditPlaylistViewModel) obj).lambda$handBackFromGallery$1((String) comparable);
                break;
            default:
                ((PLEditPlaylistViewModel) obj).lambda$handBackFromGallery$2((Uri) comparable);
                break;
        }
    }
}
