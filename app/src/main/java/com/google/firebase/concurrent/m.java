package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ m(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                return o.lambda$submit$1(runnable);
            default:
                return s.lambda$submit$1(runnable);
        }
    }
}
