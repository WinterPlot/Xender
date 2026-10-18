package org.apache.commons.fileupload.servlet;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.k;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class b implements k {
    private final HttpServletRequest a;

    public b(HttpServletRequest httpServletRequest) {
        this.a = httpServletRequest;
    }

    @Override // org.apache.commons.fileupload.k
    public long contentLength() {
        try {
            return Long.parseLong(this.a.getHeader("Content-length"));
        } catch (NumberFormatException unused) {
            return this.a.getContentLength();
        }
    }

    @Override // org.apache.commons.fileupload.k, org.apache.commons.fileupload.j
    public String getCharacterEncoding() {
        return this.a.getCharacterEncoding();
    }

    @Override // org.apache.commons.fileupload.k, org.apache.commons.fileupload.j
    @Deprecated
    public int getContentLength() {
        return this.a.getContentLength();
    }

    @Override // org.apache.commons.fileupload.k, org.apache.commons.fileupload.j
    public String getContentType() {
        return this.a.getContentType();
    }

    @Override // org.apache.commons.fileupload.k, org.apache.commons.fileupload.j
    public InputStream getInputStream() throws IOException {
        return this.a.getInputStream();
    }

    public String toString() {
        return "ContentLength=" + contentLength() + ", ContentType=" + getContentType();
    }
}
