package org.apache.commons.fileupload;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface FileItemStream extends d {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class ItemSkippedException extends IOException {
        private static final long serialVersionUID = -7280778431581963740L;
    }

    String getContentType();

    String getFieldName();

    @Override // org.apache.commons.fileupload.d
    /* synthetic */ c getHeaders();

    String getName();

    boolean isFormField();

    InputStream openStream() throws IOException;

    @Override // org.apache.commons.fileupload.d
    /* synthetic */ void setHeaders(c cVar);
}
