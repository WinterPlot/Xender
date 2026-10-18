package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ f(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return n.lambda$loadNoRepeatSync$6(this.b, this.c, (androidx.sqlite.b) obj);
            case 1:
                return n.lambda$loadCanRepeat$7(this.b, this.c, (androidx.sqlite.b) obj);
            case 2:
                return n.lambda$loadCanRepeatSync$8(this.b, this.c, (androidx.sqlite.b) obj);
            case 3:
                return n.lambda$loadNoRepeat$5(this.b, this.c, (androidx.sqlite.b) obj);
            case 4:
                return s0.lambda$loadAllOrderByTitleSync$8(this.b, this.c, (androidx.sqlite.b) obj);
            case 5:
                return s0.lambda$loadAllSongIds$26(this.b, this.c, (androidx.sqlite.b) obj);
            case 6:
                return s0.lambda$loadBy$6(this.b, this.c, (androidx.sqlite.b) obj);
            case 7:
                return s0.lambda$loadAudioCount$10(this.b, this.c, (androidx.sqlite.b) obj);
            case 8:
                return m1.lambda$loadExistOrderByIdAsc$31(this.b, this.c, (androidx.sqlite.b) obj);
            case 9:
                return m2.lambda$loadAllByTitleAscSync$5(this.b, this.c, (androidx.sqlite.b) obj);
            case 10:
                return m2.lambda$loadCount$20(this.b, this.c, (androidx.sqlite.b) obj);
            case 11:
                return m2.lambda$loadBy$4(this.b, this.c, (androidx.sqlite.b) obj);
            default:
                return com.userlabs.xshare.xad.dbdao.c.lambda$loadByIdAndAdSceneSync$4(this.b, this.c, (androidx.sqlite.b) obj);
        }
    }
}
