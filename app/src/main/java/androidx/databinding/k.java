package androidx.databinding;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface k<K, V> extends Map<K, V> {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a<T extends k<K, V>, K, V> {
        public abstract void onMapChanged(T t, K k);
    }

    void b(a<? extends k<K, V>, K, V> aVar);

    void c(a<? extends k<K, V>, K, V> aVar);
}
