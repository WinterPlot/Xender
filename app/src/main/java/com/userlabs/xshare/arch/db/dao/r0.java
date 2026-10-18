package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ r0(int i, int i2, int i3, int i4, int i5) {
        this.a = i5;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return s0.lambda$loadAudioListByPageNum$37(this.b, this.c, this.d, this.e, (androidx.sqlite.b) obj);
            default:
                return m2.lambda$loadByPageNum$16(this.b, this.c, this.d, this.e, (androidx.sqlite.b) obj);
        }
    }
}
