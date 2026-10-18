package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface q {
    public static final q S = new a();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements q {
        @Override // androidx.media3.extractor.q
        public void endTracks() {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.extractor.q
        public void seekMap(j0 j0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.extractor.q
        public r0 track(int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }

    void endTracks();

    void seekMap(j0 j0Var);

    r0 track(int i, int i2);
}
