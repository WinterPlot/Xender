package androidx.camera.video.internal.encoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface k {
    public static final k a = new a();

    void onEncodeError(EncodeException encodeException);

    void onEncodePaused();

    void onEncodeStart();

    void onEncodeStop();

    void onEncodedData(h hVar);

    void onOutputConfigUpdate(e0 e0Var);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements k {
        @Override // androidx.camera.video.internal.encoder.k
        public void onEncodePaused() {
        }

        @Override // androidx.camera.video.internal.encoder.k
        public void onEncodeStart() {
        }

        @Override // androidx.camera.video.internal.encoder.k
        public void onEncodeStop() {
        }

        @Override // androidx.camera.video.internal.encoder.k
        public void onEncodeError(EncodeException encodeException) {
        }

        @Override // androidx.camera.video.internal.encoder.k
        public void onEncodedData(h hVar) {
        }

        @Override // androidx.camera.video.internal.encoder.k
        public void onOutputConfigUpdate(e0 e0Var) {
        }
    }
}
