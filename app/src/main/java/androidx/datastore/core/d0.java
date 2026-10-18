package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface d0<T> extends u<T> {
    @Override // androidx.datastore.core.u, androidx.datastore.core.d
    /* synthetic */ void close();

    @Override // androidx.datastore.core.u
    /* synthetic */ Object readData(kotlin.coroutines.d dVar);

    Object writeData(T t, kotlin.coroutines.d<? super kotlin.y> dVar);
}
