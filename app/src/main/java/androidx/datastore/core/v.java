package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface v<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, kotlin.coroutines.d<? super T> dVar);

    Object writeTo(T t, OutputStream outputStream, kotlin.coroutines.d<? super kotlin.y> dVar);
}
