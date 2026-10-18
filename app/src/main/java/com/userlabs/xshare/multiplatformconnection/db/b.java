package com.userlabs.xshare.multiplatformconnection.db;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface b {
    void clear();

    void insert(List<a> list);

    a loadByKey(String str);

    List<a> loadByKeyList(List<String> list);

    String loadPathByDlKeySync(String str);

    void removeByDid(String str);
}
