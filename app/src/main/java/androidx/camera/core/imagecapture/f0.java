package androidx.camera.core.imagecapture;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {
    public static f0 create(Size size, int i) {
        return new f(size, i);
    }

    public abstract int getInputFormat();

    public abstract Size getResolution();
}
