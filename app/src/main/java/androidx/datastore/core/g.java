package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface g<T> {
    Object cleanUp(kotlin.coroutines.d<? super kotlin.y> dVar);

    Object migrate(T t, kotlin.coroutines.d<? super T> dVar);

    Object shouldMigrate(T t, kotlin.coroutines.d<? super Boolean> dVar);
}
