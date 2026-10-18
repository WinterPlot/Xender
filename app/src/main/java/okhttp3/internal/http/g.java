package okhttp3.internal.http;

import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    public static final g a = new g();

    private g() {
    }

    public static final boolean invalidatesCache(String str) {
        str.getClass();
        return y.areEqual(str, "POST") || y.areEqual(str, "PATCH") || y.areEqual(str, "PUT") || y.areEqual(str, "DELETE") || y.areEqual(str, "MOVE");
    }

    public static final boolean permitsRequestBody(String str) {
        str.getClass();
        return (y.areEqual(str, "GET") || y.areEqual(str, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String str) {
        str.getClass();
        return y.areEqual(str, "POST") || y.areEqual(str, "PUT") || y.areEqual(str, "PATCH") || y.areEqual(str, "PROPPATCH") || y.areEqual(str, "QUERY") || y.areEqual(str, "REPORT");
    }

    public final boolean isCacheable(String str) {
        str.getClass();
        return y.areEqual(str, "GET") || y.areEqual(str, "QUERY");
    }

    public final boolean redirectsToGet(String str, int i) {
        str.getClass();
        if (i == 303) {
            return !y.areEqual(str, "PROPFIND");
        }
        return (i == 307 || i == 308 || y.areEqual(str, "PROPFIND") || y.areEqual(str, "QUERY")) ? false : true;
    }
}
