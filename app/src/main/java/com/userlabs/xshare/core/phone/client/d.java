package com.userlabs.xshare.core.phone.client;

import com.userlabs.xshare.playlist.fragment.viewmodel.PLEditPlaylistViewModel;
import com.userlabs.xshare.ui.activity.viewmodel.ShareToWAViewModel;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ d(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                e.sendRequestImportInfoToOneClient(str);
                break;
            case 1:
                com.userlabs.xshare.multiplatformconnection.db.d.lambda$clearByDid$1(str);
                break;
            case 2:
                PLEditPlaylistViewModel.lambda$deleteTempFileIfNeed$3(str);
                break;
            default:
                ShareToWAViewModel.lambda$exeDeleteCachedFile$1(str);
                break;
        }
    }
}
