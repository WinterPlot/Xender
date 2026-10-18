package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.y;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map<String, String> e;

    @Deprecated
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final Object k;

    static {
        y.registerModule("media3.datasource");
    }

    private k(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        com.google.common.base.m.checkArgument(j4 >= 0);
        com.google.common.base.m.checkArgument(j2 >= 0);
        com.google.common.base.m.checkArgument(j3 > 0 || j3 == -1);
        this.a = (Uri) com.google.common.base.m.checkNotNull(uri);
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.g = j2;
        this.f = j4;
        this.h = j3;
        this.i = str;
        this.j = i2;
        this.k = obj;
    }

    public static String getStringForHttpMethod(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b buildUpon() {
        return new b();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.c);
    }

    public boolean isFlagSet(int i) {
        return (this.j & i) == i;
    }

    public k subrange(long j, long j2) {
        return (j == 0 && this.h == j2) ? this : new k(this.a, this.b, this.c, this.d, this.e, this.g + j, j2, this.i, this.j, this.k);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(getHttpMethodString());
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        return defpackage.a.s(sb, "]", this.j);
    }

    public k withAdditionalHeaders(Map<String, String> map) {
        HashMap map2 = new HashMap(this.e);
        map2.putAll(map);
        return new k(this.a, this.b, this.c, this.d, map2, this.g, this.h, this.i, this.j, this.k);
    }

    public k withRequestHeaders(Map<String, String> map) {
        return new k(this.a, this.b, this.c, this.d, map, this.g, this.h, this.i, this.j, this.k);
    }

    public k withUri(Uri uri) {
        return new k(uri, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        private Uri a;
        private long b;
        private int c;
        private byte[] d;
        private Map<String, String> e;
        private long f;
        private long g;
        private String h;
        private int i;
        private Object j;

        private b(k kVar) {
            this.a = kVar.a;
            this.b = kVar.b;
            this.c = kVar.c;
            this.d = kVar.d;
            this.e = kVar.e;
            this.f = kVar.g;
            this.g = kVar.h;
            this.h = kVar.i;
            this.i = kVar.j;
            this.j = kVar.k;
        }

        public k build() {
            com.google.common.base.m.checkNotNull(this.a, "The uri must be set.");
            return new k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public b setCustomData(Object obj) {
            this.j = obj;
            return this;
        }

        public b setFlags(int i) {
            this.i = i;
            return this;
        }

        public b setHttpBody(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public b setHttpMethod(int i) {
            this.c = i;
            return this;
        }

        public b setHttpRequestHeaders(Map<String, String> map) {
            this.e = map;
            return this;
        }

        public b setKey(String str) {
            this.h = str;
            return this;
        }

        public b setLength(long j) {
            this.g = j;
            return this;
        }

        public b setPosition(long j) {
            this.f = j;
            return this;
        }

        public b setUri(String str) {
            this.a = Uri.parse(str);
            return this;
        }

        public b setUriPositionOffset(long j) {
            this.b = j;
            return this;
        }

        public b setUri(Uri uri) {
            this.a = uri;
            return this;
        }

        public b() {
            this.c = 1;
            this.e = Collections.EMPTY_MAP;
            this.g = -1L;
        }
    }

    public k subrange(long j) {
        long j2 = this.h;
        return subrange(j, j2 != -1 ? j2 - j : -1L);
    }

    public k(Uri uri) {
        this(uri, 0L, -1L);
    }

    public k(Uri uri, long j, long j2) {
        this(uri, j, j2, null);
    }

    @Deprecated
    public k(Uri uri, long j, long j2, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, str, 0, null);
    }
}
