package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ List f;

    public /* synthetic */ l0(int i, int i2, int i3, long j, String str, List list) {
        this.a = i3;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return s0.lambda$loadAllOrderByTitleSync$7(this.b, this.c, this.d, this.e, this.f, (androidx.sqlite.b) obj);
            case 1:
                return s0.lambda$loadAudioCount$9(this.b, this.c, this.d, this.e, this.f, (androidx.sqlite.b) obj);
            default:
                return s0.lambda$loadAllSongIds$25(this.b, this.c, this.d, this.e, this.f, (androidx.sqlite.b) obj);
        }
    }
}
