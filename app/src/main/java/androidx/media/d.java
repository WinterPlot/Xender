package androidx.media;

import android.media.session.MediaSessionManager;
import androidx.camera.camera2.pipe.compat.t;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class d extends e {
    final MediaSessionManager.RemoteUserInfo d;

    public d(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        this.d = remoteUserInfo;
    }

    public static String getPackageName(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }

    public d(String str, int i, int i2) {
        super(str, i, i2);
        this.d = t.b(i, i2, str);
    }
}
