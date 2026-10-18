package com.google.firebase.crashlytics.internal.common;

import android.os.ProfilingResult;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i, Object obj, String str) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        String str = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((r) obj2).lambda$registerProfilingManagerListener$5(str, (ProfilingResult) obj);
                break;
            default:
                ((m0) obj2).lambda$persistProfilingManagerInfo$2(str, (Integer) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
