package com.userlabs.xshare.range;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ c(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return d.lambda$updateETag$5(this.b, this.c, (androidx.sqlite.b) obj);
            case 1:
                return d.lambda$updateRealPath$6(this.b, this.c, (androidx.sqlite.b) obj);
            case 2:
                return g.lambda$updateETag$10(this.b, this.c, (androidx.sqlite.b) obj);
            case 3:
                return g.lambda$delete$4(this.b, this.c, (androidx.sqlite.b) obj);
            case 4:
                return g.lambda$updatePath$11(this.b, this.c, (androidx.sqlite.b) obj);
            case 5:
                return com.userlabs.xshare.videoplayer.db.h.lambda$updateSelectedAudioTackByPath$12(this.b, this.c, (androidx.sqlite.b) obj);
            default:
                return com.userlabs.xshare.videoplayer.db.h.lambda$updateSelectedSubtitleTackByPath$11(this.b, this.c, (androidx.sqlite.b) obj);
        }
    }
}
