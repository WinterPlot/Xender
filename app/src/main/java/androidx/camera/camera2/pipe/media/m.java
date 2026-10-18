package androidx.camera.camera2.pipe.media;

import android.view.Surface;
import androidx.camera.camera2.pipe.g1;
import androidx.camera.camera2.pipe.z1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface m extends z1, AutoCloseable {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onExpectedOutputs(long j, Set<g1> set);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        /* JADX INFO: renamed from: onImage-AQuxepk */
        void mo720onImageAQuxepk(int i, int i2, p pVar);
    }

    void flush();

    int getCapacity();

    a getOnExpectedOutputsListener();

    b getOnImageListener();

    Surface getSurface();

    void setOnExpectedOutputsListener(a aVar);

    void setOnImageListener(b bVar);

    @Override // androidx.camera.camera2.pipe.z1
    /* synthetic */ Object unwrapAs(kotlin.reflect.c cVar);
}
