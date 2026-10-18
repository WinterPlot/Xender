package androidx.media3.decoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends androidx.media3.decoder.a {
    public long b;
    public int c;
    public boolean d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a<S extends e> {
        void releaseOutputBuffer(S s);
    }

    @Override // androidx.media3.decoder.a
    public void clear() {
        super.clear();
        this.b = 0L;
        this.c = 0;
        this.d = false;
    }

    public abstract void release();
}
