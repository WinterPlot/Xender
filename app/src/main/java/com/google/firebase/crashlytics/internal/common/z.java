package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class z implements Thread.UncaughtExceptionHandler {
    private final a a;
    private final com.google.firebase.crashlytics.internal.settings.i b;
    private final Thread.UncaughtExceptionHandler c;
    private final com.google.firebase.crashlytics.internal.a d;
    private final AtomicBoolean e = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onUncaughtException(com.google.firebase.crashlytics.internal.settings.i iVar, Thread thread, Throwable th);
    }

    public z(a aVar, com.google.firebase.crashlytics.internal.settings.i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.a aVar2) {
        this.a = aVar;
        this.b = iVar;
        this.c = uncaughtExceptionHandler;
        this.d = aVar2;
    }

    private boolean shouldRecordUncaughtException(Thread thread, Throwable th) {
        if (thread == null) {
            com.google.firebase.crashlytics.internal.f.getLogger().e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            com.google.firebase.crashlytics.internal.f.getLogger().e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.d.hasCrashDataForCurrentSession()) {
            return true;
        }
        com.google.firebase.crashlytics.internal.f.getLogger().d("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    public boolean isHandlingException() {
        return this.e.get();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.e.set(true);
        try {
            try {
                if (shouldRecordUncaughtException(thread, th)) {
                    this.a.onUncaughtException(this.b, thread, th);
                } else {
                    com.google.firebase.crashlytics.internal.f.getLogger().d("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.c != null) {
                    com.google.firebase.crashlytics.internal.f.getLogger().d("Completed exception processing. Invoking default exception handler.");
                    this.c.uncaughtException(thread, th);
                } else {
                    com.google.firebase.crashlytics.internal.f.getLogger().d("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            } catch (Exception e) {
                com.google.firebase.crashlytics.internal.f.getLogger().e("An error occurred in the uncaught exception handler", e);
                if (this.c == null) {
                    com.google.firebase.crashlytics.internal.f.getLogger().d("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            }
            this.e.set(false);
        } catch (Throwable th2) {
            if (this.c != null) {
                com.google.firebase.crashlytics.internal.f.getLogger().d("Completed exception processing. Invoking default exception handler.");
                this.c.uncaughtException(thread, th);
            } else {
                com.google.firebase.crashlytics.internal.f.getLogger().d("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.e.set(false);
            throw th2;
        }
    }
}
