package com.userlabs.xshare.tomp3;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.camera.camera2.pipe.w;
import com.userlabs.xshare.core.log.h;
import com.userlabs.xshare.core.utils.q;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends com.userlabs.xshare.beans.a {
    private String a;
    private String b;
    private String c;
    private float d;
    private String e;

    private static String getTitleFromUri(Uri uri) {
        Uri uri2;
        String lastPathSegment = uri.getLastPathSegment();
        if (TextUtils.isDigitsOnly(lastPathSegment)) {
            String displayNameByMediaId = com.userlabs.xshare.core.phone.protocol.b.getDisplayNameByMediaId(lastPathSegment);
            if (!TextUtils.isEmpty(displayNameByMediaId)) {
                return displayNameByMediaId;
            }
        }
        try {
            uri2 = uri;
            try {
                Cursor cursorQuery = com.userlabs.xshare.core.c.getInstance().getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                            cursorQuery.close();
                            return string;
                        }
                    } catch (Throwable th) {
                        try {
                            cursorQuery.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            uri2 = uri;
        }
        return uri2.getLastPathSegment();
    }

    public static c newContentUriItem(Uri uri) {
        c cVar = new c();
        cVar.a = uri.toString();
        String titleFromUri = getTitleFromUri(uri);
        cVar.b = com.userlabs.xshare.core.utils.files.a.getNameWithoutExtension(titleFromUri);
        cVar.e = com.userlabs.xshare.core.utils.files.a.getExtensionWithDot(titleFromUri);
        cVar.d = 0.0f;
        cVar.c = q.create();
        if (h.a) {
            h.d("tomp3_task", "new item=" + cVar);
        }
        return cVar;
    }

    public String getCompat_path() {
        return this.a;
    }

    public String getExt() {
        return this.e;
    }

    public float getProgress() {
        return this.d;
    }

    public String getTaskId() {
        return this.c;
    }

    public String getTitle() {
        return this.b;
    }

    public void setProgress(float f) {
        this.d = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ToMp3ProgressItem{compat_path='");
        sb.append(this.a);
        sb.append("', title='");
        sb.append(this.b);
        sb.append("', taskId='");
        sb.append(this.c);
        sb.append("', progress=");
        sb.append(this.d);
        sb.append(", ext='");
        return w.t(sb, this.e, "'}");
    }
}
