package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (this.a) {
            case 0:
                return w.lambda$loadAll$4(bVar);
            case 1:
                return w.lambda$getAllSync$7(bVar);
            case 2:
                return w.lambda$getAllUpdateKey$10(bVar);
            case 3:
                return w.lambda$getBlackList$16(bVar);
            case 4:
                return w.lambda$getAllPnSync$9(bVar);
            case 5:
                return w.lambda$getAllOrderByDisplayNameSync$8(bVar);
            case 6:
                return z.lambda$deleteAll$7(bVar);
            case 7:
                return s0.lambda$clear$48(bVar);
            case 8:
                return s0.lambda$loadAllIdsSync$5(bVar);
            case 9:
                return s0.lambda$loadDirData$19(bVar);
            case 10:
                return s0.lambda$loadMaxIdSync$16(bVar);
            case 11:
                return s0.lambda$loadPhoneCopyAudio$20(bVar);
            case 12:
                return w0.lambda$loadAll$2(bVar);
            case 13:
                return w0.lambda$loadAllSync$3(bVar);
            case 14:
                return y0.lambda$loadAllNotReport$2(bVar);
            case 15:
                return f1.lambda$clear$19(bVar);
            case 16:
                return f1.lambda$loadMaxId$4(bVar);
            case 17:
                return f1.lambda$loadMaxIdSync$3(bVar);
            case 18:
                return f1.lambda$loadAllIdsSync$16(bVar);
            case 19:
                return i1.lambda$deleteAll$4(bVar);
            case 20:
                return m1.lambda$getTransferredAudioSize$20(bVar);
            case 21:
                return m1.lambda$getTransferredAppSize$18(bVar);
            case 22:
                return m1.lambda$loadTransferredAndFileExistCountSync$14(bVar);
            case 23:
                return m1.lambda$getTransferredVideoSize$19(bVar);
            case 24:
                return m1.lambda$getReceivedCount$16(bVar);
            case 25:
                return m1.lambda$getSentCount$17(bVar);
            case 26:
                return m1.lambda$updateAllDeleteColumnToDeleted$36(bVar);
            case 27:
                return m1.lambda$updateUpStateFromUploadingToNormal$37(bVar);
            case 28:
                return m1.lambda$getTransferredOtherSize$22(bVar);
            default:
                return m1.lambda$getTransferredPhotoSize$21(bVar);
        }
    }
}
