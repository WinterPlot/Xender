package org.apache.commons.fileupload;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface k extends j {
    long contentLength();

    @Override // org.apache.commons.fileupload.j
    /* synthetic */ String getCharacterEncoding();

    @Override // org.apache.commons.fileupload.j
    @Deprecated
    /* synthetic */ int getContentLength();

    @Override // org.apache.commons.fileupload.j
    /* synthetic */ String getContentType();

    @Override // org.apache.commons.fileupload.j
    /* synthetic */ InputStream getInputStream() throws IOException;
}
