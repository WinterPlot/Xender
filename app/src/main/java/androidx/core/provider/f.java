package androidx.core.provider;

import android.util.Base64;
import androidx.camera.camera2.pipe.w;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private final String a;
    private final String b;
    private final String c;
    private final List<List<byte[]>> d;
    private final int e;
    private final String f;
    private final String g;
    private final String h;

    public f(String str, String str2, String str3, List<List<byte[]>> list, String str4, String str5) {
        this.a = (String) androidx.core.util.i.checkNotNull(str);
        this.b = (String) androidx.core.util.i.checkNotNull(str2);
        this.c = (String) androidx.core.util.i.checkNotNull(str3);
        this.d = (List) androidx.core.util.i.checkNotNull(list);
        this.e = 0;
        this.f = str4;
        this.g = str5;
        this.h = createIdentifier(str, str2, str3, str4, str5);
    }

    private String createIdentifier(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        if (str5 != null) {
            int length = str5.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = str5.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    sb.append("-VF");
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        return sb.toString();
    }

    public List<List<byte[]>> getCertificates() {
        return this.d;
    }

    public int getCertificatesArrayResId() {
        return this.e;
    }

    public String getId() {
        return this.h;
    }

    @Deprecated
    public String getIdentifier() {
        return this.h;
    }

    public String getProviderAuthority() {
        return this.a;
    }

    public String getProviderPackage() {
        return this.b;
    }

    public String getQuery() {
        return this.c;
    }

    public String getSystemFont() {
        return this.f;
    }

    public String getVariationSettings() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb.append(this.a);
        sb.append(", mProviderPackage: ");
        sb.append(this.b);
        sb.append(", mQuery: ");
        sb.append(this.c);
        sb.append(", mSystemFont: ");
        sb.append(this.f);
        sb.append(", mVariationSettings: ");
        StringBuilder sb2 = new StringBuilder(w.t(sb, this.g, ", mCertificates:"));
        for (int i = 0; i < this.d.size(); i++) {
            sb2.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i2), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.e);
        return sb2.toString();
    }

    public f(String str, String str2, String str3, List<List<byte[]>> list, String str4) {
        this(str, str2, str3, list, (String) null, str4);
    }

    public f(String str, String str2, String str3, int i) {
        this(str, str2, str3, i, (String) null, (String) null);
    }

    public f(String str, String str2, String str3, int i, String str4) {
        this(str, str2, str3, i, (String) null, str4);
    }

    public f(String str, String str2, String str3, List<List<byte[]>> list) {
        this(str, str2, str3, list, (String) null, (String) null);
    }

    private f(String str, String str2, String str3, int i, String str4, String str5) {
        this.a = (String) androidx.core.util.i.checkNotNull(str);
        this.b = (String) androidx.core.util.i.checkNotNull(str2);
        this.c = (String) androidx.core.util.i.checkNotNull(str3);
        this.d = null;
        androidx.core.util.i.checkArgument(i != 0);
        this.e = i;
        this.f = str4;
        this.g = str5;
        this.h = createIdentifier(str, str2, str3, null, str5);
    }
}
