package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
final class a {
    public static final a a = new a();

    private a() {
    }

    public final List<JobInfo> getAllPendingJobs(JobScheduler jobScheduler) {
        jobScheduler.getClass();
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        allPendingJobs.getClass();
        return allPendingJobs;
    }
}
