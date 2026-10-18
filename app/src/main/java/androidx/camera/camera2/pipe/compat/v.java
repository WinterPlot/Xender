package androidx.camera.camera2.pipe.compat;

import android.media.ImageReader;
import android.media.ImageWriter;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final v a = new v();

    private v() {
    }

    public static final ImageReader imageReaderNewInstance(int i, int i2, int i3, int i4, long j) {
        ImageReader imageReaderNewInstance = ImageReader.newInstance(i, i2, i3, i4, j);
        imageReaderNewInstance.getClass();
        return imageReaderNewInstance;
    }

    public static final ImageWriter imageWriterNewInstance(Surface surface, int i, int i2) {
        surface.getClass();
        ImageWriter imageWriterNewInstance = ImageWriter.newInstance(surface, i, i2);
        imageWriterNewInstance.getClass();
        return imageWriterNewInstance;
    }
}
