package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements d {
    private final int a;
    private final d[] b;
    private final b c;

    public a(int i, d... dVarArr) {
        this.a = i;
        this.b = dVarArr;
        this.c = new b(i);
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.d
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] trimmedStackTrace = stackTraceElementArr;
        for (d dVar : this.b) {
            if (trimmedStackTrace.length <= this.a) {
                break;
            }
            trimmedStackTrace = dVar.getTrimmedStackTrace(stackTraceElementArr);
        }
        return trimmedStackTrace.length > this.a ? this.c.getTrimmedStackTrace(trimmedStackTrace) : trimmedStackTrace;
    }
}
