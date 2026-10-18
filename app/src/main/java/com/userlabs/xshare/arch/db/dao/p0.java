package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ p0(int i, int i2, int i3, int i4) {
        this.a = i4;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return s0.lambda$loadAudioListByCursor$31(this.b, this.c, this.d, (androidx.sqlite.b) obj);
            case 1:
                return z1.lambda$dirTimeCount$6(this.b, this.c, this.d, (androidx.sqlite.b) obj);
            case 2:
                return z1.lambda$loadLatestImageListLimit100$16(this.b, this.c, this.d, (androidx.sqlite.b) obj);
            case 3:
                return z1.lambda$dirCount$5(this.b, this.c, this.d, (androidx.sqlite.b) obj);
            case 4:
                return z1.lambda$loadAllSync$18(this.b, this.c, this.d, (androidx.sqlite.b) obj);
            case 5:
                return z1.lambda$loadPhotoCount$2(this.b, this.c, this.d, (androidx.sqlite.b) obj);
            case 6:
                return m2.lambda$loadStartCursorLimit$13(this.b, this.c, this.d, (androidx.sqlite.b) obj);
            default:
                return m2.lambda$canShowSearch$17(this.b, this.c, this.d, (androidx.sqlite.b) obj);
        }
    }
}
