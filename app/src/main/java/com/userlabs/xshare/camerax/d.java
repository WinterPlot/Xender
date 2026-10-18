package com.userlabs.xshare.camerax;

import androidx.camera.core.CameraState;
import androidx.lifecycle.i0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraXQRCodeScanFragment b;

    public /* synthetic */ d(CameraXQRCodeScanFragment cameraXQRCodeScanFragment, int i) {
        this.a = i;
        this.b = cameraXQRCodeScanFragment;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        int i = this.a;
        CameraXQRCodeScanFragment cameraXQRCodeScanFragment = this.b;
        switch (i) {
            case 0:
                cameraXQRCodeScanFragment.lambda$onViewCreated$5((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 1:
                cameraXQRCodeScanFragment.lambda$onViewCreated$6((com.userlabs.xshare.arch.entry.b) obj);
                break;
            default:
                cameraXQRCodeScanFragment.lambda$listenCameraState$11((CameraState) obj);
                break;
        }
    }
}
