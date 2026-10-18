package com.userlabs.xshare.fastdownloader.db;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
class a {
    public com.userlabs.xshare.fastdownloader.model.a getChunk(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("parent_task_id"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("download_location"));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("name"));
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("start_bye_index"));
        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("end_byte_index"));
        long j3 = cursor.getLong(cursor.getColumnIndexOrThrow("current_byte_index"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("file_name"));
        com.userlabs.xshare.fastdownloader.model.a aVar = new com.userlabs.xshare.fastdownloader.model.a(string, string2, string3, TextUtils.isEmpty(string4) ? string3 : string4, j, j2);
        aVar.setCurrentByteIndex(j3);
        return aVar;
    }

    public com.userlabs.xshare.fastdownloader.model.b getFaskDownloadTask(Cursor cursor, List<com.userlabs.xshare.fastdownloader.model.a> list) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("task_id"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("download_url"));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("file_name"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("extension"));
        String string5 = cursor.getString(cursor.getColumnIndexOrThrow("download_location"));
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("size"));
        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("current_size"));
        boolean z = cursor.getInt(cursor.getColumnIndexOrThrow("resumable")) == 1;
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("max_chunks_count"));
        long j3 = cursor.getLong(cursor.getColumnIndexOrThrow("up_time_millis"));
        com.userlabs.xshare.fastdownloader.model.b bVar = new com.userlabs.xshare.fastdownloader.model.b(string2, null, string5, string3, string4, string, cursor.getInt(cursor.getColumnIndexOrThrow("random_access_based")) == 1, i);
        bVar.setSize(j);
        bVar.setResumable(z);
        bVar.setUpTimeMillis(j3);
        bVar.setCurrentSize(j2);
        bVar.addAllChunks(list);
        bVar.CalCurrentSize();
        return bVar;
    }
}
