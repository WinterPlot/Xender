package androidx.navigation;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 {
    public static final h1 a = new h1();

    private h1() {
    }

    public static /* synthetic */ String encode$default(h1 h1Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return h1Var.encode(str, str2);
    }

    public final String decode(String str) {
        str.getClass();
        String strDecode = Uri.decode(str);
        strDecode.getClass();
        return strDecode;
    }

    public final String encode(String str, String str2) {
        str.getClass();
        String strEncode = Uri.encode(str, str2);
        strEncode.getClass();
        return strEncode;
    }

    public final Uri parse(String str) {
        str.getClass();
        Uri uri = Uri.parse(str);
        uri.getClass();
        return uri;
    }
}
