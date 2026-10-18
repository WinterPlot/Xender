package com.userlabs.xshare.range;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RangeTaskRepository b;
    public final /* synthetic */ a c;
    public final /* synthetic */ String d;

    public /* synthetic */ j(RangeTaskRepository rangeTaskRepository, a aVar, String str, int i) {
        this.a = i;
        this.b = rangeTaskRepository;
        this.c = aVar;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        a aVar = this.c;
        RangeTaskRepository rangeTaskRepository = this.b;
        switch (i) {
            case 0:
                rangeTaskRepository.lambda$updateFolderDetailInfoETag$9(aVar, str);
                break;
            default:
                rangeTaskRepository.lambda$updateFolderDetailInfoRealPath$10(aVar, str);
                break;
        }
    }
}
