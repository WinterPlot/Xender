package com.google.firebase.crashlytics.internal.stacktrace;

import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class e {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final e d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.a = str;
        this.b = str2;
        this.c = stackTraceElementArr;
        this.d = eVar;
    }

    public static e makeTrimmedThrowableData(Throwable th, d dVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eVar = new e(th2.getLocalizedMessage(), th2.getClass().getName(), dVar.getTrimmedStackTrace(th2.getStackTrace()), eVar);
        }
        return eVar;
    }
}
