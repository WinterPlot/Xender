package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v1(String str, String str2, long j) {
        this.a = 2;
        this.b = str;
        this.d = str2;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        long j = this.c;
        Object obj2 = this.d;
        String str = this.b;
        switch (i) {
            case 0:
                return z1.lambda$loadScreenshotsCountSync$13(str, j, (List) obj2, (androidx.sqlite.b) obj);
            case 1:
                return com.userlabs.xshare.playlist.db.d.lambda$removeSongsFromPlaylistBySongIds$9(str, j, (List) obj2, (androidx.sqlite.b) obj);
            default:
                return com.userlabs.xshare.playlist.db.j.lambda$updatePlayList$9(str, (String) obj2, j, (androidx.sqlite.b) obj);
        }
    }

    public /* synthetic */ v1(String str, long j, List list, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = list;
    }
}
