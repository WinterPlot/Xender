package com.userlabs.xshare.res.loaders;

import com.userlabs.xshare.ui.fragment.scanQRCode.OldCameraQrCodeScanFragment;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return p.lambda$getExecutor$0(runnable);
            default:
                return OldCameraQrCodeScanFragment.lambda$onCreate$2(runnable);
        }
    }
}
