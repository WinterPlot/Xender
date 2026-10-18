package com.userlabs.xshare.zxing.camera;

import android.hardware.Camera;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private final int a;
    private final Camera b;
    private final CameraFacing c;
    private final int d;

    public f(int i, Camera camera, CameraFacing cameraFacing, int i2) {
        this.a = i;
        this.b = camera;
        this.c = cameraFacing;
        this.d = i2;
    }

    public Camera getCamera() {
        return this.b;
    }

    public CameraFacing getFacing() {
        return this.c;
    }

    public int getOrientation() {
        return this.d;
    }

    public String toString() {
        return "Camera #" + this.a + " : " + this.c + ',' + this.d;
    }
}
