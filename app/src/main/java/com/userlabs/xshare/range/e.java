package com.userlabs.xshare.range;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public abstract void clearExpired(long j);

    public abstract void delete(String str, String str2);

    public abstract void deleteByTaskId(String str);

    public abstract void deleteByTaskIds(List<String> list);

    public abstract void insert(h hVar);

    public abstract void insert(List<h> list);

    public abstract List<h> loadAllSync(String str, int i);

    public void unionInsert(h hVar) {
        if (!TextUtils.isEmpty(hVar.getFx_movie_file_id()) || !TextUtils.isEmpty(hVar.getFx_movie_id())) {
            delete(hVar.getFx_movie_id(), hVar.getFx_movie_file_id());
        }
        insert(hVar);
    }

    public abstract void updateETag(String str, String str2);

    public abstract void updateFileSize(String str, long j);

    public abstract void updatePath(String str, String str2);

    public abstract void updatePathAndETag(String str, String str2, String str3);

    public abstract void updatePause(String str, int i);
}
