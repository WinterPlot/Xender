package com.bumptech.glide.load.model;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements i {
    private final Map<String, List<j>> c;
    private volatile Map<String, String> d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b implements j {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // com.bumptech.glide.load.model.j
        public String buildHeader() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return androidx.camera.camera2.pipe.w.t(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
        }
    }

    public k(Map<String, List<j>> map) {
        this.c = DesugarCollections.unmodifiableMap(map);
    }

    private String buildHeaderValue(List<j> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strBuildHeader = list.get(i).buildHeader();
            if (!TextUtils.isEmpty(strBuildHeader)) {
                sb.append(strBuildHeader);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> generateHeaders() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.c.entrySet()) {
            String strBuildHeaderValue = buildHeaderValue(entry.getValue());
            if (!TextUtils.isEmpty(strBuildHeaderValue)) {
                map.put(entry.getKey(), strBuildHeaderValue);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.c.equals(((k) obj).c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.i
    public Map<String, String> getHeaders() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.d = DesugarCollections.unmodifiableMap(generateHeaders());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.d;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.c + '}';
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private static final String d;
        private static final Map<String, List<j>> e;
        private boolean a = true;
        private Map<String, List<j>> b = e;
        private boolean c = true;

        static {
            String sanitizedUserAgent = getSanitizedUserAgent();
            d = sanitizedUserAgent;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(sanitizedUserAgent)) {
                map.put("User-Agent", Collections.singletonList(new b(sanitizedUserAgent)));
            }
            e = DesugarCollections.unmodifiableMap(map);
        }

        private Map<String, List<j>> copyHeaders() {
            HashMap map = new HashMap(this.b.size());
            for (Map.Entry<String, List<j>> entry : this.b.entrySet()) {
                map.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return map;
        }

        private void copyIfNecessary() {
            if (this.a) {
                this.a = false;
                this.b = copyHeaders();
            }
        }

        private List<j> getFactories(String str) {
            List<j> list = this.b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.b.put(str, arrayList);
            return arrayList;
        }

        public static String getSanitizedUserAgent() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public a addHeader(String str, j jVar) {
            if (this.c && "User-Agent".equalsIgnoreCase(str)) {
                return setHeader(str, jVar);
            }
            copyIfNecessary();
            getFactories(str).add(jVar);
            return this;
        }

        public k build() {
            this.a = true;
            return new k(this.b);
        }

        public a setHeader(String str, j jVar) {
            copyIfNecessary();
            if (jVar == null) {
                this.b.remove(str);
            } else {
                List<j> factories = getFactories(str);
                factories.clear();
                factories.add(jVar);
            }
            if (this.c && "User-Agent".equalsIgnoreCase(str)) {
                this.c = false;
            }
            return this;
        }

        public a addHeader(String str, String str2) {
            return addHeader(str, new b(str2));
        }

        public a setHeader(String str, String str2) {
            return setHeader(str, str2 == null ? null : new b(str2));
        }
    }
}
