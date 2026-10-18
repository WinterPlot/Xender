package org.apache.commons.fileupload.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class FileItemHeadersImpl implements org.apache.commons.fileupload.c, Serializable {
    private static final long serialVersionUID = -4455695752627032559L;
    private final Map<String, List<String>> headerNameToValueListMap = new LinkedHashMap();

    public synchronized void addHeader(String str, String str2) {
        try {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            List<String> arrayList = this.headerNameToValueListMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.headerNameToValueListMap.put(lowerCase, arrayList);
            }
            arrayList.add(str2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.apache.commons.fileupload.c
    public String getHeader(String str) {
        List<String> list = this.headerNameToValueListMap.get(str.toLowerCase(Locale.ROOT));
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    @Override // org.apache.commons.fileupload.c
    public Iterator<String> getHeaderNames() {
        return this.headerNameToValueListMap.keySet().iterator();
    }

    @Override // org.apache.commons.fileupload.c
    public Iterator<String> getHeaders(String str) {
        List<String> list = this.headerNameToValueListMap.get(str.toLowerCase(Locale.ROOT));
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return list.iterator();
    }
}
