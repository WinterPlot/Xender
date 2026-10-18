package androidx.camera.camera2.pipe;

import android.hardware.camera2.CaptureRequest;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface j1 {
    void clear();

    <T> T get(CaptureRequest.Key<T> key);

    <T> T get(e1.a<T> aVar);

    <T> boolean remove(CaptureRequest.Key<T> key);

    <T> boolean remove(e1.a<T> aVar);

    boolean removeAll(Set<?> set);

    <T> void set(CaptureRequest.Key<T> key, T t);

    <T> void set(e1.a<T> aVar, T t);

    void setAll(Map<Object, ? extends Object> map);
}
