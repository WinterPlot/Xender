package androidx.work.impl.model;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;

    public /* synthetic */ w(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return x.deleteAll$lambda$3("DELETE FROM WorkProgress", (androidx.sqlite.b) obj);
            case 1:
                return f0.getAllUnfinishedWork$lambda$21("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", (androidx.sqlite.b) obj);
            case 2:
                return Integer.valueOf(f0.countNonFinishedContentUriTriggerWorkers$lambda$36("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", (androidx.sqlite.b) obj));
            case 3:
                return f0.pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$49("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))", (androidx.sqlite.b) obj);
            case 4:
                return Boolean.valueOf(f0.hasUnfinishedWorkFlow$lambda$22("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", (androidx.sqlite.b) obj));
            case 5:
                return Integer.valueOf(f0.resetScheduledState$lambda$48("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)", (androidx.sqlite.b) obj));
            case 6:
                return f0.getScheduledWork$lambda$31("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", (androidx.sqlite.b) obj);
            case 7:
                return f0.getAllWorkSpecIds$lambda$5("SELECT id FROM workspec", (androidx.sqlite.b) obj);
            case 8:
                return f0.getAllWorkSpecIdsLiveData$lambda$6("SELECT id FROM workspec", (androidx.sqlite.b) obj);
            case 9:
                return f0.getRunningWork$lambda$33("SELECT * FROM workspec WHERE state=1", (androidx.sqlite.b) obj);
            case 10:
                return f0.getEligibleWorkForSchedulingWithContentUris$lambda$27("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", (androidx.sqlite.b) obj);
            case 11:
                return androidx.work.impl.utils.u.lambda$getLastCancelAllTimeMillisLiveData$0((Long) obj);
            case 12:
                return com.userlabs.xshare.af.f.lambda$loadCurrentList$3((androidx.sqlite.b) obj);
            case 13:
                return com.userlabs.xshare.af.f.lambda$deleteAll$4((androidx.sqlite.b) obj);
            case 14:
                return com.userlabs.xshare.arch.db.dao.n.lambda$getOfferApkCountLiveData$24((androidx.sqlite.b) obj);
            case 15:
                return com.userlabs.xshare.arch.db.dao.n.lambda$getGrayList$32((androidx.sqlite.b) obj);
            case 16:
                return com.userlabs.xshare.arch.db.dao.n.lambda$getOfferApkListNoRepeatAndMaxVersionCodeSync$23((androidx.sqlite.b) obj);
            case 17:
                return com.userlabs.xshare.arch.db.dao.n.lambda$loadAll$3((androidx.sqlite.b) obj);
            case 18:
                return com.userlabs.xshare.arch.db.dao.n.lambda$loadIdLimitOne$4((androidx.sqlite.b) obj);
            case 19:
                return com.userlabs.xshare.arch.db.dao.n.lambda$loadMaxIdSync$11((androidx.sqlite.b) obj);
            case 20:
                return com.userlabs.xshare.arch.db.dao.n.lambda$getOfferPkgs$17((androidx.sqlite.b) obj);
            case 21:
                return com.userlabs.xshare.arch.db.dao.n.lambda$getBlackList$33((androidx.sqlite.b) obj);
            case 22:
                return com.userlabs.xshare.arch.db.dao.n.lambda$getAllPathSync$13((androidx.sqlite.b) obj);
            case 23:
                return com.userlabs.xshare.arch.db.dao.n.lambda$getAllSync$12((androidx.sqlite.b) obj);
            case 24:
                return com.userlabs.xshare.arch.db.dao.s.lambda$loadAllSync$3((androidx.sqlite.b) obj);
            case 25:
                return com.userlabs.xshare.arch.db.dao.s.lambda$loadNeedUploadHasActivatedOrderByInstalledTimeLimit30DataSync$8((androidx.sqlite.b) obj);
            case 26:
                return com.userlabs.xshare.arch.db.dao.s.lambda$updateUpStateFromUploadingToNormal$11((androidx.sqlite.b) obj);
            case 27:
                return com.userlabs.xshare.arch.db.dao.s.lambda$getAppsActivated$5((androidx.sqlite.b) obj);
            case 28:
                return com.userlabs.xshare.arch.db.dao.w.lambda$loadSystem$11((androidx.sqlite.b) obj);
            default:
                return com.userlabs.xshare.arch.db.dao.w.lambda$getGrayList$15((androidx.sqlite.b) obj);
        }
    }
}
