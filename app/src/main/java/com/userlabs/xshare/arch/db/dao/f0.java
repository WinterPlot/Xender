package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ f0(long j, int i, int i2, int i3) {
        this.a = 1;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return s0.lambda$loadAudioListByCursor$29(this.c, this.d, this.b, this.e, (androidx.sqlite.b) obj);
            case 1:
                int i = this.c;
                int i2 = this.d;
                return z1.lambda$loadPhotoCountSync$12(this.b, i, i2, this.e, (androidx.sqlite.b) obj);
            default:
                return m2.lambda$loadByCursorLimit$14(this.c, this.d, this.b, this.e, (androidx.sqlite.b) obj);
        }
    }

    public /* synthetic */ f0(int i, int i2, long j, int i3, int i4) {
        this.a = i4;
        this.c = i;
        this.d = i2;
        this.b = j;
        this.e = i3;
    }
}
