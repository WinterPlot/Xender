package com.google.android.gms.tasks;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException of(j<?> jVar) {
        String strConcat;
        if (!jVar.isComplete()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = jVar.getException();
        if (exception != null) {
            strConcat = "failure";
        } else if (jVar.isSuccessful()) {
            strConcat = "result ".concat(String.valueOf(jVar.getResult()));
        } else {
            strConcat = jVar.isCanceled() ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), exception);
    }
}
