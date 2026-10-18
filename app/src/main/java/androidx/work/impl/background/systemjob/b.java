package androidx.work.impl.background.systemjob;

import android.app.job.JobScheduler;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
final class b {
    public static final b a = new b();

    private b() {
    }

    public final JobScheduler forNamespace(JobScheduler jobScheduler) {
        jobScheduler.getClass();
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }
}
