package androidx.camera.camera2.pipe.media;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import androidx.camera.camera2.pipe.z1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface p extends z1, AutoCloseable {
    Rect getCropRect();

    int getFormat();

    HardwareBuffer getHardwareBuffer();

    int getHeight();

    List<j> getPlanes();

    long getTimestamp();

    int getWidth();

    void setCropRect(Rect rect);

    @Override // androidx.camera.camera2.pipe.z1
    /* synthetic */ Object unwrapAs(kotlin.reflect.c cVar);
}
