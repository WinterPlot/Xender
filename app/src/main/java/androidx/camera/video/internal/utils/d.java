package androidx.camera.video.internal.utils;

import android.media.MediaFormat;
import kotlin.text.e0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    private d() {
    }

    public final boolean isVideo(MediaFormat mediaFormat) {
        mediaFormat.getClass();
        String string = mediaFormat.getString("mime");
        if (string != null) {
            return e0.startsWith$default(string, "video/", false, 2, null);
        }
        return false;
    }
}
