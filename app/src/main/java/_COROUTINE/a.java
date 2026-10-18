package _COROUTINE;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final StackTraceElement coroutineBoundary() {
        return b.artificialFrame(new Exception(), c.class.getSimpleName());
    }

    public final StackTraceElement coroutineCreation() {
        return b.artificialFrame(new Exception(), d.class.getSimpleName());
    }
}
