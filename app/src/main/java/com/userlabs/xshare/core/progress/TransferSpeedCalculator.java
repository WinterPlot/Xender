package com.userlabs.xshare.core.progress;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class TransferSpeedCalculator {
    private int a;
    private float[] b;
    float f;
    private int g;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private float h = 0.0f;
    protected long i = 0;
    private long j = 0;
    private Status k = Status.stop;
    private long l = 0;
    private long m = 0;
    private boolean n = false;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum Status {
        stop,
        start,
        pause
    }

    public TransferSpeedCalculator(int i, int i2) {
        this.a = 16;
        int i3 = i / i2;
        this.a = i3;
        this.b = new float[i3];
        this.g = i2;
    }

    public long getAllFinished() {
        return this.i;
    }

    public long getLatestFinishedBytes() {
        return this.l;
    }

    public float getMovingAverage() {
        return this.f;
    }

    public long getTotalTransferTime() {
        Status status = this.k;
        if (status == Status.stop || status == Status.pause || this.n) {
            return this.m;
        }
        return (System.currentTimeMillis() - this.j) + this.m;
    }

    public synchronized void insert(long j) {
        try {
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.d("TransferSpeedCalculator", "timer---insert data:" + j);
            }
            if (isFull()) {
                float f = this.h;
                float[] fArr = this.b;
                int i = this.c;
                this.h = f - fArr[i];
                this.c = (i + 1) % this.a;
            } else {
                this.e++;
            }
            float f2 = j;
            this.b[this.d] = f2;
            this.h += f2;
            this.i += j;
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.d("TransferSpeedCalculator", "timer---insert total:" + this.i);
            }
            this.d = (this.d + 1) % this.a;
            this.f = (this.h / (this.e * this.g)) * 1000.0f;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isFull() {
        return this.e == this.a;
    }

    public boolean isStarted() {
        return this.k == Status.start;
    }

    public void pause() {
        if (this.k == Status.start) {
            if (!this.n) {
                this.m = (System.currentTimeMillis() - this.j) + this.m;
            }
            this.j = 0L;
            this.k = Status.pause;
        }
    }

    public void setTotalTransferTime(long j) {
        if (j > 0) {
            this.m = j;
            this.n = true;
        }
    }

    public void start() {
        Status status = this.k;
        if (status == Status.stop || status == Status.pause) {
            this.j = System.currentTimeMillis();
            this.k = Status.start;
        }
    }

    public void stop() {
        Status status = this.k;
        Status status2 = Status.stop;
        if (status != status2) {
            this.k = status2;
            if (!this.n) {
                this.m = (System.currentTimeMillis() - this.j) + this.m;
            }
            this.j = 0L;
            this.f = 0.0f;
        }
    }

    public synchronized void updateFinishedBytes(long j) {
        insert(Math.max(0L, j - this.l));
    }

    public synchronized void updateLastFinishedFinished(long j) {
        this.l = j;
    }
}
