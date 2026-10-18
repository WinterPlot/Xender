package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g0(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return s0.lambda$search$18(i3, i2, (String) obj2, (androidx.sqlite.b) obj);
            default:
                return ((com.userlabs.xshare.push.db.c) obj2).lambda$loadNotPostEventsByEventTypeAndSetStateToUploading$4(i3, i2, (androidx.sqlite.b) obj);
        }
    }

    public /* synthetic */ g0(com.userlabs.xshare.push.db.c cVar, int i, int i2) {
        this.d = cVar;
        this.b = i;
        this.c = i2;
    }
}
