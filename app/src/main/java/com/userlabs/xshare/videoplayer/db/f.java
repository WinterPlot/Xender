package com.userlabs.xshare.videoplayer.db;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ f(h hVar, String str, String str2, int i) {
        this.a = i;
        this.b = hVar;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        h hVar = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return hVar.lambda$removeSubtitleFile$6(str2, str, bVar);
            case 1:
                return hVar.lambda$addNewAISubtitleFile$5(str2, str, bVar);
            default:
                return hVar.lambda$addNewExternalSubtitleFile$4(str2, str, bVar);
        }
    }
}
