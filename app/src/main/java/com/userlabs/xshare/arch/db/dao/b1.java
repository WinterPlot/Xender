package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ b1(boolean z, String str, int i) {
        this.a = i;
        this.b = z;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return f1.lambda$searchBigFilesSync$12(this.b, this.c, (androidx.sqlite.b) obj);
            default:
                return com.userlabs.xshare.range.d.lambda$updateDownloadedState$7(this.b, this.c, (androidx.sqlite.b) obj);
        }
    }
}
