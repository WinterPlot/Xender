package kotlinx.coroutines;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface l extends c2 {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a implements l {
        private final kotlin.jvm.functions.l<Throwable, kotlin.y> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.jvm.functions.l<? super Throwable, kotlin.y> lVar) {
            this.a = lVar;
        }

        @Override // kotlinx.coroutines.l
        public void invoke(Throwable th) {
            this.a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + l0.getClassSimpleName(this.a) + '@' + l0.getHexAddress(this) + ']';
        }
    }

    void invoke(Throwable th);
}
