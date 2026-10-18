package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import androidx.camera.core.impl.utils.n;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class d {
    private d() {
    }

    public static void close(ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static Image dequeueInputImage(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setOnImageReleasedListener$1(Executor executor, final ImageWriter.OnImageReleasedListener onImageReleasedListener, final ImageWriter imageWriter) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.internal.compat.b
            @Override // java.lang.Runnable
            public final void run() {
                onImageReleasedListener.onImageReleased(imageWriter);
            }
        });
    }

    public static ImageWriter newInstance(Surface surface, int i) {
        return ImageWriter.newInstance(surface, i);
    }

    public static void queueInputImage(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }

    public static void setOnImageReleasedListener(ImageWriter imageWriter, final ImageWriter.OnImageReleasedListener onImageReleasedListener, final Executor executor) {
        imageWriter.setOnImageReleasedListener(new ImageWriter.OnImageReleasedListener() { // from class: androidx.camera.core.internal.compat.c
            @Override // android.media.ImageWriter.OnImageReleasedListener
            public final void onImageReleased(ImageWriter imageWriter2) {
                d.lambda$setOnImageReleasedListener$1(executor, onImageReleasedListener, imageWriter2);
            }
        }, n.getInstance());
    }
}
