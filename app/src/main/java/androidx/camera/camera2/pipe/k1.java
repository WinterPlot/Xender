package androidx.camera.camera2.pipe;

import android.hardware.camera2.MultiResolutionImageReader;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface k1 {
    MultiResolutionImageReader a(Collection<? extends MultiResolutionStreamInfo> collection, int i, int i2, Long l, Boolean bool);

    void b(MultiResolutionImageReader multiResolutionImageReader, Executor executor, z zVar);

    boolean c();
}
