package androidx.webkit.internal;

import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class i {
    private final WebViewCookieManagerBoundaryInterface a;

    public i(WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.a = webViewCookieManagerBoundaryInterface;
    }

    public List<String> getCookieInfo(String str) {
        return this.a.getCookieInfo(str);
    }
}
