package okhttp3.internal.ech;

import javax.net.ssl.SSLException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class EchUntrustedException extends SSLException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EchUntrustedException(String str, SSLException sSLException) {
        super(str, sSLException);
        str.getClass();
        sSLException.getClass();
    }
}
