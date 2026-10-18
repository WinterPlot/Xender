package com.google.firebase.sessions;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return k.b.a.sessionConfigsDataStore$lambda$2((Context) obj);
            case 1:
                return k.b.a.sessionDataStore$lambda$5((Context) obj);
            default:
                return x.myUuid_delegate$lambda$1((t0) obj);
        }
    }
}
