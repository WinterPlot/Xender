package androidx.media3.exoplayer.drm;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface v {
    b executeKeyRequest(UUID uuid, m.a aVar) throws MediaDrmCallbackException;

    b executeProvisionRequest(UUID uuid, m.g gVar) throws MediaDrmCallbackException;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        public final byte[] a;
        public final androidx.media3.exoplayer.source.s b;

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static final class a {
            private final byte[] a;
            private androidx.media3.exoplayer.source.s b;

            public a(byte[] bArr) {
                this.a = bArr;
            }

            public b build() {
                return new b(this);
            }

            public a setLoadEventInfo(androidx.media3.exoplayer.source.s sVar) {
                this.b = sVar;
                return this;
            }
        }

        private b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
        }

        public b(byte[] bArr) {
            this.a = bArr;
            this.b = null;
        }
    }
}
