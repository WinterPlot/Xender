package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(Runnable runnable, Object obj, int i) {
        this.a = i;
        this.b = runnable;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return o.lambda$submit$0(this.b, this.c);
            default:
                return s.lambda$submit$0(this.b, this.c);
        }
    }
}
