package com.userlabs.xshare.xsharetube;

import android.util.Base64;
import com.userlabs.xshare.utils.h;
import com.userlabs.xshare.utils.h0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static String unzip_decrypt(byte[] bArr, String str) {
        try {
            return new String(h0.unGzip(h.decrypt(bArr, str)), "utf-8");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String zip_encrypt(String str, String str2) throws Exception {
        return Base64.encodeToString(h.encrypt(h0.gzip(str.getBytes("UTF-8")), str2), 2);
    }
}
