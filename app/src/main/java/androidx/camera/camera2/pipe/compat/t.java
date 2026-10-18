package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.session.MediaSessionManager;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class t {
    public static /* synthetic */ SessionConfiguration a(int i, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        return new SessionConfiguration(i, list, executor, stateCallback);
    }

    public static /* synthetic */ MediaSessionManager.RemoteUserInfo b(int i, int i2, String str) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }
}
