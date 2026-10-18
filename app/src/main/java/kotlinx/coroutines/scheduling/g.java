package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g implements Runnable {
    public long a;
    public boolean b;

    public g(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public g() {
        this(0L, false);
    }
}
