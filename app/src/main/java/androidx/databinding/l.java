package androidx.databinding;

import androidx.lifecycle.x;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
interface l<T> {
    void addListener(T t);

    q<T> getListener();

    void removeListener(T t);

    void setLifecycleOwner(x xVar);
}
