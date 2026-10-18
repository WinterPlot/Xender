package androidx.activity.contextaware;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    void addOnContextAvailableListener(c cVar);

    Context peekAvailableContext();

    void removeOnContextAvailableListener(c cVar);
}
