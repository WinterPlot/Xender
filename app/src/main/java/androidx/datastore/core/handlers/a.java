package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.e;
import kotlin.coroutines.d;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements e<T> {
    @Override // androidx.datastore.core.e
    public Object handleCorruption(CorruptionException corruptionException, d<? super T> dVar) throws CorruptionException {
        throw corruptionException;
    }
}
