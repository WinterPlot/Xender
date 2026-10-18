package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ o0(int i, long j, int i2) {
        this.a = 2;
        this.c = i;
        this.b = j;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int i = this.c;
                return s0.lambda$loadAudioCountSync$12(this.b, i, this.d, (androidx.sqlite.b) obj);
            case 1:
                int i2 = this.c;
                return m2.lambda$loadVideoCountSync$8(this.b, i2, this.d, (androidx.sqlite.b) obj);
            default:
                return com.userlabs.xshare.push.db.c.lambda$loadNotPostEventsByEventType$5(this.c, this.b, this.d, (androidx.sqlite.b) obj);
        }
    }

    public /* synthetic */ o0(long j, int i, int i2, int i3) {
        this.a = i3;
        this.b = j;
        this.c = i;
        this.d = i2;
    }
}
