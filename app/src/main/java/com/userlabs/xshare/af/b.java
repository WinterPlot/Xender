package com.userlabs.xshare.af;

import com.userlabs.xshare.arch.repository.l;
import com.userlabs.xshare.ui.imageBrowser.PhoneImageBrowserViewModel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ b(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                c.lambda$saveToDb$0(list);
                break;
            case 1:
                l.deleteFileByPathListSync(list);
                break;
            case 2:
                com.userlabs.xshare.send.e.lambda$getTobeSendTask$0(list);
                break;
            default:
                PhoneImageBrowserViewModel.lambda$send$1(list);
                break;
        }
    }
}
