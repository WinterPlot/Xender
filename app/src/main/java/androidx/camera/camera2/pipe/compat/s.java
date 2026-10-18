package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import android.view.Surface;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final s a = new s();

    private s() {
    }

    public static final void addSurfaces(OutputConfiguration outputConfiguration, Surface surface) {
        outputConfiguration.getClass();
        surface.getClass();
        outputConfiguration.addSurface(surface);
    }

    public static final void enableSurfaceSharing(OutputConfiguration outputConfiguration) {
        outputConfiguration.getClass();
        outputConfiguration.enableSurfaceSharing();
    }

    public static final void finalizeOutputConfigurations(CameraCaptureSession cameraCaptureSession, List<OutputConfiguration> list) throws CameraAccessException {
        cameraCaptureSession.getClass();
        list.getClass();
        cameraCaptureSession.finalizeOutputConfigurations(list);
    }

    public static final List<Surface> getSurfaces(OutputConfiguration outputConfiguration) {
        outputConfiguration.getClass();
        List<Surface> surfaces = outputConfiguration.getSurfaces();
        surfaces.getClass();
        return surfaces;
    }

    public static final OutputConfiguration newOutputConfiguration(Size size, Class<?> cls) {
        size.getClass();
        cls.getClass();
        return r.e(size, cls);
    }

    public static final void onCaptureQueueEmpty(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        if (stateCallback != null) {
            stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
        }
    }
}
