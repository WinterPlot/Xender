package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class w {
    private final WebResourceRequestBoundaryInterface a;

    public w(WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.a = webResourceRequestBoundaryInterface;
    }

    public boolean isRedirect() {
        return this.a.isRedirect();
    }
}
