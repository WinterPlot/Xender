package com.userlabs.xshare.arch.db.dao;

import com.userlabs.xshare.arch.db.entity.JsEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface n1 {
    String getJsDateBySite(String str);

    void insert(JsEntity jsEntity);

    void insert(List<JsEntity> list);

    List<JsEntity> loadAll();
}
