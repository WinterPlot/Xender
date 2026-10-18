package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends f {
    public static final d a = new d();

    private d() {
    }

    @Override // kotlinx.coroutines.scheduling.f
    public long nanoTime() {
        return System.nanoTime();
    }
}
