package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d1(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return f1.lambda$loadCountByType$9(this.c, this.b, (androidx.sqlite.b) obj);
            default:
                return f1.lambda$loadFileByType$5(this.b, this.c, (androidx.sqlite.b) obj);
        }
    }

    public /* synthetic */ d1(boolean z, int i) {
        this.c = z;
        this.b = i;
    }
}
