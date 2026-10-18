package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ c(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                return eVar.lambda$getHeartBeatsHeader$1();
            default:
                return eVar.lambda$registerHeartBeat$0();
        }
    }
}
