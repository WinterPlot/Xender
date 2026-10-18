package com.userlabs.xshare.core.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.userlabs.xshare.core.loadicon.LoadIconCate;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class l {
    public static String a = "MediaFileScanner";

    public static ContentValues createValues(File file) {
        ContentValues contentValues = new ContentValues();
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("_display_name", file.getName());
        long jLastModified = file.lastModified();
        contentValues2.put("datetaken", Long.valueOf(jLastModified));
        contentValues2.put("date_modified", Long.valueOf(jLastModified));
        contentValues2.put("date_added", Long.valueOf(jLastModified));
        contentValues2.put("_size", Long.valueOf(file.length()));
        contentValues2.put("is_pending", (Integer) 1);
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scanning$0(String str, Uri uri) {
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.i(a, "scan---Finished scanning!uri:" + uri + ",path:" + str);
        }
        if (uri == null) {
            try {
                com.userlabs.xshare.core.c.getInstance().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(str))));
            } catch (Throwable unused) {
            }
        }
    }

    private static boolean scanAudios(String str) {
        try {
            ContentResolver contentResolver = com.userlabs.xshare.core.c.getInstance().getContentResolver();
            File file = new File(str);
            ContentValues contentValuesCreateValues = createValues(file);
            Uri uriInsert = contentResolver.insert(Build.VERSION.SDK_INT >= 29 ? MediaStore.Audio.Media.getContentUri("external") : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValuesCreateValues);
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.i(a, "scan-audio insert uri:" + uriInsert);
            }
            contentValuesCreateValues.clear();
            contentValuesCreateValues.put("is_pending", (Integer) 0);
            contentValuesCreateValues.put("_data", file.getAbsolutePath());
            com.userlabs.xshare.core.c.getInstance().getContentResolver().update(uriInsert, contentValuesCreateValues, null, null);
            return true;
        } catch (Exception e) {
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.e(a, "scan video failed", e);
            }
            return false;
        }
    }

    private static boolean scanSupportAudios(String str) {
        try {
            ContentResolver contentResolver = com.userlabs.xshare.core.c.getInstance().getContentResolver();
            File file = new File(str);
            ContentValues contentValuesCreateValues = createValues(file);
            Uri uriInsert = contentResolver.insert(MediaStore.Files.getContentUri(com.userlabs.xshare.core.c.isOverAndroidQ() ? "external_primary" : "external"), contentValuesCreateValues);
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.i(a, "scan-support audio insert uri:" + uriInsert);
            }
            contentValuesCreateValues.clear();
            contentValuesCreateValues.put("is_pending", (Integer) 0);
            contentValuesCreateValues.put("_data", file.getAbsolutePath());
            com.userlabs.xshare.core.c.getInstance().getContentResolver().update(uriInsert, contentValuesCreateValues, null, null);
            return true;
        } catch (Exception e) {
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.e(a, "scan support video failed", e);
            }
            return false;
        }
    }

    public static void scanning(String str) {
        String mimeTypeFromExtension;
        if (str == null) {
            return;
        }
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.i(a, "scan-file path:".concat(str));
        }
        try {
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(com.userlabs.xshare.core.utils.files.a.getExtensionWithoutDot(str));
        } catch (Throwable unused) {
            mimeTypeFromExtension = null;
        }
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.i(a, "scan-file mime_type:" + mimeTypeFromExtension);
        }
        if (mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith(LoadIconCate.LOAD_CATE_AUDIO) && Build.VERSION.SDK_INT == 29 && com.userlabs.xshare.k.isInfinixDevice() && scanAudios(str)) {
            return;
        }
        if (com.userlabs.xshare.support.a.isSupportAudio(str) && Build.VERSION.SDK_INT == 29 && com.userlabs.xshare.k.isInfinixDevice() && scanSupportAudios(str)) {
            return;
        }
        MediaScannerConnection.scanFile(com.userlabs.xshare.core.c.getInstance(), new String[]{str}, TextUtils.isEmpty(mimeTypeFromExtension) ? null : new String[]{mimeTypeFromExtension}, new k());
    }
}
