package com.userlabs.xshare.zxing.camera;

import android.hardware.Camera;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    private static final String a = "com.userlabs.xshare.zxing.camera.g";

    private g() {
    }

    public static f open(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            if (com.userlabs.xshare.core.log.h.a) {
                Log.w(a, "No cameras!");
            }
            return null;
        }
        if (i >= numberOfCameras) {
            if (com.userlabs.xshare.core.log.h.a) {
                Log.w(a, "Requested camera does not exist: " + i);
            }
            return null;
        }
        if (i <= -1) {
            i = 0;
            int i2 = 0;
            while (i2 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                if (CameraFacing.values()[cameraInfo.facing] == CameraFacing.BACK) {
                    break;
                }
                i2++;
            }
            if (i2 != numberOfCameras) {
                i = i2;
            } else if (com.userlabs.xshare.core.log.h.a) {
                Log.i(a, "No camera facing " + CameraFacing.BACK + "; returning camera #0");
            }
        }
        if (com.userlabs.xshare.core.log.h.a) {
            Log.i(a, "Opening camera #" + i);
        }
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo2);
        Camera cameraOpen = Camera.open(i);
        if (cameraOpen == null) {
            return null;
        }
        return new f(i, cameraOpen, CameraFacing.values()[cameraInfo2.facing], cameraInfo2.orientation);
    }
}
