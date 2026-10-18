package com.userlabs.xshare.nlist;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public abstract void deleteAll();

    public void deleteAllAndInsertAll(List<VIPEntity> list) {
        deleteAll();
        if (list == null || list.isEmpty()) {
            return;
        }
        insertAll(list);
    }

    public abstract void insertAll(List<VIPEntity> list);

    public abstract List<String> loadAllPnSyncOrderByIdAsc();

    public abstract List<VIPEntity> loadAllSync();
}
