package androidx.camera.camera2.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c a = new c();

    private c() {
    }

    public static final void onReadoutStarted(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        captureCallback.getClass();
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureCallback.onReadoutStarted(cameraCaptureSession, captureRequest, j, j2);
    }

    public static final void setSettingsOverrideZoom(Map<CaptureRequest.Key<?>, Object> map) {
        map.getClass();
        map.put(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }
}
