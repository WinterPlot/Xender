package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class f0 extends WebViewRenderProcessClient {
    private final androidx.webkit.l a;

    public f0(androidx.webkit.l lVar) {
        this.a = lVar;
    }

    public androidx.webkit.l getFrameworkRenderProcessClient() {
        return this.a;
    }

    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.a.onRenderProcessResponsive(webView, g0.forFrameworkObject(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.a.onRenderProcessUnresponsive(webView, g0.forFrameworkObject(webViewRenderProcess));
    }
}
