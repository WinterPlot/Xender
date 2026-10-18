package androidx.camera.video.internal.compat.quirk;

import androidx.camera.core.impl.i2;
import androidx.camera.video.internal.encoder.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDefaultDataSpaceQuirk implements i2 {
    public static boolean load() {
        return true;
    }

    public j0 getSuggestedDataSpace() {
        return j0.c;
    }
}
