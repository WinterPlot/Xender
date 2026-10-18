package org.apache.commons.fileupload;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface c {
    String getHeader(String str);

    Iterator<String> getHeaderNames();

    Iterator<String> getHeaders(String str);
}
