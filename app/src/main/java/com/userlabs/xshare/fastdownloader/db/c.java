package com.userlabs.xshare.fastdownloader.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends SQLiteOpenHelper {
    private static c a;

    private c(Context context) {
        super(context, "x_fast_downloader.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static void closeDataBase(Context context) {
        try {
            c cVar = a;
            if (cVar != null) {
                cVar.close();
            }
            init(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized c getHelper() {
        c cVar;
        synchronized (c.class) {
            cVar = a;
            if (cVar == null) {
                throw new IllegalStateException("FastDownloaderDatabaseHelper must be handleError before calling get instance");
            }
        }
        return cVar;
        return cVar;
    }

    public static void init(Context context) {
        if (a == null) {
            a = new c(context);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE fast_downloader_tasks (_id INTEGER PRIMARY KEY AUTOINCREMENT,task_id TEXT NOT NULL,download_url TEXT NOT NULL,file_name TEXT NOT NULL,extension TEXT NOT NULL,download_location TEXT NOT NULL,size INTEGER,current_size INTEGER,resumable INTEGER,max_chunks_count INTEGER,up_time_millis INTEGER,random_access_based INTEGER,UNIQUE (task_id) ON CONFLICT REPLACE)");
        sQLiteDatabase.execSQL("CREATE TABLE chunks (_id INTEGER PRIMARY KEY AUTOINCREMENT,parent_task_id TEXT NOT NULL REFERENCES fast_downloader_tasks(task_id),download_location TEXT NOT NULL,name TEXT NOT NULL,file_name TEXT,start_bye_index INTEGER,end_byte_index INTEGER,current_byte_index INTEGER,UNIQUE (parent_task_id,download_location,name) ON CONFLICT REPLACE)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
