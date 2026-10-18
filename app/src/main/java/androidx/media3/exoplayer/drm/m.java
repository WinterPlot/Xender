package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.analytics.e0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        private final int a;
        private final byte[] b;

        public b(int i, byte[] bArr) {
            this.a = i;
            this.b = bArr;
        }

        public byte[] getKeyId() {
            return this.b;
        }

        public int getStatusCode() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface c {
        void onEvent(m mVar, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface d {
        void a(m mVar, byte[] bArr, long j);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface e {
        void a(m mVar, byte[] bArr, List<b> list, boolean z);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface f {
        m acquireExoMediaDrm(UUID uuid);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class g {
        private final byte[] a;
        private final String b;

        public g(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        public byte[] getData() {
            return this.a;
        }

        public String getDefaultUrl() {
            return this.b;
        }
    }

    void acquire();

    void closeSession(byte[] bArr);

    androidx.media3.decoder.b createCryptoConfig(byte[] bArr) throws MediaCryptoException;

    int getCryptoType();

    a getKeyRequest(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map) throws NotProvisionedException;

    PersistableBundle getMetrics();

    List<byte[]> getOfflineLicenseKeySetIds();

    byte[] getPropertyByteArray(String str);

    String getPropertyString(String str);

    g getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    void removeOfflineLicense(byte[] bArr);

    boolean requiresSecureDecoder(byte[] bArr, String str);

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnEventListener(c cVar);

    void setOnExpirationUpdateListener(d dVar);

    void setOnKeyStatusChangeListener(e eVar);

    void setPlayerIdForSession(byte[] bArr, e0 e0Var);

    void setPropertyByteArray(String str, byte[] bArr);

    void setPropertyString(String str, String str2);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private final byte[] a;
        private final String b;
        private final int c;

        public a(byte[] bArr, String str, int i) {
            this.a = bArr;
            this.b = str;
            this.c = i;
        }

        public byte[] getData() {
            return this.a;
        }

        public String getLicenseServerUrl() {
            return this.b;
        }

        public int getRequestType() {
            return this.c;
        }

        public a(byte[] bArr, String str) {
            this(bArr, str, Integer.MIN_VALUE);
        }
    }
}
