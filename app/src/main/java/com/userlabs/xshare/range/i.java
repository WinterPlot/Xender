package com.userlabs.xshare.range;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RangeTaskRepository b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ i(RangeTaskRepository rangeTaskRepository, String str, String str2, int i) {
        this.a = i;
        this.b = rangeTaskRepository;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        RangeTaskRepository rangeTaskRepository = this.b;
        switch (i) {
            case 0:
                rangeTaskRepository.lambda$updateETag$5(str2, str);
                break;
            default:
                rangeTaskRepository.lambda$updateFilePath$6(str2, str);
                break;
        }
    }
}
