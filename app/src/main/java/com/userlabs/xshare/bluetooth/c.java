package com.userlabs.xshare.bluetooth;

import com.userlabs.xshare.qr.QrCodeScanResultViewModel;
import com.userlabs.xshare.setname.h;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return d.getShareFileInternal();
            case 1:
                return com.userlabs.xshare.http.b.getUserAgent();
            case 2:
                return QrCodeScanResultViewModel.lambda$checkWifiConnected$1();
            default:
                return h.lambda$generateTempPhotoSavePath$2();
        }
    }
}
