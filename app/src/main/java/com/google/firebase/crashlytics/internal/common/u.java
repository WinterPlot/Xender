package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ u(v vVar, String str, String str2, int i) {
        this.a = i;
        this.b = vVar;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        v vVar = this.b;
        switch (i) {
            case 0:
                vVar.lambda$setCustomKey$5(str2, str);
                break;
            default:
                vVar.lambda$setInternalKey$7(str2, str);
                break;
        }
    }
}
