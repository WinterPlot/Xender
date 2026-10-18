package com.userlabs.xshare.ui.fragment.scanQRCode;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ OldCameraQrCodeScanFragment b;

    public /* synthetic */ d(OldCameraQrCodeScanFragment oldCameraQrCodeScanFragment, int i) {
        this.a = i;
        this.b = oldCameraQrCodeScanFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        OldCameraQrCodeScanFragment oldCameraQrCodeScanFragment = this.b;
        switch (i) {
            case 0:
                oldCameraQrCodeScanFragment.lambda$setupDes$8(view);
                break;
            case 1:
                oldCameraQrCodeScanFragment.lambda$onViewCreated$4(view);
                break;
            case 2:
                oldCameraQrCodeScanFragment.lambda$setupDes$9(view);
                break;
            default:
                oldCameraQrCodeScanFragment.lambda$onViewCreated$3(view);
                break;
        }
    }
}
