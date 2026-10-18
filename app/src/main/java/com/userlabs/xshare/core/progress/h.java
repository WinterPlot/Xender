package com.userlabs.xshare.core.progress;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class h {
    private long a = 0;
    private long b = 0;
    private long c = 0;

    public float getAverageSpeed() {
        long j = this.c;
        if (j == 0) {
            return 0.0f;
        }
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("total_speed_cal", "getAverageSpeed finishedBytes:" + this.a + " time: " + j);
        }
        return (this.a / j) * 1000.0f;
    }

    public long getFinishedBytes() {
        return this.a;
    }

    public long getTotalSize() {
        return this.b;
    }

    public long getTransferredTimeMills() {
        return this.c;
    }

    public synchronized void updateFinishedBytes(long j) {
        try {
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.d("total_speed_cal", "updateFinishedBytes---finishedBytes:" + j);
            }
            this.a = j;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void updateTotalSize(long j) {
        try {
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.d("total_speed_cal", "updateTotalSize:" + j);
            }
            this.b = j;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void updateTransferredTimeMills(long j) {
        try {
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.d("total_speed_cal", "updateTransferredTimeMills:" + j);
            }
            this.c = j;
        } catch (Throwable th) {
            throw th;
        }
    }
}
