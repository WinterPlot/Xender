package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ d(int i, List list, String str) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        String str = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return n.lambda$getApksByPkgs$27(str, list, bVar);
            case 1:
                return n.lambda$getPkgsByPkgs$26(str, list, bVar);
            case 2:
                return n.lambda$getAllOfferApks$16(str, list, bVar);
            case 3:
                return n.lambda$getOfferPkgs$18(str, list, bVar);
            case 4:
                return n.lambda$getEntitiesByPackageNames$30(str, list, bVar);
            case 5:
                return n.lambda$deleteInPaths$41(str, list, bVar);
            case 6:
                return s.lambda$deleteByPnList$9(str, list, bVar);
            case 7:
                return w.lambda$getAppsByPkgs$14(str, list, bVar);
            case 8:
                return w.lambda$getPkgsByPkgs$13(str, list, bVar);
            case 9:
                return z.lambda$deleteByPackageNameList$8(str, list, bVar);
            case 10:
                return s0.lambda$deleteByIdList$47(str, list, bVar);
            case 11:
                return s0.lambda$loadDataListByIdsSync$40(str, list, bVar);
            case 12:
                return s0.lambda$deleteByPathList$46(str, list, bVar);
            case 13:
                return s0.lambda$loadDataListByIPathsSync$41(str, list, bVar);
            case 14:
                return s0.lambda$deleteByFolderPath$49(str, list, bVar);
            case 15:
                return f1.lambda$deleteByIdList$18(str, list, bVar);
            case 16:
                return f1.lambda$deleteInPaths$17(str, list, bVar);
            case 17:
                return i1.lambda$loadMappingByIdList$3(str, list, bVar);
            case 18:
                return m1.lambda$updateDeleteColumnToDeleted$35(str, list, bVar);
            case 19:
                return m1.lambda$updateExistColumnToNotExistByPathList$32(str, list, bVar);
            case 20:
                return m1.lambda$loadMetaInfoByPathList$29(str, list, bVar);
            case 21:
                return m1.lambda$updateCanInstallStatusToFalseByPathList$33(str, list, bVar);
            case 22:
                return m1.lambda$loadDataByFilePathListSync$5(str, list, bVar);
            case 23:
                return m1.lambda$getPathsByPaths$23(str, list, bVar);
            case 24:
                return m1.lambda$loadApks$24(str, list, bVar);
            case 25:
                return z1.lambda$loadDataByPath$4(str, list, bVar);
            case 26:
                return z1.lambda$loadByDirNameListSync$15(str, list, bVar);
            case 27:
                return z1.lambda$loadDataByIdsSync$8(str, list, bVar);
            case 28:
                return z1.lambda$deleteByIdList$21(str, list, bVar);
            default:
                return j2.lambda$deleteInPaths$3(str, list, bVar);
        }
    }
}
