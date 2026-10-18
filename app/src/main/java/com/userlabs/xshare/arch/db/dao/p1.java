package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p1 {
    public abstract void deleteAll();

    public void deleteAllAndInsertAll(List<com.userlabs.xshare.arch.db.entity.n> list) {
        deleteAll();
        if (list == null || list.isEmpty()) {
            return;
        }
        insertAll(list);
    }

    public abstract void insertAll(List<com.userlabs.xshare.arch.db.entity.n> list);

    public abstract List<com.userlabs.xshare.arch.db.entity.n> loadAllSync();
}
