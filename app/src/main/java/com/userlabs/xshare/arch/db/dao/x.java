package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x {
    public abstract void deleteAll();

    public abstract void deleteByPackageNameList(List<String> list);

    public abstract List<String> getMatchedResultByKey(String str);

    public abstract List<String> getMatchedResultByKeyByLike(String str);

    public abstract List<com.userlabs.xshare.arch.db.entity.e> getMatchedResultEntityByKeyByLike(String str);

    public abstract String getOneMatchedResultByKey(String str);

    public abstract String getOneMatchedResultByKeyByLike(String str);

    public abstract void insert(List<com.userlabs.xshare.arch.db.entity.e> list);

    public void insertAllTransaction(List<com.userlabs.xshare.arch.db.entity.e> list) {
        deleteAll();
        insert(list);
    }
}
