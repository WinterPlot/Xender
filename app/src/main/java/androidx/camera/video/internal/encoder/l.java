package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.core.impl.Timebase;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface l {
    Timebase getInputTimebase();

    String getMimeType();

    int getProfile();

    MediaFormat toMediaFormat() throws InvalidConfigException;
}
