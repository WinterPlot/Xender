package com.userlabs.xshare.camerax;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraXQRCodeScanFragment b;

    public /* synthetic */ a(CameraXQRCodeScanFragment cameraXQRCodeScanFragment, int i) {
        this.a = i;
        this.b = cameraXQRCodeScanFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        CameraXQRCodeScanFragment cameraXQRCodeScanFragment = this.b;
        switch (i) {
            case 0:
                cameraXQRCodeScanFragment.lambda$onViewCreated$2(view);
                break;
            case 1:
                cameraXQRCodeScanFragment.lambda$setupDes$7(view);
                break;
            case 2:
                cameraXQRCodeScanFragment.lambda$setupDes$8(view);
                break;
            default:
                cameraXQRCodeScanFragment.lambda$onViewCreated$3(view);
                break;
        }
    }
}
