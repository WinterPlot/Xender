package com.userlabs.xshare.videoplayer.db;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ a(b bVar, String str, String str2, int i) {
        this.a = i;
        this.b = bVar;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.lambda$selectAudioTrack$6(str2, str);
                break;
            case 1:
                bVar.lambda$addNewAISubtitle$3(str2, str);
                break;
            case 2:
                bVar.lambda$addNewExternalSubtitle$2(str2, str);
                break;
            case 3:
                bVar.lambda$selectSubtitleTrack$5(str2, str);
                break;
            default:
                bVar.lambda$removeSubtitle$4(str2, str);
                break;
        }
    }
}
