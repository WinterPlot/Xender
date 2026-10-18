package com.google.firebase.crashlytics.internal.common;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((r) obj2).lambda$openSession$1((String) obj);
                break;
            case 1:
                ((v) obj2).lambda$setCustomKeys$6((Map) obj);
                break;
            case 2:
                ((v) obj2).lambda$logFatalException$8((Throwable) obj);
                break;
            default:
                ((v) obj2).lambda$setUserId$4((String) obj);
                break;
        }
    }
}
