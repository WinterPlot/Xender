package com.userlabs.xshare.push.db;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public abstract void delete(List<d> list);

    public void deleteAndClearExpired(List<d> list) {
        delete(list);
        deleteExpired(System.currentTimeMillis());
    }

    public abstract void deleteExpired(long j);

    public abstract void insertAll(List<d> list);

    public abstract List<d> loadNotPostEventsByEventType(int i, long j, int i2);

    public List<d> loadNotPostEventsByEventTypeAndSetStateToUploading(int i, int i2) {
        List<d> listLoadNotPostEventsByEventType = loadNotPostEventsByEventType(i, System.currentTimeMillis(), i2);
        if (listLoadNotPostEventsByEventType != null && !listLoadNotPostEventsByEventType.isEmpty()) {
            Iterator<d> it = listLoadNotPostEventsByEventType.iterator();
            while (it.hasNext()) {
                it.next().setUp_state(1);
            }
            update(listLoadNotPostEventsByEventType);
        }
        return listLoadNotPostEventsByEventType;
    }

    public abstract void update(List<d> list);

    public abstract void updateUpStateFromUploadingToNormal();
}
