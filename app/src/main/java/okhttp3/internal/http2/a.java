package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: okhttp3.internal.http2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0709a implements a {
        public static final C0709a a = new C0709a();

        private C0709a() {
        }

        @Override // okhttp3.internal.http2.a
        public void receivingConnectionWindowChanged(okhttp3.internal.http2.flowcontrol.a aVar) {
            aVar.getClass();
        }

        @Override // okhttp3.internal.http2.a
        public void receivingStreamWindowChanged(int i, okhttp3.internal.http2.flowcontrol.a aVar, long j) {
            aVar.getClass();
        }
    }

    void receivingConnectionWindowChanged(okhttp3.internal.http2.flowcontrol.a aVar);

    void receivingStreamWindowChanged(int i, okhttp3.internal.http2.flowcontrol.a aVar, long j);
}
