package androidx.camera.camera2.pipe;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface w0 {
    public static final a G = a.a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ n0 acquire$default(a aVar, w0 w0Var, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = null;
            }
            return aVar.acquire(w0Var, set);
        }

        public final n0 acquire(w0 w0Var, Set<w1> set) {
            w0Var.getClass();
            n0 n0VarTryAcquire = w0Var.tryAcquire(set);
            if (n0VarTryAcquire != null) {
                return n0VarTryAcquire;
            }
            androidx.activity.t.g(33, w0Var, "Failed to acquire a strong reference to ");
            return null;
        }
    }

    /* JADX INFO: renamed from: getFrameId-OMxQvVY */
    long mo609getFrameIdOMxQvVY();

    /* JADX INFO: renamed from: getFrameInfoStatus-U7r42EA */
    int mo610getFrameInfoStatusU7r42EA();

    /* JADX INFO: renamed from: getFrameNumber-Ugla2oM */
    long mo611getFrameNumberUgla2oM();

    /* JADX INFO: renamed from: getFrameTimestamp-LS1Wq50 */
    long mo612getFrameTimestampLS1Wq50();

    Set<w1> getImageStreams();

    o1 getRequestMetadata();

    /* JADX INFO: renamed from: imageStatus-BWjvHWQ */
    int mo616imageStatusBWjvHWQ(int i);

    /* JADX INFO: renamed from: imageStatus-Oo2lJfM */
    int mo617imageStatusOo2lJfM(int i);

    n0 tryAcquire(Set<w1> set);
}
