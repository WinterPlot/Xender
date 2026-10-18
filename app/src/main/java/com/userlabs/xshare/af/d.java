package com.userlabs.xshare.af;

import com.userlabs.xshare.af.data.AFLinkEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public abstract void deleteAll();

    public void deleteAllAndInsertAll(List<AFLinkEntity> list) {
        deleteAll();
        insertAll(list);
    }

    public abstract AFLinkEntity getByOfferPnSync(String str);

    public abstract void insertAll(List<AFLinkEntity> list);

    public abstract List<AFLinkEntity> loadCurrentList();
}
