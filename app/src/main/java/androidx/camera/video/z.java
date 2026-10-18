package androidx.camera.video;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static z of(Uri uri) {
        androidx.core.util.i.checkNotNull(uri, "OutputUri cannot be null.");
        return new e(uri);
    }

    public abstract Uri getOutputUri();
}
