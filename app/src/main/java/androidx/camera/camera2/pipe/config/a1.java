package androidx.camera.camera2.pipe.config;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ a1(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                c1.provideThreads$lambda$3(arrayList);
                break;
            case 1:
                com.userlabs.xshare.core.pc.client.arch.a.lambda$getStringApps$0(arrayList);
                break;
            case 2:
                com.userlabs.xshare.core.pc.client.arch.c.lambda$getStringAudios$1(arrayList);
                break;
            case 3:
                com.userlabs.xshare.core.pc.client.arch.e.lambda$getDataByType$1(arrayList);
                break;
            case 4:
                com.userlabs.xshare.core.pc.client.arch.h.lambda$loadVideoInfo$1(arrayList);
                break;
            case 5:
                com.userlabs.xshare.core.pc.event.d.lambda$getAppDetail$2(arrayList);
                break;
            case 6:
                com.userlabs.xshare.core.pc.event.d.lambda$getVideoDetail$0(arrayList);
                break;
            case 7:
                com.userlabs.xshare.core.utils.w.lambda$getStorageListByPathForPc$6(arrayList);
                break;
            case 8:
                com.userlabs.xshare.core.utils.document.b.lambda$addLatest100File$1(arrayList);
                break;
            default:
                com.userlabs.xshare.multiplatformconnection.db.d.lambda$insertFileInfoDataList$0(arrayList);
                break;
        }
    }
}
