package androidx.work.impl.model;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface m {
    l getSystemIdInfo(q qVar);

    l getSystemIdInfo(String str, int i);

    List<String> getWorkSpecIds();

    void insertSystemIdInfo(l lVar);

    void removeSystemIdInfo(q qVar);

    void removeSystemIdInfo(String str);

    void removeSystemIdInfo(String str, int i);
}
