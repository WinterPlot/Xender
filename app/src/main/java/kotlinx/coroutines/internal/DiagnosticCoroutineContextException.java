package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {
    private final transient kotlin.coroutines.g a;

    public DiagnosticCoroutineContextException(kotlin.coroutines.g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.a.toString();
    }
}
