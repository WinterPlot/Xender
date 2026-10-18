package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final w a = new w();

    private w() {
    }

    public static final int getCameraAudioRestriction(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        return cameraDevice.getCameraAudioRestriction();
    }

    public static final Set<Set<String>> getConcurrentCameraIds(CameraManager cameraManager) throws CameraAccessException {
        cameraManager.getClass();
        Set<Set<String>> concurrentCameraIds = cameraManager.getConcurrentCameraIds();
        concurrentCameraIds.getClass();
        return concurrentCameraIds;
    }

    public static final void setCameraAudioRestriction(CameraDevice cameraDevice, int i) throws CameraAccessException {
        cameraDevice.getClass();
        cameraDevice.setCameraAudioRestriction(i);
    }
}
